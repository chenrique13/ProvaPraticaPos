package quesitoDois;
import java.util.Random;

import quesitoUm.Almanaque;
import quesitoUm.Livro;
import quesitoUm.Pessoa;

public class Principal {

	public static void main(String[] args) {
		// 2A
		Pessoa p1 = new Pessoa("Carlos", 25, "masculino");
		Pessoa p2 = new Pessoa("Jessica", 25, "feminino");

		// 2B
		Livro l1 = new Livro("Titulo1", "Autor1", 10);
		ligandoLivroPessoa(p1, l1);
		Livro l2 = new Livro("Titulo2", "Autor2", 20);
		ligandoLivroPessoa(p2, l2);
		Livro l3 = new Livro("Titulo3", "Autor3", 30);
		ligandoLivroPessoa(p1, l3);

		// 2C
		Almanaque a1 = new Almanaque("Titulo4", "Autor4", 15);
		ligandoLivroPessoa(p1, a1);
		Almanaque a2 = new Almanaque("Titulo5", "Autor5", 25);
		ligandoLivroPessoa(p2, a2);

		// 2D
		System.out.println("Detalhes: Titulo, Autor, Total de paginas, Aberto, Nome da pessoa");
		System.out.println(l1.detalhes());
		System.out.println(l2.detalhes());
		System.out.println(l3.detalhes());
		System.out.println(a1.detalhes());
		System.out.println(a2.detalhes());
		System.out.println();

		//2E
		Random gerador1 = new Random();
		
		l1.abrir();
		l1.avancarPagina();
		l1.avancarPagina();
		l1.avancarPagina();
		l1.avancarPagina();
		l1.folhear(gerador1.nextInt(11));
		l1.voltarPagina();
		l1.avancarPagina();
		
		l2.abrir();
		l2.avancarPagina();
		l2.folhear(gerador1.nextInt(21));
		l2.voltarPagina();
		
		l3.abrir();
		l3.avancarPagina();
		l3.avancarPagina();
		l3.folhear(gerador1.nextInt(31));
		
		a1.abrir();
		a1.avancarPagina();
		a1.avancarPagina();		
		a1.avancarPagina();
		a1.voltarPagina();
		a1.avancarPagina();
		a1.folhear(gerador1.nextInt(16));

		a2.abrir();
		a2.avancarPagina();
		a2.folhear(gerador1.nextInt(26));
		
		System.out.println();
		
		// 2F
		System.out.println("Detalhes: Titulo, Autor, Total de paginas, Pagina atual, Aberto, Nome da pessoa");
		System.out.println(l1.detalhes());
		System.out.println(l2.detalhes());
		System.out.println(l3.detalhes());
		System.out.println(a1.detalhes());
		System.out.println(a2.detalhes());
	}

	private static void ligandoLivroPessoa(Pessoa pessoa, Livro livro) {
		try {
			livro.setPessoa(pessoa);
			pessoa.getLivros().add(livro);

		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

}

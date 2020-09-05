package quesitoUm;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {

	private String nome;
	private int idade;
	private String sexo;
	private List<Livro> livros;

	public Pessoa() {
		super();
		this.livros = new ArrayList<>();
	}
	
	public Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.livros = new ArrayList<Livro>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public void fazerAniversario() {
		this.setIdade(this.getIdade() + 1);
	}
}

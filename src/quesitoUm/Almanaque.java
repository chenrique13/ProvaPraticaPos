package quesitoUm;

public class Almanaque extends Livro {

	public Almanaque() {
		super();
	}

	public Almanaque(String titulo, String autor, int totalPaginas) {
		super(titulo, autor, totalPaginas);
	}

	public void folhear(int pagina) {
		if (isAberto() == true) {
			if (this.getPaginaAtual() != 2) {
				System.out.println("E preciso voltar ao indice na pagina 2 para folhear");
			} else {
				super.folhear(pagina);
			}
		} else {
			System.out.println("Livro fechado");
		}
	}

	public void avancarPagina() {
		if (isAberto() == true) {
			if (this.getPaginaAtual() < this.getTotalPaginas()) {
				this.setPaginaAtual(this.getPaginaAtual() + 2);
			} else {
				this.setPaginaAtual(this.getTotalPaginas());
			}
		} else {
			System.out.println("Livro fechado");
		}
	}
}

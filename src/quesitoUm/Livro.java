package quesitoUm;

public class Livro implements Publicacao {

	private String titulo;
	private String autor;
	private int totalPaginas;
	private int paginaAtual;
	private boolean aberto;
	private Pessoa pessoa;

	public Livro() {
		super();
		this.iniciarLivro();
	}

	public Livro(String titulo, String autor, int totalPaginas) {
		super();
		this.iniciarLivro();
		this.titulo = titulo;
		this.autor = autor;
		this.totalPaginas = totalPaginas;
	}

	private void iniciarLivro() {
		this.aberto = false;
		this.paginaAtual = 0;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotalPaginas() {
		return totalPaginas;
	}

	public void setTotalPaginas(int totalpaginas) {
		this.totalPaginas = totalpaginas;
	}

	public int getPaginaAtual() {
		return paginaAtual;
	}

	public void setPaginaAtual(int paginaAtual) {
		this.paginaAtual = paginaAtual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) throws Exception {
		if (this.isAberto() && this.getPessoa() != null) {
			throw new Exception("Livro indisponivel, " + this.getPessoa().getNome() + " esta lendo ele.");
		}
		this.pessoa = pessoa;
	}

	@Override
	public void abrir() {
		this.aberto = true;
		this.paginaAtual = 0;
	}

	@Override
	public void fechar() {
		this.aberto = false;
	}

	@Override
	public void folhear(int pagina) {
		if (isAberto() == true) {
			if (pagina >= 0 && pagina <= this.getTotalPaginas()) {
				System.out.println("Pagina atual: " + this.getPaginaAtual());
				this.setPaginaAtual(pagina);
			} else {
				System.out.println("Numero da pagina invalido!");
			}
		} else {
			System.out.println("Livro fechado");
		}
	}

	@Override
	public void avancarPagina() {
		if (isAberto() == true) {
			if (this.getPaginaAtual() < this.getTotalPaginas()) {
				this.setPaginaAtual(this.getPaginaAtual() + 1);
			} else {
				this.setPaginaAtual(this.getTotalPaginas());
			}
		} else {
			System.out.println("Livro fechado");
		}
	}

	@Override
	public void voltarPagina() {
		if (isAberto() == true) {
			if (this.getPaginaAtual() <= 0) {
				this.setPaginaAtual(0);
			} else {
				this.setPaginaAtual(this.getPaginaAtual() - 1);
			}
		} else {
			System.out.println("Livro fechado");
		}
	}

	public String detalhes() {
		String detalhes = this.getTitulo() + "," + this.getAutor() + "," + this.getTotalPaginas() + ","
				+ this.getPaginaAtual() + "," + this.isAberto() + "," + this.pessoa.getNome();
		return detalhes;
	}

}

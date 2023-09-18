package aula07;

public class Livro {
	private int idLivro;
	private String titulo;
	private String ISBN;
	private int numeroPaginas;
	private Editora editora;
	private Genero genero;
	public Livro(int idLivro, String titulo, String iSBN, int numeroPaginas, Editora editora, Genero genero) {
		super();
		this.idLivro = idLivro;
		this.titulo = titulo;
		ISBN = iSBN;
		this.numeroPaginas = numeroPaginas;
		this.editora = editora;
		this.genero = genero;
	}
	
	public int getIdLivro() {
		return idLivro;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
}

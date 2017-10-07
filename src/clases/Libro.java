package clases;

public class Libro {
	private String isbn;
	private String titulo;
	private String autor;
	private int nroPaginas;
	
	
	
	public Libro(String isbn, String titulo, String autor, int nroPaginas) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.nroPaginas = nroPaginas;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
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
	public int getNroPaginas() {
		return nroPaginas;
	}
	public void setNroPaginas(int nroPaginas) {
		this.nroPaginas = nroPaginas;
	}
	
	@Override
	public String toString() {
		return "El libro: "+titulo+ " con isbn: " + isbn + " creado por el autor: " + autor + " tiene " + nroPaginas+ " paginas.";
	}
	
	
	
}

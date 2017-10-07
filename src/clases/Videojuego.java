package clases;

import interfaces.Entregable;

public class Videojuego implements Entregable{
	protected final static int HORAS_DEF = 10;
	
	private String titulo;
	private int horas;
	private boolean entregado;
	private String genero;
	private String compañia;
	
	public Videojuego(){
		this("", HORAS_DEF, "", "");
	}
	
	public Videojuego(String titulo, int horas){
		this(titulo,horas,"","");
	}
	
	public Videojuego(String titulo, int horas, String genero, String compañia) {
		this.titulo = titulo;
		this.horas = horas;
		this.entregado = false;
		this.genero = genero;
		this.compañia = compañia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	
	
	
	@Override
	public String toString() {
		return "titulo: " + titulo + ", horas: " + horas + ", entregado: " + entregado + ", genero: "
				+ genero + ", compañia: " + compañia;
	}

	public void entregar(){
		entregado = true;
	}

	
	public void devolver() {
		entregado = false;
		
	}

	
	public boolean isEntregado() {
		if(entregado)
			return true;
		else
			return false;
		
	}

	public int compareTo(Object a) {
		int estado = -1;
		Videojuego ref = (Videojuego) a; 
		
		if(horas > ref.getHoras()){
			estado = 1;
		}else 
			if ( horas == ref.getHoras()){
				estado = 0;
			}
		return estado;
	}
	
	
	
	
	
}

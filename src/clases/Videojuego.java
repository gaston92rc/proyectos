package clases;

import interfaces.Entregable;

public class Videojuego implements Entregable{
	protected final static int HORAS_DEF = 10;
	
	private String titulo;
	private int horas;
	private boolean entregado;
	private String genero;
	private String compa�ia;
	
	public Videojuego(){
		this("", HORAS_DEF, "", "");
	}
	
	public Videojuego(String titulo, int horas){
		this(titulo,horas,"","");
	}
	
	public Videojuego(String titulo, int horas, String genero, String compa�ia) {
		this.titulo = titulo;
		this.horas = horas;
		this.entregado = false;
		this.genero = genero;
		this.compa�ia = compa�ia;
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

	public String getCompa�ia() {
		return compa�ia;
	}

	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
	}
	
	
	
	@Override
	public String toString() {
		return "titulo: " + titulo + ", horas: " + horas + ", entregado: " + entregado + ", genero: "
				+ genero + ", compa�ia: " + compa�ia;
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

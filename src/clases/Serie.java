package clases;

public class Serie {
	protected final static int NRO_TEMPORADA_DEF = 3;
	
	private String titulo;
	private int nroTemporada;
	private boolean entregado;
	private String genero;
	private String creador;
	
	public Serie(){
		this("", NRO_TEMPORADA_DEF,  "", "");
	}
	public Serie(String titulo, String creador){
		this(titulo, NRO_TEMPORADA_DEF, "", creador);
	}
	
	public Serie(String titulo, int nroTemporada, String genero, String creador) {
		this.titulo = titulo;
		this.nroTemporada = nroTemporada;
		this.entregado = false;
		this.genero = genero;
		this.creador = creador;
	}
	public String getTitulo() {
		return titulo;
	}
	public int getNroTemporada() {
		return nroTemporada;
	}
	public String getGenero() {
		return genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setNroTemporada(int nroTemporada) {
		this.nroTemporada = nroTemporada;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	@Override
	public String toString() {
		return "titulo: " + titulo + ", nroTemporada: " + nroTemporada + ", entregado: " + entregado
				+ ", genero: " + genero + ", creador: " + creador;
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
		Serie ref = (Serie) a; 
		
		if(nroTemporada > ref.getNroTemporada()){
			estado = 1;
		}else 
			if ( nroTemporada == ref.getNroTemporada()){
				estado = 0;
			}
		return estado;
	}
	
	
	
	

}

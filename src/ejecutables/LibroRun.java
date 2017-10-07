package ejecutables;

import clases.Libro;

public class LibroRun {

	public static void main(String[] args) {
		Libro l1 = new Libro("9788496422612", "Game of Thrones - Cancion de hielo y Fuego","George R. R. Martin", 726);
		Libro l2 = new Libro("9788496208681","Game of Thrones - Choque de Reyes","George R. R. Martin",928);
		
		System.out.println(l1);
		System.out.println(l2);
		System.out.println("---------------------------------------------------------------"
				+ "-------------------------------------------------------------------------");
		hasMorePages(l1, l2);
		

	}

	private static void hasMorePages(Libro l1, Libro l2) {
		if(l1.getNroPaginas()>l2.getNroPaginas())
			System.out.println("El libro: "+l1.getTitulo()+" tiene mas paginas.");
		else 
			System.out.println("El libro: "+l2.getTitulo()+" tiene mas paginas.");
	}

}

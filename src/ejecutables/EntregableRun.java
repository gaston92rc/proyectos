package ejecutables;

import clases.Serie;
import clases.Videojuego;

public class EntregableRun {

	public static void main(String[] args) {
		
		Serie listaSerie[] = new Serie[5];
		Videojuego listaVJ[] = new Videojuego[5];
		int sumaSerie = 0;
		int sumaVJ = 0;
		
		listaSerie[0] = new Serie();
		listaSerie[1] = new Serie("Game Of Thrones",7,"Fantasia Medieval", "George R. R. Martin");
		listaSerie[2] = new Serie("Daredevil", 5, "Accion", "Stan Lee");
		listaSerie[3] = new Serie("Blindspot", "Martin Gero");
		listaSerie[4] = new Serie("Mr. Robot", 2, "Hackers", "Sam Esmail");
		
		listaVJ[0] = new Videojuego();
		listaVJ[1] = new Videojuego("Fifa 17", 15, "Futbol", "EA SPORT");
		listaVJ[2] = new Videojuego("Pokemon Go", 89);
		listaVJ[3] = new Videojuego("Mortal Kobat X", 45, "Pelea", "Gaston Cuesta");
		listaVJ[4] = new Videojuego("Sudoku", 10) {
		};
		
		listaSerie[2].entregar();
		listaSerie[4].entregar();
		
		listaVJ[3].entregar();
		
		for(int i = 0 ; i < listaSerie.length ; i++){
			if(listaSerie[i].isEntregado()){
				sumaSerie++;	
				listaSerie[i].devolver();
			}
		
		}
		for(int i = 0 ; i < listaVJ.length ; i ++){
			if(listaVJ[i].isEntregado()){
				sumaVJ++;
				listaVJ[i].devolver();
			}
		}
		System.out.printf("Se han entregado %d Series \n",sumaSerie);
		System.out.printf("Se han entregado %d Videojuegos\n",sumaVJ);
		System.out.println("----------------------------------");
		
		Serie serieMayor = listaSerie[0];
        Videojuego videojuegoMayor = listaVJ[0];
  
        //Recorremos el array desde la posicion 1 (no 0), comparando el mayor con las posiciones del array
        for(int i = 1 ; i < listaSerie.length ; i++){
            if(listaSerie[i].compareTo(serieMayor) == 1){
                serieMayor = listaSerie[i];
            }
        }
        for(int i = 1 ; i < listaVJ.length ; i++){
            if(listaVJ[i].compareTo(videojuegoMayor) == 1){
                videojuegoMayor = listaVJ[i];
            }
  
        }
  
        //Mostramos toda la informacion del videojuego y serie mayor
        System.out.println("\nEl videojuego con mayor horas es:");
        System.out.println(videojuegoMayor+"\n");
        System.out.println("La serie con mas temporadas es:");
        System.out.println(serieMayor+"\n");
		
		
	
	}

}

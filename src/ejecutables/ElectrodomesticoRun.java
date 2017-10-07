package ejecutables;

import clases.Electrodomestico;
import clases.Lavadora;
import clases.Television;

public class ElectrodomesticoRun {

	public static void main(String[] args) {
		Electrodomestico listaElectrodomesticos[] = new Electrodomestico[10];
		
		listaElectrodomesticos[0]=new Electrodomestico(200,"Verde", 'C', 80);
        listaElectrodomesticos[1]=new Lavadora(150, 30);
        listaElectrodomesticos[2]=new Television(500, "negro", 'E', 80, 42, false);
        listaElectrodomesticos[3]=new Electrodomestico();
        listaElectrodomesticos[4]=new Electrodomestico(1500,"Negro", 'A', 95);
        listaElectrodomesticos[5]=new Lavadora(200,"Blanco", 'C', 80, 40);
        listaElectrodomesticos[6]=new Television(250, 70);
        listaElectrodomesticos[7]=new Lavadora(400, "verde", 'A',100 , 15);
        listaElectrodomesticos[8]=new Television(200, "naranja", 'C',60 , 30, true);
        listaElectrodomesticos[9]=new Electrodomestico(50, 10);

        double sumaElectro = 0;
        double sumaLavadora = 0;
        double sumaTelevision = 0;
        
        for(int i = 0; i < listaElectrodomesticos.length ; i++){
        	
        	if(listaElectrodomesticos[i] instanceof Electrodomestico){
        		sumaElectro +=  listaElectrodomesticos[i].precioFinal();
        	}
        	if(listaElectrodomesticos[i] instanceof Television){
        		sumaTelevision +=  listaElectrodomesticos[i].precioFinal();
        	}
        	if(listaElectrodomesticos[i] instanceof Lavadora)
        		sumaLavadora +=  listaElectrodomesticos[i].precioFinal();
        	
        }
        System.out.println("La suma del precio de los Electrodomesticos es de "+sumaElectro);
        System.out.println("La suma del precio de las Lavadoras es de "+sumaLavadora);
        System.out.println("La suma del precio de las Televisiones es de "+sumaTelevision);
   

	}
	
	
}

package ejecutables;

import clases.Cuenta;

public class CuentaRun {

	public static void main(String[] args) {
		
		Cuenta c1 = new Cuenta("Gaston Cuesta");
		Cuenta c2 = new Cuenta("Marlene Morrone",135);
		Cuenta c3 = new Cuenta("Luis Cuesta",255.23);
		Cuenta c4 = new Cuenta("Lucas Cuesta");
	
		c1.setCantidad(10);
		c4.ingresar(588);
		c3.retirar(50);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		

		;
		
	}

}

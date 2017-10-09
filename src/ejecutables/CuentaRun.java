package ejecutables;

import javax.swing.JOptionPane;

import clases.Cuenta;

public class CuentaRun {

	public static void main(String[] args) {
		
		Cuenta c1 = new Cuenta("Gaston Cuesta");
		Cuenta c2 = new Cuenta("Marlene Morrone",135);
		Cuenta c3 = new Cuenta("Luis Cuesta",255.23);
		Cuenta c4 = new Cuenta("Lucas Cuesta");
		int mostrarInfo = 1;
		
		int opcion = Integer.parseInt(JOptionPane.showInputDialog("Indique el nro de su cuenta\n"
																+ "1- "+c1.getTitular()+"\n"
																+ "2- "+c2.getTitular()+"\n"
																+ "3- "+c3.getTitular()+"\n"
																+ "4- "+c4.getTitular()+"\n"));
		int operacion = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer:\n"
																+ "1- Ingresar dinero\n"
																+ "2- Retirar dinero"));
		
		selectOwner(c1, c2, c3, c4, opcion, operacion);
		mostrarInfo = JOptionPane.showConfirmDialog(null, "Desea mostrar el estado de las cuentas?");
		if(mostrarInfo == 0)
			JOptionPane.showMessageDialog(null, c1+"\n"+c2+"\n"+c3+"\n"+c4+"\n");
		
		
	}

	private static void selectOwner(Cuenta c1, Cuenta c2, Cuenta c3, Cuenta c4, int opcion, int operacion) {
		switch(opcion){
		case 1:
			selectOperation(operacion, c1);
			break;
		case 2: 
			selectOperation(operacion, c2);
			break;
		case 3: 
			selectOperation(operacion, c3);
			break;
		case 4: 
			selectOperation(operacion, c4);
			break;
		}
	}
	
	public static void selectOperation(int operacion, Cuenta c){
		switch(operacion){
			case 1:
				c.ingresar(Double.parseDouble(JOptionPane.showInputDialog("Ingrese dinero")));
				break;
			case 2:
				c.retirar(Double.parseDouble(JOptionPane.showInputDialog("Cuanto quiere retirar?")));
				break;
			
		}
	}
	
	

}

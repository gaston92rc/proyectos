package ejecutables;

import javax.swing.JOptionPane;

import clases.Raices;

public class RaicesRun {

	public static void main(String[] args) {
		int a=0;
		int b=0;
		int c=0;
		try {
			a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de a"));
			b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de a"));
			c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de a"));
		} catch (Exception e) {} 
		int resultado = 0;
		
		Raices r = new Raices(a,b,c);
		resultado = r.calcular().indexOf("ERROR");
		if(resultado != -1){
			 JOptionPane.showMessageDialog(null, "Ingreso 0 o no ingreso ningun valor", "ERROR", JOptionPane.ERROR_MESSAGE);
		}else
			JOptionPane.showMessageDialog(null, r.calcular());
		
		

	}
	
	
}

package ejecutables;

import javax.swing.JOptionPane;

import clases.Password;

public class PasswordRun {

	public static void main(String[] args) {
		
		int tama�o = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tama�o del array"));
		int longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tama�o del password"));
		boolean[]  fortalezaPassword = new boolean[tama�o];
		Password listaPassword[] = new Password[tama�o];
		int contFuerte = 0;
		int contDebil = 0;
		
		System.out.printf("Hay %d Contrase�as de %d caracteres \n",tama�o,longitud);
		System.out.println("---------------------------");
		for(int i=0; i<listaPassword.length;i++){
			listaPassword[i]= new Password(longitud);
			fortalezaPassword[i] = listaPassword[i].esFuerte();
			System.out.println(listaPassword[i].getContrase�a()+" "+mensajeFuerte(fortalezaPassword[i]));
			if(fortalezaPassword[i]){
				contFuerte++;
			}else{
				contDebil++;
			}
			
				
		}
		
		System.out.println("---------------------------");
		System.out.printf("Hay %d contrase�as fuertes \nHay %d contrase�as debiles",contFuerte,contDebil);
		
		
	}
	
	public static String mensajeFuerte(boolean p){
		if(p)
			return "Es fuerte";
		else 
			return "Es debil";
	}

}

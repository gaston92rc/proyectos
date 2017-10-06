package ejecutables;

import javax.swing.JOptionPane;

import clases.Password;

public class PasswordRun {

	public static void main(String[] args) {
		
		int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del array"));
		int longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del password"));
		boolean[]  fortalezaPassword = new boolean[tamaño];
		Password listaPassword[] = new Password[tamaño];
		int contFuerte = 0;
		int contDebil = 0;
		
		System.out.printf("Hay %d Contraseñas de %d caracteres \n",tamaño,longitud);
		System.out.println("---------------------------");
		for(int i=0; i<listaPassword.length;i++){
			listaPassword[i]= new Password(longitud);
			fortalezaPassword[i] = listaPassword[i].esFuerte();
			System.out.println(listaPassword[i].getContraseña()+" "+mensajeFuerte(fortalezaPassword[i]));
			if(fortalezaPassword[i]){
				contFuerte++;
			}else{
				contDebil++;
			}
			
				
		}
		
		System.out.println("---------------------------");
		System.out.printf("Hay %d contraseñas fuertes \nHay %d contraseñas debiles",contFuerte,contDebil);
		
		
	}
	
	public static String mensajeFuerte(boolean p){
		if(p)
			return "Es fuerte";
		else 
			return "Es debil";
	}

}

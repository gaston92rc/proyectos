package ejecutables;

import javax.swing.JOptionPane;

import clases.Persona;

public class PersonaRun {

	public static void main(String[] args) {
	//nombre, la edad, sexo, peso y altura.
		String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
		char sexo = (JOptionPane.showInputDialog("Ingrese el sexo H o M")).charAt(0);
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura"));
		
		Persona p1 = new Persona(nombre,edad,sexo,peso,altura);
		Persona p2 = new Persona(nombre,edad,sexo);
		Persona p3 = new Persona();
		
		p2.setPeso(80);
		p2.setAltura(1.97);
		p3.setAltura(1.71);
		p3.setEdad(25);
		p3.setNombre("Gastón");
		p3.setPeso(67);
		p3.setSexo('H');
		
		System.out.println(p1);
		MuestraMensajePeso(p1);
		MuestraMensajeEdad(p1);
		
		System.out.println(p2);
		MuestraMensajePeso(p2);
		MuestraMensajeEdad(p2);
		
		System.out.println(p3);
		MuestraMensajePeso(p3);
		MuestraMensajeEdad(p3);
		
	}
	
	public static void MuestraMensajePeso(Persona p){
		int imc = p.calcularImc();
		switch(imc){
			case Persona.SOBRE_PESO:
				System.out.println("La persona tiene sobre peso");
				break;
			case Persona.INFRA_PESO:
				System.out.println("La persona tiene bajo peso");
				break;
			case Persona.PESO_IDEAL:
				System.out.println("La persona tiene peso ideal");
				break;
		}
		
	}
	
	public static void MuestraMensajeEdad(Persona p){
		if(p.esMayorDeEdad()){
			System.out.println("Es mayor de edad");
		}else{
			System.out.println("Es menor de edad");
		}
	}
	

}

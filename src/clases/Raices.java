package clases;

public class Raices {
	private int a,b,c;

	
	public Raices(int a, int b, int c) {
		if(a!=0)
			this.a = a;
		this.b = b;
		this.c = c;
	}
	public String obtenerRaices(){
		
		double raizUno = (-b + Math.sqrt(getDiscriminante() )) / (2*a) ;
		double raizDos = (-b - Math.sqrt(getDiscriminante() )) / (2*a) ;
		if(Double.isNaN(raizUno) || Double.isNaN(raizDos))
			return "ERROR";
		else
			return ("Las raices son: "+String.format("%.2f", raizUno)+" y "+String.format("%.2f", raizDos));
		
	}
	
	public String obtenerRaiz(){
		double raizUnica = (-b + Math.sqrt(getDiscriminante())) /(2*a);
		if(Double.isNaN(raizUnica)){
			return "ERROR";
		}else
			return ("Raiz doble: "+String.format("%.2f", raizUnica));

	}
	
	public double getDiscriminante(){
		return Math.pow(b, 2) - (4*a*c);
	}
	public boolean tieneRaices(){
		return getDiscriminante() > 0;
	}
	public boolean tieneRaiz(){
		return getDiscriminante() == 0;
	}
	
	public String calcular(){
		if(tieneRaices()){
			return obtenerRaices();
		}else if(tieneRaiz()){
			return obtenerRaiz();
		}else{
			return ("No existe solucion en los reales");
		}
			
	}
	
	
	
	
}

package clases;

public class Electrodomestico {
	
	protected final static String COLOR_DEF = "Blanco";
	protected final static char CONS_ENERG_DEF = 'F';
	protected final static double PRECIO_BASE_DEF= 100;
	protected final static double PESO_DEF = 5;
	
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;
	
	public Electrodomestico() {
		this(PRECIO_BASE_DEF,COLOR_DEF,CONS_ENERG_DEF,PESO_DEF);
	}

	public Electrodomestico(double precioBase, double peso) {
		this(precioBase,COLOR_DEF,CONS_ENERG_DEF,peso);
	}

	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		comprobarColor(color);
		comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}
	
	private void comprobarConsumoEnergetico(char letra){
		if(letra>=65 && letra<=70){
			this.consumoEnergetico = letra;
		}else{
			this.consumoEnergetico = CONS_ENERG_DEF;
		}
	}
	
	private void comprobarColor(String color){
		String colores[] = {"blanco", "negro", "rojo", "azul" ,"gris"};
		boolean encontrado = false;
		
		for(int i = 0 ; i < colores.length ; i++){
			if(colores[i].equals(color))
				encontrado = true;
		}
			if(encontrado){
				this.color = color;
			}else{
				this.color = COLOR_DEF;
			}
	}
	
	public double precioFinal(){
		int plus = 0 ; 
		switch(consumoEnergetico){
			case 'A':
				plus +=100;
				break;
			case 'B':
				plus +=80;
				break;
			case 'C':
				plus +=60;
				break;
			case 'D':
				plus +=50;
				break;
			case 'E':
				plus +=30;
				break;
			case 'F':
				plus +=10;
				break;
		}
		if(peso>=0 && peso <= 19){
			plus+=10;
		}else if(peso >=20 && peso <=49){
			plus+=50;
		}else if(peso>=50 && peso <=79){
			plus+=80;
		}else if(peso>=80){
			plus+=100;
		}
		return plus+precioBase;
	}
	
	

}

package clases;

public class Lavadora extends Electrodomestico{
	
	private final static double CARGA_DEF = 5;
	
	private double carga;
	
	public Lavadora(){
		this(PRECIO_BASE_DEF, COLOR_DEF, CONS_ENERG_DEF, PESO_DEF, CARGA_DEF);
	}
	public Lavadora(double precioBase, double peso) {
		this(precioBase, COLOR_DEF, CONS_ENERG_DEF, peso, CARGA_DEF);
	}
	
	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga){
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }
	public double getCarga() {
		return carga;
	}
	
	public double precioFinal(){
		double plus = super.precioFinal();
		if(peso > 30){
			plus += 50;
		}
		return plus;
	}
	

}

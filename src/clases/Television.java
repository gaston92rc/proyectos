package clases;

public class Television extends Electrodomestico{
	
	protected final static double RESOLUCION_DEF = 20;
	protected final static boolean SINTO_TDT_DEF = false;
	
	private double resolucion;
	private boolean sintonizadorTDT;
	
	public Television(){
		this(PRECIO_BASE_DEF, COLOR_DEF, CONS_ENERG_DEF, PESO_DEF, RESOLUCION_DEF, SINTO_TDT_DEF);
	}
	public Television(double precioBase, double peso) {
		this(precioBase, COLOR_DEF, CONS_ENERG_DEF, peso, RESOLUCION_DEF,SINTO_TDT_DEF);
	}
	public Television(double precioBase, String color, char consumoEnergetico, double peso, double resolucion, boolean sintonizadorTDT){
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }
	public double getResolucion() {
		return resolucion;
	}
	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	public double precioFinal(){
		double plus = super.precioFinal();
		if(resolucion>40)
			plus += precioBase*0.3;
		
		if(isSintonizadorTDT())
			plus += 50;
		return plus;
	}

}

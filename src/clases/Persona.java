package clases;

public class Persona {

	
	private final static char SEXO_DEF = 'H';
	public final static int INFRA_PESO = -1;
	public final static int PESO_IDEAL = 0;
	public final static int SOBRE_PESO = 1;
	
	
	private String nombre;
	private int edad ;
	private String dni;
	private char sexo ;
	private double peso ;
	private double altura ;
	
	public Persona(){
		this("",0,SEXO_DEF,0,0);
	}

	public Persona(String nombre, int edad, char sexo){
		this(nombre, edad, Character.toUpperCase(sexo), 0,0);
	}

	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		
		this.nombre = nombre;
		this.edad = edad;
		generarDni();
		this.sexo = Character.toUpperCase(sexo);
		this.peso = peso;
		this.altura = altura;
		comprobarSexo();
	}
	
	public int calcularImc(){
		double pesoIdeal = ( peso / Math.pow( altura , 2 ) );
		
		if( pesoIdeal < 20 ){
			return INFRA_PESO;
		}else if( pesoIdeal>20 && pesoIdeal<=25){
			return PESO_IDEAL;					
		}else 
			return SOBRE_PESO;
	}
	
	public boolean esMayorDeEdad(){
		if(edad>=18)
			return true;
		else 
			return false;
	}
	
	private void comprobarSexo(){
		if(sexo != 'H' && sexo != 'M'){
			this.sexo = SEXO_DEF;
		}
	}

	@Override
	public String toString() {
		return "La persona nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura ;
	}
	
	private void generarDni() {
        final int divisor = 23;
 
        //Generamos un número de 8 digitos
        int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int res =  (numDNI - (numDNI /divisor * divisor));
 
        //Calculamos la letra del DNI
        char letraDNI = generaLetraDNI(res);
 
        //Pasamos el DNI a String
        dni = Integer.toString(numDNI) + letraDNI;
    }
 
    private char generaLetraDNI(int res) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
 
        return letras[res];
    }


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setSexo(char sexo) {
		this.sexo = Character.toUpperCase(sexo);
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	 
	

	
	
	
	
	
}

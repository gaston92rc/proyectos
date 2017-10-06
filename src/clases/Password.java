package clases;

public class Password {
	
	private final static int LONG_DEF = 8;
	
	private int longitud;
	private String contraseña;
	
	
	public Password() {
		this(LONG_DEF);
		
	}
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = generarPassword();
	}
	
	public int getLongitud() {
		return longitud;
	}
	public String getContraseña() {
		return contraseña;
	}
	
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public String generarPassword(){
		String password="";
		for(int i = 0; i < longitud ; i++){
			//Generamos un numero aleatorio, segun este elige si añadir una minuscula, mayuscula o numero
            int eleccion=((int)Math.floor(Math.random()*3+1));
  
            if (eleccion==1){
                char minusculas=(char)((int)Math.floor(Math.random()*(123-97)+97));
                password+=minusculas;
            }else{
                if(eleccion==2){
                    char mayusculas=(char)((int)Math.floor(Math.random()*(91-65)+65));
                    password+=mayusculas;
                }else{
                    char numeros=(char)((int)Math.floor(Math.random()*(58-48)+48));
                    password+=numeros;
                }
            }
        }
        return password;
		
	}
	
	public boolean esFuerte(){
		int contMayus = 0;
		int contMinus = 0;
		int contNros = 0;
		
		for(int i=0; i<contraseña.length() ; i++){
			if(contraseña.charAt(i)>=65 && contraseña.charAt(i)<=90){
				contMayus++;
			}else if(contraseña.charAt(i)>=97 && contraseña.charAt(i)<=122){
				contMinus++;
			}else 
				contNros++;
		}
		if(contMayus >=2 && contMinus>=1 && contNros>=5)
			return true;
		else
			return false;
	}


	
	
	
	
	
}

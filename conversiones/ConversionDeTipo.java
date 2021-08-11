package conversiones;
/**
 * 
 * @author Miguel Ramos
 * Clase generada para entender la conversion de tipos de String a un primitivo y casteo de primito a primitivo
 * 
 */
public class ConversionDeTipo {

	/**
	 * Metodo que permite ejecutar la clase ConversionDeTipo
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Covertimos de String a primitivo
	
		String numeroStr = "50";
		// String a int primitivo
	
		int numeroInt = Integer.parseInt(numeroStr);
		System.out.println("numeroInt = " + numeroInt);
		
		// String a double
		String realStr = "98765.43";
		double realDouble = Double.parseDouble(realStr);
		System.out.println("Real double = " + realDouble);
		
		// String a boolean
		String logicoStr = "true";
		boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
		System.out.println("Booleano = " + logicoBoolean);
		
		/* Convertimos de un primitivo a un String*/
		int otroNumeroint = 100;
		System.out.println("otroNumeroInt = " + otroNumeroint);
		
		String otroNumeroStr = Integer.toString(otroNumeroint);
		System.out.println("otroNumeroStr = " + otroNumeroStr);
		
		// de double a String
		double otroRealDouble = 1.2241242;
		String otroRealStr = Double.toString(otroRealDouble);
		System.out.println("otroRealStr  = " + otroRealStr);
		
		// De primitivo a primitivo
		int i = 31000;
		// -32768 a 32767 rango de un short
		short s = (short)i;
		System.out.println("short s = " + s);
		long l = 314551L;
		int entero = (int)l;
		System.out.println("entero = " + entero);
		
		float f = (float)i;
		System.out.println("f = " + f);
        
	}

}

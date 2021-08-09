package math;
import java.lang.Math;
public class EjemploClaseMath {

	public static void main(String[] args) {
		// Valores absolutos
		int absoluto = Math.abs(3);
		System.out.println("absoluto = " + absoluto);
		absoluto = Math.abs(-3);
		System.out.println("absoluto = " + absoluto);
		
		// El maximo entre dos numeros
		double max = Math.max(3.5, 1.2);
		System.out.println(max);
		
		// El valor minimo
		double min = Math.min(3.5, 1.2);
		System.out.println(min);
		
		// Redondear
		
		// Hacia arriba
		double redondearUp = Math.ceil(3.5);
		System.out.println(redondearUp);
		// Hacia Abajo
		double redondearDown = Math.floor(3.5);
		System.out.println(redondearDown);
		
		/* Redondear un valor en general hacia arriba o hacia abajo*/
		long entero = Math.round(3.4);
		System.out.println(entero);
		
		// Potencias 
		double potencia = Math.pow(10, 2);
		System.out.println(potencia);
		
		// Raices
		double raiz  = Math.sqrt(25);
		System.out.println("raiz = " + raiz);
	

	}

}

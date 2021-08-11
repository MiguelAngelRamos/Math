package math;

import java.util.Random;

public class ClaseRandom {

	public static void main(String[] args) {
		String [] colores = {"azul", "amarilllo", "rojo", "verde", "blanco", "negro"}; // longitud es 6
		Random randomObj = new Random();
		
		int randomInt = randomObj.nextInt();
		System.out.println("randomInt: " + randomInt);
		
		// Son valores aleatorios del 0 al 6 pero no incluye al 6
		int randomIntParams = randomObj.nextInt(colores.length);
		System.out.println(randomIntParams);
		
		// Obtengo el color por su indice aleatorio
		System.out.println("randomColor: " + colores[randomIntParams]);
		
		
		// ejemplo de un numero entre 15 y 25
		int randomIntRango  = 15 + randomObj.nextInt(25-15);
		System.out.println(randomIntRango);
		
		

	}

}

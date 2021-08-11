package math;

public class EjemploClaseMathRandom {

	public static void main(String[] args) {
		
		String [] colores = {"azul", "amarilllo", "rojo", "verde", "blanco", "negro"};
		
		double random = Math.random(); // genera un numero aleatorio decimal del 0 al 1, sin incluir al 1
		/* Observar que pasa si lo multiplicamos por 10 o por 100*/
		/* Suponiendo un valor 0.1303338913803155588 * 10 = 1.303 y por * 100 = 13.03*/
		System.out.println("random = " + random);
		
		// random = random * "colores.length => (6)";
		random *= colores.length;
		System.out.println("random = " + random);
		
		// para rendondear hacia abajo
		random = Math.floor(random);
		System.out.println("random = " + random);
		
		// acceder al arreglo por medio de su indice
		// colores[2.0] => rojo, colores[(int)random]  (int)random => 2
		System.out.println("colores = " + colores[(int)random]);
	}

}

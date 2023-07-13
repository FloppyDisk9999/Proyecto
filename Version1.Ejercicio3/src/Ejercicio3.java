import java.util.Scanner;

public class Ejercicio3 {
	// Dado un n�mero entero N mayor que 0 e impar,
		// calcula y devuelve la media de los n�meros primos que se encuentran entre el 1 y el n�mero N (ambos inclusive).
		// Devuelve 0.0 si no hay n�meros primos entre el 1 y el n�mero N (ambos inclusive).
		public static double calcularMediaDeNumerosPrimos(int numeroN) {
			int contador = 0, suma = 0;
			for (int i = 1 ; i <= numeroN ; i++) {
				boolean esPrimo = false;
				int contadorDivisores = 0;
				for (int j = 1 ; j <= i ; j++) {
					if (i % j == 0) {
						contadorDivisores = contadorDivisores + 1;
					}
				}		
				if (contadorDivisores == 2) {
					esPrimo = true;
				}
				 
				if (esPrimo) {
					 
					contador = contador + 1;
					suma = suma + i;
				}
			}
			double media = 0.0;
			if (contador > 0) {
				media = (double) suma / contador;
			}
			return media;
		}
		
		// Dado un n�mero entero N mayor que 0 y par,
		// cuadrado de asteriscos cuyo lado sea el n�mero N,  
		public static void visualizarCuadrado(int numeroN) {
			int i, j;
			for (i = 0 ; i < numeroN ; i++) {
				for (j = 0 ; j < numeroN ; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
			
		// De forma iterativa, lee por teclado una serie de n�meros enteros, los procesa y 
		// finaliza cuando se introduzca por teclado un n�mero entero negativo (menor que 0).
		// Si el n�mero es mayor o igual que 0 y est� fuera del intervalo entre 2 y 99 (ambos inclusive), 
		// visualiza en la consola un mensaje informativo indicando que el n�mero no es v�lido.
		// Si el n�mero es v�lido y par, visualiza en la consola la pir�mide de n�meros pares
		// en orden decreciente en funci�n de dicho n�mero, alineando a la derecha las columnas de n�meros pares.
		// Si el n�mero es v�lido e impar, calcula y visualiza en la consola la media de
		// los n�meros primos que se encuentran entre el 1 y dicho n�mero (ambos inclusive).
		
		
	public static void main(String[] args) {
		int numero, contador = 0;
		double media;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el n�mero " + (contador+1) + " (entre 2 y 99): ");
		numero = teclado.nextInt();
		while (numero >= 0) {
			if (numero >= 2 && numero <= 99) {
				contador = contador + 1;
				if (numero % 2 == 0) {
					System.out.println("El n�mero es PAR.");
					visualizarCuadrado(numero);
				}
				else {
					System.out.println("El n�mero es IMPAR.");
					media = calcularMediaDeNumerosPrimos(numero);
					System.out.printf(
						"La media de los n�meros primos comprendidos entre 1 y %d es %.3f.%n", 
						numero, media);
				}
			}
			else {
				System.out.println("N�mero no v�lido: el n�mero debe estar comprendido entre 2 y 99.");
			}
			System.out.println();
			 System.out.print("Introduce el n�mero " + (contador+1) + " (entre 2 y 99): ");
			numero = teclado.nextInt();
		}
		System.out.println("Programa terminado sin errores.");
	}

}
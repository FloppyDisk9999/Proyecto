import java.util.Scanner;

public class Ejercicio2 {
	// Solicita la introducción de una palabra sin espacios en blanco por teclado.
		// Si la palabra contiene algún espacio en blanco, visualiza en la consola
		// un mensaje informativo indicando que la palabra no es válida,
		// hasta que se introduzca por teclado una palabra que no contenga ningún espacio en blanco.
		// Devuelve una palabra que no contiene ningún espacio en blanco.
		public static String solicitarPalabraSinEspacios(String mensaje) {
			Scanner teclado = new Scanner(System.in);
			System.out.println(mensaje);
			String palabra = teclado.nextLine();
			while (palabra.indexOf(' ') != -1) {
				System.out.println("Palabra no válida: la palabra no debe contener ningún espacio en blanco.");
				System.out.println(mensaje);
				palabra = teclado.nextLine();
			}
			return palabra;
		}
		
		// Solicita la introducción de una letra mayúscula por teclado.
		// Si la cadena no tiene un carácter que sea una letra mayúscula, visualiza 
		// en la consola un mensaje informativo indicando que el carácter no es válido,
		// hasta que se introduzca por teclado un carácter que sea una letra mayúscula.
		// Devuelve un caracter que es una letra mayúscula.
		public static char solicitarLetraMayuscula(String mensaje) {
			Scanner teclado = new Scanner(System.in);
			System.out.println(mensaje);
			String cadena = teclado.nextLine();
			char letra = ' ';
			if (cadena.length() == 1) {
				letra = cadena.charAt(0);
			}
			while (letra < 'A' || letra > 'Z') {
				System.out.println("Carácter no válido: el carácter debe ser una letra mayúscula.");
				System.out.println(mensaje);
				cadena = teclado.nextLine();
				letra = ' ';
				if (cadena.length() == 1) {
					letra = cadena.charAt(0);
				}
			}
			return letra;
		}
		
		// Lee por teclado una palabra que no contenga espacios en blanco.
		// Lee por teclado un carácter que sea una letra mayúscula.
		// Modifica la palabra, reemplazando cada aparición de la letra mayúscula
		// por una cadena que contiene esa letra tres veces.
		// Visualiza en la consola la palabra modificada.
	public static void main(String[] args) {
		String palabra = solicitarPalabraSinEspacios("Introduce una palabra sin espacios en blanco: ");
		char letra = solicitarLetraMayuscula("Introduce una letra mayúscula (A-Z): ");	
		String destino = "" + letra;
		String reemplazo = "" + letra + letra + letra;
		palabra = palabra.replace(destino, reemplazo);
		System.out.println("La palabra modificada es " + palabra + ".");

	}

}

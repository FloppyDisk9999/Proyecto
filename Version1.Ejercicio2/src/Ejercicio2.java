import java.util.Scanner;

public class Ejercicio2 {
	// Solicita la introducci�n de una palabra sin espacios en blanco por teclado.
		// Si la palabra contiene alg�n espacio en blanco, visualiza en la consola
		// un mensaje informativo indicando que la palabra no es v�lida,
		// hasta que se introduzca por teclado una palabra que no contenga ning�n espacio en blanco.
		// Devuelve una palabra que no contiene ning�n espacio en blanco.
		public static String solicitarPalabraSinEspacios(String mensaje) {
			Scanner teclado = new Scanner(System.in);
			System.out.println(mensaje);
			String palabra = teclado.nextLine();
			while (palabra.indexOf(' ') != -1) {
				System.out.println("Palabra no v�lida: la palabra no debe contener ning�n espacio en blanco.");
				System.out.println(mensaje);
				palabra = teclado.nextLine();
			}
			return palabra;
		}
		
		// Solicita la introducci�n de una letra may�scula por teclado.
		// Si la cadena no tiene un car�cter que sea una letra may�scula, visualiza 
		// en la consola un mensaje informativo indicando que el car�cter no es v�lido,
		// hasta que se introduzca por teclado un car�cter que sea una letra may�scula.
		// Devuelve un caracter que es una letra may�scula.
		public static char solicitarLetraMayuscula(String mensaje) {
			Scanner teclado = new Scanner(System.in);
			System.out.println(mensaje);
			String cadena = teclado.nextLine();
			char letra = ' ';
			if (cadena.length() == 1) {
				letra = cadena.charAt(0);
			}
			while (letra < 'A' || letra > 'Z') {
				System.out.println("Car�cter no v�lido: el car�cter debe ser una letra may�scula.");
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
		// Lee por teclado un car�cter que sea una letra may�scula.
		// Modifica la palabra, reemplazando cada aparici�n de la letra may�scula
		// por una cadena que contiene esa letra tres veces.
		// Visualiza en la consola la palabra modificada.
	public static void main(String[] args) {
		String palabra = solicitarPalabraSinEspacios("Introduce una palabra sin espacios en blanco: ");
		char letra = solicitarLetraMayuscula("Introduce una letra may�scula (A-Z): ");	
		String destino = "" + letra;
		String reemplazo = "" + letra + letra + letra;
		palabra = palabra.replace(destino, reemplazo);
		System.out.println("La palabra modificada es " + palabra + ".");

	}

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Clase Teclado2 que incluye operaciones de entrada de datos primitivos
// desde el teclado, con salida de mensajes informativos en la consola.
// Utiliza las clases InputStreamReader y BufferedReader del paquete java.io de Java.
public class Teclado2 {

	// Solicita la introducci�n de un n�mero natural (entero 'int' positivo) por teclado:
	// - Visualiza en la consola un mensaje informativo para el usuario.
	// - Devuelve el n�mero natural le�do desde el teclado.
	public static int solicitarNatural(String mensaje) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		int numeroNatural = 0;
		boolean error = true;
		while (error) {
			try {
				System.out.print(mensaje);
				numeroNatural = Integer.parseInt(teclado.readLine());
				while (numeroNatural <= 0) {
					System.out.println("El dato introducido debe ser mayor que cero.");
					System.out.print(mensaje);
					numeroNatural = Integer.parseInt(teclado.readLine());
				}
				error = false;
			} 
			catch (NumberFormatException nfe) {
				System.out.println("El dato introducido no tiene formato de n�mero natural.");
				error = true;
			}
			catch (IOException ioe) {
				System.out.println("Se ha producido un error de entrada/salida.");
				error = true;
			} 
		}
		return numeroNatural;
	}
	
	// Solicita la introducci�n de un n�mero entero 'int' por teclado:
	// - Visualiza en la consola un mensaje informativo para el usuario. 
	// - Devuelve el n�mero entero le�do desde el teclado.
	public static int solicitarEntero(String mensaje) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		int numeroEntero = 0;
		boolean error = true;
		while (error) {
			try {
				System.out.print(mensaje);
				numeroEntero = Integer.parseInt(teclado.readLine());
				error = false;
			} 
			catch (NumberFormatException nfe) {
				System.out.println("El dato introducido no tiene formato de n�mero entero.");
				error = true;
			}
			catch (IOException ioe) {
				System.out.println("Se ha producido un error de entrada/salida.");
				error = true;
			} 
		}
		return numeroEntero;
	}
	
	// Solicita la introducci�n de un n�mero real 'double' por teclado:
	// - Visualiza en la consola un mensaje informativo para el usuario.
	// - Devuelve el n�mero real le�do desde el teclado.
	public static double solicitarReal(String mensaje) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		double numeroReal = 0.0;
		boolean error = true;
		while (error) {
			try {
				System.out.print(mensaje);
				numeroReal = Double.parseDouble(teclado.readLine());
				error = false;
			} 
			catch (NumberFormatException nfe) {
				System.out.println("El dato introducido no tiene formato de n�mero real.");
				error = true;
			}
			catch (IOException ioe) {
				System.out.println("Se ha producido un error de entrada/salida.");
				error = true;
			} 
		}
		return numeroReal;
	}

	// Solicita la introducci�n de un car�cter 'char' por teclado:
	// - Visualiza en la consola un mensaje informativo para el usuario.
	// - Devuelve el car�cter le�do desde el teclado.
	public static char solicitarCaracter(String mensaje) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String lineaTexto = "";
		boolean error = true;
		while (error) {
			try {
				System.out.print(mensaje);
				lineaTexto = teclado.readLine();
				while (lineaTexto.length() != 1) {
					System.out.println("El dato introducido debe ser un �nico car�cter.");
					System.out.print(mensaje);
					lineaTexto = teclado.readLine();
				}
				error = false;
			} 
			catch (IOException ioe) {
				System.out.println("Se ha producido un error de entrada/salida.");
				error = true;
			}
		}
		return lineaTexto.charAt(0);
	}
	
	// Solicita la introducci�n de una cadena de caracteres 'String' por teclado:
	// - Visualiza en la consola un mensaje informativo para el usuario.
	// - Devuelve la cadena de caracteres le�da desde el teclado.
	public static String solicitarCadena(String mensaje) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String lineaTexto = "";
		boolean error = true;
		while (error) {
			try {
				System.out.print(mensaje);
				lineaTexto = teclado.readLine();
				error = false;
			} 
			catch (IOException ioe) {
				System.out.println("Se ha producido un error de entrada/salida.");
				error = true;
			}
		}
		return lineaTexto;
	}

}

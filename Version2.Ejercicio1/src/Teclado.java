

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Clase Teclado con operaciones de lectura de datos (entero, real, cadena de car�cteres) 
// desde el teclado mediante flujos de caracteres.
public class Teclado {

	// Solicita al usuario la introducci�n de un n�mero entero 'int' por teclado:
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

	// Solicita al usuario la introducci�n de un n�mero entero 'int' positivo por teclado:
	// - Visualiza en la consola un mensaje informativo para el usuario.
	// - Devuelve el n�mero entero positivo le�do desde el teclado.
	public static int solicitarEnteroPositivo(String mensaje) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		int numeroEnteroPositivo = 0;
		boolean error = true;
		while (error) {
			try {
				System.out.print(mensaje);
				numeroEnteroPositivo = Integer.parseInt(teclado.readLine());
				while (numeroEnteroPositivo <= 0) {
					System.out.println("El dato introducido debe ser mayor que cero.");
					System.out.print(mensaje);
					numeroEnteroPositivo = Integer.parseInt(teclado.readLine());
				}
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
		return numeroEnteroPositivo;
	}

	// Solicita al usuario la introducci�n de un n�mero real 'float' por teclado:
	// - Visualiza en la consola un mensaje informativo para el usuario.
	// - Devuelve el n�mero real en simple precisi�n le�do desde el teclado.
	public static float solicitarRealEnSimplePrecision(String mensaje) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		float numeroRealEnSimplePrecision = 0.0F;
		boolean error = true;
		while (error) {
			try {
				System.out.print(mensaje);
				numeroRealEnSimplePrecision = Float.parseFloat(teclado.readLine());
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
		return numeroRealEnSimplePrecision;
	}

	// Solicita al usuario la introducci�n de un n�mero real 'double' por teclado:
	// - Visualiza en la consola un mensaje informativo para el usuario.
	// - Devuelve el n�mero real en doble precisi�n le�do desde el teclado.
	public static double solicitarRealEnDoblePrecision(String mensaje) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		double numeroRealEnDoblePrecision = 0.0D;
		boolean error = true;
		while (error) {
			try {
				System.out.print(mensaje);
				numeroRealEnDoblePrecision = Double.parseDouble(teclado.readLine());
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
		return numeroRealEnDoblePrecision;
	}

	// Solicita al usuario la introducci�n de un car�cter 'char' por teclado:
	// - Visualiza en la consola un mensaje informativo para el usuario.
	// - Devuelve el car�cter le�do desde el teclado.
	public static char solicitarCaracter(String mensaje) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String cadenaConCaracter = "";
		boolean error = true;
		while (error) {
			try {
				System.out.print(mensaje);
				cadenaConCaracter = teclado.readLine();
				while (cadenaConCaracter.length() != 1) {
					System.out.println("El dato introducido debe ser un �nico car�cter.");
					System.out.print(mensaje);
					cadenaConCaracter = teclado.readLine();
				}
				error = false;
			} 
			catch (IOException ioe) {
				System.out.println("Se ha producido un error de entrada/salida.");
				error = true;
			}
		}
		return cadenaConCaracter.charAt(0);
	}

	// Solicita al usuario la introducci�n de una cadena de caracteres 'String' por teclado:
	// - Visualiza en la consola un mensaje informativo para el usuario.
	// - Devuelve la cadena de caracteres le�da desde el teclado.
	public static String solicitarCadena(String mensaje) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String cadenaDeCaracteres = "";
		boolean error = true;
		while (error) {
			try {
				System.out.print(mensaje);
				cadenaDeCaracteres = teclado.readLine();
				error = false;
			} 
			catch (IOException ioe) {
				System.out.println("Se ha producido un error de entrada/salida.");
				error = true;
			}
		}
		return cadenaDeCaracteres;
	}

}
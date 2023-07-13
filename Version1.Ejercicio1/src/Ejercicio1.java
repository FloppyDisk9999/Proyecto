import java.util.Scanner;


public class Ejercicio1 {
	// Devuelve verdadero si un c�digo es v�lido con las condiciones:
	// - El c�digo deber� tener 8 caracteres.
	// - El primer car�cter solo podr� ser A, B o C.
	// - Los cuatro siguientes caracteres ser�n d�gitos num�ricos y representar�n
	//   un a�o comprendido entre 1980 y 2020.
	// - El siguiente car�cter solo podr� ser 1 o 0.
	// - Los �ltimos dos caracteres podr�n tener cualquier valor.
	// Devuelve falso en caso contrario.
	public static boolean validar(String codigo) {
		boolean codigoValido = false;
		if (codigo.length() == 8) {
			// validar la categor�a
			boolean categoriaValida = false;
			char categoria = codigo.charAt(0);
			if (categoria == 'A' || categoria == 'B' || categoria == 'C') {
				categoriaValida = true;
			}
			// validar el a�o
			boolean agnoValido = false;	
			if ((codigo.substring(1, 5)).matches("[0-9]{4}")) {
				int agno = Integer.parseInt(codigo.substring(1, 5));
				if (agno >= 1980 && agno <= 2020) {
					agnoValido = true;
				}
			}
			// validar el estado
			boolean estadoValido = false;
			char estado = codigo.charAt(5);
			if (estado == '1' || estado == '0') {
				estadoValido = true;
			}
			codigoValido = categoriaValida && agnoValido && estadoValido;
		}
		return codigoValido;
	}
	
	// Lee por teclado 10 c�digos.
	// Para cada c�digo, comprueba la validez del c�digo y
	// visualiza en la consola un mensaje informativo indicando si el c�digo
	// es v�lido o no es v�lido.
	// Visualiza en la consola el n�mero de c�digos v�lidos que se han le�do.
	// Visualiza en la consola el n�mero de c�digos activos e inactivos correspondientes
	// a cada categor�a.
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String codigo;
		int contadorValidos = 0;
		int contadorActivosA = 0;
		int contadorInactivosA = 0;
		int contadorActivosB = 0;
		int contadorInactivosB = 0;
		int contadorActivosC = 0;
		int contadorInactivosC = 0;
		for (int contador = 1 ; contador <= 10 ; contador++) {
			System.out.print("Introduce el c�digo " + contador + ": ");
			codigo = teclado.nextLine();
			if (validar(codigo)) {
				System.out.println("El c�digo ES V�LIDO.");
				contadorValidos++;
				if (codigo.charAt(0) == 'A') {
					if (codigo.charAt(5) == '1') {
						contadorActivosA++;
					}
					else {
						contadorInactivosA++;
					}
				}
				else if (codigo.charAt(0) == 'B') {
					if (codigo.charAt(5) == '1') {
						contadorActivosB++;
					}
					else {
						contadorInactivosB++;
					}
				}
				else {
					if (codigo.charAt(5) == '1') {
						contadorActivosC++;
					}
					else {
						contadorInactivosC++;
					}
				}
			}
			else {
				System.out.println("El c�digo ES INV�LIDO.");
			}
		}
		System.out.println("C�digos V�lidos = " + contadorValidos);
		System.out.println("C�digos Activos en Categor�a A = " + contadorActivosA);
		System.out.println("C�digos Inactivos en Categor�a A = " + contadorInactivosA);
		System.out.println("C�digos Activos en Categor�a B = " + contadorActivosB);
		System.out.println("C�digos Inactivos en Categor�a B = " + contadorInactivosB);
		System.out.println("C�digos Activos en Categor�a C = " + contadorActivosC);
		System.out.println("C�digos Inactivos en Categor�a C = " + contadorInactivosC);
	}


	

}

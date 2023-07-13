import java.util.Scanner;


public class Ejercicio1 {
	// Devuelve verdadero si un código es válido con las condiciones:
	// - El código deberá tener 8 caracteres.
	// - El primer carácter solo podrá ser A, B o C.
	// - Los cuatro siguientes caracteres serán dígitos numéricos y representarán
	//   un año comprendido entre 1980 y 2020.
	// - El siguiente carácter solo podrá ser 1 o 0.
	// - Los últimos dos caracteres podrán tener cualquier valor.
	// Devuelve falso en caso contrario.
	public static boolean validar(String codigo) {
		boolean codigoValido = false;
		if (codigo.length() == 8) {
			// validar la categoría
			boolean categoriaValida = false;
			char categoria = codigo.charAt(0);
			if (categoria == 'A' || categoria == 'B' || categoria == 'C') {
				categoriaValida = true;
			}
			// validar el año
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
	
	// Lee por teclado 10 códigos.
	// Para cada código, comprueba la validez del código y
	// visualiza en la consola un mensaje informativo indicando si el código
	// es válido o no es válido.
	// Visualiza en la consola el número de códigos válidos que se han leído.
	// Visualiza en la consola el número de códigos activos e inactivos correspondientes
	// a cada categoría.
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
			System.out.print("Introduce el código " + contador + ": ");
			codigo = teclado.nextLine();
			if (validar(codigo)) {
				System.out.println("El código ES VÁLIDO.");
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
				System.out.println("El código ES INVÁLIDO.");
			}
		}
		System.out.println("Códigos Válidos = " + contadorValidos);
		System.out.println("Códigos Activos en Categoría A = " + contadorActivosA);
		System.out.println("Códigos Inactivos en Categoría A = " + contadorInactivosA);
		System.out.println("Códigos Activos en Categoría B = " + contadorActivosB);
		System.out.println("Códigos Inactivos en Categoría B = " + contadorInactivosB);
		System.out.println("Códigos Activos en Categoría C = " + contadorActivosC);
		System.out.println("Códigos Inactivos en Categoría C = " + contadorInactivosC);
	}


	

}

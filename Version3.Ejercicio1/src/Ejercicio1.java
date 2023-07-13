

public class Ejercicio1 {
	
	// Gestiona una videoteca mediante un men� con las siguientes opciones:
	// 1) Insertar una pel�cula en la videoteca.
	// 2) Eliminar una pel�cula de la videoteca.
	// 3) Modificar la puntuaci�n de una pel�cula de la videoteca.
	// 4) Consultar todas las pel�culas de la videoteca, por orden de inserci�n.
	// 5) Consultar todas las pel�culas de la videoteca, ordenadas por a�o de estreno ascendente.
	public static void main(String[] args) {
		// Crear una videoteca vac�a.
		Videoteca videoteca = new Videoteca();
		// variables y objetos auxiliares
		int agno;
		String titulo, director;
		double puntuacion;
		Pelicula pelicula;
		// Gestionar el men� de opciones.
		int opcion;
		do {
			System.out.println("-------------------------------------------------------------------------------------------");
			System.out.println("(0) Salir.");
			System.out.println("(1) Insertar una pel�cula en la videoteca.");
			System.out.println("(2) Eliminar una pel�cula de la videoteca.");
			System.out.println("(3) Modificar la puntuaci�n de una pel�cula de la videoteca.");
			System.out.println("(4) Consultar todas las pel�culas de la videoteca, por orden de inserci�n.");
			System.out.println("(5) Consultar todas las pel�culas de la videoteca, ordenadas por a�o de estreno ascendente.");
			System.out.println("-------------------------------------------------------------------------------------------");
			opcion = Teclado2.solicitarEntero("�Opci�n (0-5)? ");
			switch (opcion) {
			case 0:
				break;
				
			// Insertar una pel�cula en la videoteca.
			case 1:
				agno = Teclado2.solicitarEntero("�A�o de Estreno? ");
				titulo = Teclado2.solicitarCadena("�T�tulo? ");
				director = Teclado2.solicitarCadena("�Director? ");
				puntuacion = Teclado2.solicitarReal("�Puntuaci�n? ");
				pelicula = new Pelicula(agno, titulo, director, puntuacion);
				try {
					videoteca.insertar(pelicula);
					System.out.println("Se ha insertado la pel�cula en la videoteca con �xito.");
				}
				catch (InsercionException ex) {
					System.out.println(ex.getMessage());
				}
				break;
			
			// Eliminar una pel�cula de la videoteca.
			case 2:
				agno = Teclado2.solicitarEntero("�A�o de Estreno? ");
				titulo = Teclado2.solicitarCadena("�T�tulo? ");
				pelicula = new Pelicula(agno, titulo, null, 0.0);
				try {
					videoteca.eliminar(pelicula);
					System.out.println("Se ha eliminado la pel�cula de la videoteca con �xito.");
				}
				catch (EliminacionException ex) {
					System.out.println(ex.getMessage());
				}
				break;
			
			// Modificar puntuaci�n de una pel�cula de la videoteca.
			case 3:
				agno = Teclado2.solicitarEntero("�A�o de Estreno? ");
				titulo = Teclado2.solicitarCadena("�T�tulo? ");
				pelicula = new Pelicula(agno, titulo, null, 0.0);
				try {
					pelicula = videoteca.obtener(agno, titulo);
					puntuacion = Teclado2.solicitarReal("�Puntuaci�n? ");
					pelicula.setPuntuacion(puntuacion);
					System.out.println("Se ha actualizado la pel�cula de la videoteca con �xito.");
				}
				catch (NoEncontradaException ex) {
					System.out.println(ex.getMessage());
				}
				break;
			// Consultar todas las pel�culas de la videoteca,
			// por orden de inserci�n.
			case 4:
				System.out.println(videoteca.toString());
				break;
			
			// Consultar todas las pel�culas de la videoteca,
			// ordenadas por a�o de estreno ascendente.
			case 5:
				System.out.println(videoteca.generarCadenaConOrdenacionPorAgno());
				break;
			
			// Opci�n de men� inv�lida
			default:
				System.out.println("La opci�n de men� no es v�lida.");
				System.out.println("La opci�n de men� debe estar comprendida entre 0 y 5.");
				break;
			}
		}
		while (opcion != 0);
		System.out.println("Programa finalizado sin errores.");
	}
	
}

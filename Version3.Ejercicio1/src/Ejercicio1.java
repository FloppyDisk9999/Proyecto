

public class Ejercicio1 {
	
	// Gestiona una videoteca mediante un menú con las siguientes opciones:
	// 1) Insertar una película en la videoteca.
	// 2) Eliminar una película de la videoteca.
	// 3) Modificar la puntuación de una película de la videoteca.
	// 4) Consultar todas las películas de la videoteca, por orden de inserción.
	// 5) Consultar todas las películas de la videoteca, ordenadas por año de estreno ascendente.
	public static void main(String[] args) {
		// Crear una videoteca vacía.
		Videoteca videoteca = new Videoteca();
		// variables y objetos auxiliares
		int agno;
		String titulo, director;
		double puntuacion;
		Pelicula pelicula;
		// Gestionar el menú de opciones.
		int opcion;
		do {
			System.out.println("-------------------------------------------------------------------------------------------");
			System.out.println("(0) Salir.");
			System.out.println("(1) Insertar una película en la videoteca.");
			System.out.println("(2) Eliminar una película de la videoteca.");
			System.out.println("(3) Modificar la puntuación de una película de la videoteca.");
			System.out.println("(4) Consultar todas las películas de la videoteca, por orden de inserción.");
			System.out.println("(5) Consultar todas las películas de la videoteca, ordenadas por año de estreno ascendente.");
			System.out.println("-------------------------------------------------------------------------------------------");
			opcion = Teclado2.solicitarEntero("¿Opción (0-5)? ");
			switch (opcion) {
			case 0:
				break;
				
			// Insertar una película en la videoteca.
			case 1:
				agno = Teclado2.solicitarEntero("¿Año de Estreno? ");
				titulo = Teclado2.solicitarCadena("¿Título? ");
				director = Teclado2.solicitarCadena("¿Director? ");
				puntuacion = Teclado2.solicitarReal("¿Puntuación? ");
				pelicula = new Pelicula(agno, titulo, director, puntuacion);
				try {
					videoteca.insertar(pelicula);
					System.out.println("Se ha insertado la película en la videoteca con éxito.");
				}
				catch (InsercionException ex) {
					System.out.println(ex.getMessage());
				}
				break;
			
			// Eliminar una película de la videoteca.
			case 2:
				agno = Teclado2.solicitarEntero("¿Año de Estreno? ");
				titulo = Teclado2.solicitarCadena("¿Título? ");
				pelicula = new Pelicula(agno, titulo, null, 0.0);
				try {
					videoteca.eliminar(pelicula);
					System.out.println("Se ha eliminado la película de la videoteca con éxito.");
				}
				catch (EliminacionException ex) {
					System.out.println(ex.getMessage());
				}
				break;
			
			// Modificar puntuación de una película de la videoteca.
			case 3:
				agno = Teclado2.solicitarEntero("¿Año de Estreno? ");
				titulo = Teclado2.solicitarCadena("¿Título? ");
				pelicula = new Pelicula(agno, titulo, null, 0.0);
				try {
					pelicula = videoteca.obtener(agno, titulo);
					puntuacion = Teclado2.solicitarReal("¿Puntuación? ");
					pelicula.setPuntuacion(puntuacion);
					System.out.println("Se ha actualizado la película de la videoteca con éxito.");
				}
				catch (NoEncontradaException ex) {
					System.out.println(ex.getMessage());
				}
				break;
			// Consultar todas las películas de la videoteca,
			// por orden de inserción.
			case 4:
				System.out.println(videoteca.toString());
				break;
			
			// Consultar todas las películas de la videoteca,
			// ordenadas por año de estreno ascendente.
			case 5:
				System.out.println(videoteca.generarCadenaConOrdenacionPorAgno());
				break;
			
			// Opción de menú inválida
			default:
				System.out.println("La opción de menú no es válida.");
				System.out.println("La opción de menú debe estar comprendida entre 0 y 5.");
				break;
			}
		}
		while (opcion != 0);
		System.out.println("Programa finalizado sin errores.");
	}
	
}

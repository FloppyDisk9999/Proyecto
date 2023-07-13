

// Clase GestorAlmacén que gestiona un almacén de artículos
// mediante un menú de opciones.
public class GestorAlmacen {

	// Gestiona un almacén de artículos mediante un menú de opciones.
	public static void main(String[] args) {
		// Crear el almacén de artículos.
		Almacen almacen = new Almacen(50);
		// Declarar variables y objetos.
		int opcion, duracion, jugadoresLocal, posicion;
		String titulo, escritor, formato, director, genero;
		double precio;
		Libro libro;
		Pelicula pelicula;
		VideoJuego videojuego;
		// Gestionar el menú de opciones.
		do {
			System.out.println("(0) Salir.");
			System.out.println("(1) Insertar un libro en el almacén.");
			System.out.println("(2) Insertar una película en el almacén.");
			System.out.println("(3) Insertar un videojuego en el almacén.");
			System.out.println("(4) Eliminar un artículo, por posición, del almacén.");
			System.out.println("(5) Consultar los artículos del almacén.");
			System.out.println("(6) Consultar los artículos del almacén, ordenados por el título.");
			System.out.println("(7) Consultar las películas del almacén.");
			opcion = Teclado.solicitarEntero("Introduce una opción: ");
			switch (opcion) {
			case 0:
				break;
			
			// Insertar un libro en el almacén.
			case 1:
				titulo = Teclado.solicitarCadena("¿titulo del libro? ");
				precio = Teclado.solicitarRealEnDoblePrecision("¿precio del libro? ");
				escritor = Teclado.solicitarCadena("¿escritor del libro? ");
				formato = Teclado.solicitarCadena("¿formato del libro? ");
				libro = new Libro(titulo, precio, escritor, formato);
				if (almacen.insertar(libro)) {
					System.out.println("Se ha insertado el libro en el almacén con éxito.");
				}
				else {
					System.out.println("Error al insertar libro: almacén lleno.");
				}
				break;
				
			// Insertar una película en el almacén.
			case 2:
				titulo = Teclado.solicitarCadena("¿titulo de la película? ");
				precio = Teclado.solicitarRealEnDoblePrecision("¿precio de la película? ");
				director = Teclado.solicitarCadena("¿director de la película? ");
				duracion = Teclado.solicitarEntero("¿duración de la película? ");
				pelicula = new Pelicula(titulo, precio, director, duracion);
				if (almacen.insertar(pelicula)) {
					System.out.println("Se ha insertado la película en el almacén con éxito.");
				}
				else {
					System.out.println("Error al insertar película: almacén lleno.");
				}
				break;
				
			// Insertar un videojuego en el almacén.
			case 3:
				titulo = Teclado.solicitarCadena("¿titulo del videojuego? ");
				precio = Teclado.solicitarRealEnDoblePrecision("¿precio del videojuego? ");
				genero = Teclado.solicitarCadena("¿género del videojuego? ");
				jugadoresLocal = Teclado.solicitarEntero("¿jugadores local del videojuego? ");
				videojuego = new VideoJuego(titulo, precio, genero, jugadoresLocal);
				if (almacen.insertar(videojuego)) {
					System.out.println("Se ha insertado el videojuego en el almacén con éxito.");
				}
				else {
					System.out.println("Error al insertar videojuego: almacén lleno.");
				}
				break;
				
			// Eliminar un artículo, por posición, del almacén.
			case 4:
				posicion = Teclado.solicitarEntero("¿posición del artículo? ");
				if (almacen.estaVacio()) {
					System.out.println("Error al eliminar artículo: almacén vacío.");
				}
				else if (almacen.eliminar(posicion)) {
					System.out.println("Se ha eliminado el artículo del almacén con éxito.");
				}
				else {
					System.out.println("No hay artículo en la posición " + posicion + " del almacén.");
				}
				break;
				
			// Consultar los artículos del almacén.
			case 5:
				System.out.println(almacen.toString());
				break;				
			// Consultar los artículos del almacén, ordenados por el título.
			case 6:
				almacen.ordenarPorTitulo();
				System.out.println(almacen.toString());
				break;
			// Consultar las películas del almacén.
			case 7:
				System.out.println(almacen.obtenerCadenaPeliculas());
				break;
			default:
				System.out.println("Opción de menú no válida.");
			}
		}
		while (opcion != 0);
		System.out.println("Programa terminado sin errores.");
	}

}
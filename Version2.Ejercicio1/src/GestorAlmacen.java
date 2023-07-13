

// Clase GestorAlmac�n que gestiona un almac�n de art�culos
// mediante un men� de opciones.
public class GestorAlmacen {

	// Gestiona un almac�n de art�culos mediante un men� de opciones.
	public static void main(String[] args) {
		// Crear el almac�n de art�culos.
		Almacen almacen = new Almacen(50);
		// Declarar variables y objetos.
		int opcion, duracion, jugadoresLocal, posicion;
		String titulo, escritor, formato, director, genero;
		double precio;
		Libro libro;
		Pelicula pelicula;
		VideoJuego videojuego;
		// Gestionar el men� de opciones.
		do {
			System.out.println("(0) Salir.");
			System.out.println("(1) Insertar un libro en el almac�n.");
			System.out.println("(2) Insertar una pel�cula en el almac�n.");
			System.out.println("(3) Insertar un videojuego en el almac�n.");
			System.out.println("(4) Eliminar un art�culo, por posici�n, del almac�n.");
			System.out.println("(5) Consultar los art�culos del almac�n.");
			System.out.println("(6) Consultar los art�culos del almac�n, ordenados por el t�tulo.");
			System.out.println("(7) Consultar las pel�culas del almac�n.");
			opcion = Teclado.solicitarEntero("Introduce una opci�n: ");
			switch (opcion) {
			case 0:
				break;
			
			// Insertar un libro en el almac�n.
			case 1:
				titulo = Teclado.solicitarCadena("�titulo del libro? ");
				precio = Teclado.solicitarRealEnDoblePrecision("�precio del libro? ");
				escritor = Teclado.solicitarCadena("�escritor del libro? ");
				formato = Teclado.solicitarCadena("�formato del libro? ");
				libro = new Libro(titulo, precio, escritor, formato);
				if (almacen.insertar(libro)) {
					System.out.println("Se ha insertado el libro en el almac�n con �xito.");
				}
				else {
					System.out.println("Error al insertar libro: almac�n lleno.");
				}
				break;
				
			// Insertar una pel�cula en el almac�n.
			case 2:
				titulo = Teclado.solicitarCadena("�titulo de la pel�cula? ");
				precio = Teclado.solicitarRealEnDoblePrecision("�precio de la pel�cula? ");
				director = Teclado.solicitarCadena("�director de la pel�cula? ");
				duracion = Teclado.solicitarEntero("�duraci�n de la pel�cula? ");
				pelicula = new Pelicula(titulo, precio, director, duracion);
				if (almacen.insertar(pelicula)) {
					System.out.println("Se ha insertado la pel�cula en el almac�n con �xito.");
				}
				else {
					System.out.println("Error al insertar pel�cula: almac�n lleno.");
				}
				break;
				
			// Insertar un videojuego en el almac�n.
			case 3:
				titulo = Teclado.solicitarCadena("�titulo del videojuego? ");
				precio = Teclado.solicitarRealEnDoblePrecision("�precio del videojuego? ");
				genero = Teclado.solicitarCadena("�g�nero del videojuego? ");
				jugadoresLocal = Teclado.solicitarEntero("�jugadores local del videojuego? ");
				videojuego = new VideoJuego(titulo, precio, genero, jugadoresLocal);
				if (almacen.insertar(videojuego)) {
					System.out.println("Se ha insertado el videojuego en el almac�n con �xito.");
				}
				else {
					System.out.println("Error al insertar videojuego: almac�n lleno.");
				}
				break;
				
			// Eliminar un art�culo, por posici�n, del almac�n.
			case 4:
				posicion = Teclado.solicitarEntero("�posici�n del art�culo? ");
				if (almacen.estaVacio()) {
					System.out.println("Error al eliminar art�culo: almac�n vac�o.");
				}
				else if (almacen.eliminar(posicion)) {
					System.out.println("Se ha eliminado el art�culo del almac�n con �xito.");
				}
				else {
					System.out.println("No hay art�culo en la posici�n " + posicion + " del almac�n.");
				}
				break;
				
			// Consultar los art�culos del almac�n.
			case 5:
				System.out.println(almacen.toString());
				break;				
			// Consultar los art�culos del almac�n, ordenados por el t�tulo.
			case 6:
				almacen.ordenarPorTitulo();
				System.out.println(almacen.toString());
				break;
			// Consultar las pel�culas del almac�n.
			case 7:
				System.out.println(almacen.obtenerCadenaPeliculas());
				break;
			default:
				System.out.println("Opci�n de men� no v�lida.");
			}
		}
		while (opcion != 0);
		System.out.println("Programa terminado sin errores.");
	}

}
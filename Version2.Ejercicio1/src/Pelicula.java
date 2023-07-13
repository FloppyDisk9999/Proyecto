// Clase Película que hereda de Artículo y
// que añade el director y la duración en minutos.
public class Pelicula extends Articulo {

	// atributos
	private String director;
	private int duracion;  // en minutos
	
	// Crea una película a partir de cuatro parámetros.
	public Pelicula(String titulo, double precio, 
			        String director, int duracion) {
		super(titulo, precio);
		this.director = director;
		this.duracion = duracion;
	}
	
	// Genera una cadena de caracteres con el estado de la película.
	@Override
	public String toString() {
		return
			"Película [" +
				super.toString() +
				", Director=" + this.director +
				", Duración=" + this.duracion + 
			"]";
	}
		
}

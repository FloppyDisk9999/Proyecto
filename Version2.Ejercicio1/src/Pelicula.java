// Clase Pel�cula que hereda de Art�culo y
// que a�ade el director y la duraci�n en minutos.
public class Pelicula extends Articulo {

	// atributos
	private String director;
	private int duracion;  // en minutos
	
	// Crea una pel�cula a partir de cuatro par�metros.
	public Pelicula(String titulo, double precio, 
			        String director, int duracion) {
		super(titulo, precio);
		this.director = director;
		this.duracion = duracion;
	}
	
	// Genera una cadena de caracteres con el estado de la pel�cula.
	@Override
	public String toString() {
		return
			"Pel�cula [" +
				super.toString() +
				", Director=" + this.director +
				", Duraci�n=" + this.duracion + 
			"]";
	}
		
}

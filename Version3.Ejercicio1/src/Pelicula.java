

// Clase Película con año, título, director y puntuación.
public class Pelicula {
 
	// atributos
	private int agno;
	private String titulo;
	private String director;
	private double puntuacion;
	
	// Crea una película mediante datos suministrados como parámetros.
	public Pelicula(int agno, String titulo, String director, double puntuacion) {
		this.agno = agno;
		this.titulo = titulo;
		this.director = director;
		this.puntuacion = puntuacion;
	}

	// Devuelve el año de la película.
	public int getAgno() {
		return this.agno;
	}
	
	// Devuelve la puntuación de la película.
	public double getPuntuacion() { 
		return this.puntuacion;
	}
	
	//Establece la puntuación de la película
	public void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}
	
	// Devuelve una cadena de caracteres con el estado de la película.
	@Override
	public String toString() {
		return 
			"Película [Año = " + this.agno + 
			", Título = " + this.titulo +
			", Director = " + this.director + 
			", Puntuación = " + String.format("%.1f", this.puntuacion) + 
			"]";
	}

	// Devuelve un código hash generado a partir de
	// la unión del año de estreno y el título de la película.
	@Override
	public int hashCode() {
		final int primo = 31;
		int codigoHash = 1;
		codigoHash = primo * codigoHash + agno;
		codigoHash = primo * codigoHash + ((titulo == null) ? 0 : titulo.hashCode());
		return codigoHash;
	}

	// Realiza la comparación de igualdad de dos películas.
	// Devuelve verdadero si las dos películas tienen
	// el mismo año de estreno y el mismo título.
	// Devuelve falso en caso contrario.
	@Override
	public boolean equals(Object objeto) {
		if (this == objeto) {
			return true;
		}
		if (objeto == null) {
			return false;
		}
		if (! (objeto instanceof Pelicula)) {
			return false;
		}
		Pelicula otra = (Pelicula) objeto;
		if (this.agno != otra.agno) {
			return false;
		}
		if (this.titulo == null) {
			if (otra.titulo != null) {
				return false;
			}
		} else if (! this.titulo.equals(otra.titulo)) {
			return false;
		}
		return true;
	}
	
}

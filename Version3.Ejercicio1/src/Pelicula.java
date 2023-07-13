

// Clase Pel�cula con a�o, t�tulo, director y puntuaci�n.
public class Pelicula {
 
	// atributos
	private int agno;
	private String titulo;
	private String director;
	private double puntuacion;
	
	// Crea una pel�cula mediante datos suministrados como par�metros.
	public Pelicula(int agno, String titulo, String director, double puntuacion) {
		this.agno = agno;
		this.titulo = titulo;
		this.director = director;
		this.puntuacion = puntuacion;
	}

	// Devuelve el a�o de la pel�cula.
	public int getAgno() {
		return this.agno;
	}
	
	// Devuelve la puntuaci�n de la pel�cula.
	public double getPuntuacion() { 
		return this.puntuacion;
	}
	
	//Establece la puntuaci�n de la pel�cula
	public void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}
	
	// Devuelve una cadena de caracteres con el estado de la pel�cula.
	@Override
	public String toString() {
		return 
			"Pel�cula [A�o = " + this.agno + 
			", T�tulo = " + this.titulo +
			", Director = " + this.director + 
			", Puntuaci�n = " + String.format("%.1f", this.puntuacion) + 
			"]";
	}

	// Devuelve un c�digo hash generado a partir de
	// la uni�n del a�o de estreno y el t�tulo de la pel�cula.
	@Override
	public int hashCode() {
		final int primo = 31;
		int codigoHash = 1;
		codigoHash = primo * codigoHash + agno;
		codigoHash = primo * codigoHash + ((titulo == null) ? 0 : titulo.hashCode());
		return codigoHash;
	}

	// Realiza la comparaci�n de igualdad de dos pel�culas.
	// Devuelve verdadero si las dos pel�culas tienen
	// el mismo a�o de estreno y el mismo t�tulo.
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

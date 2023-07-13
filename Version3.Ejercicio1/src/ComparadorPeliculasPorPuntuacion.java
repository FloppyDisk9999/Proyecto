

import java.util.Comparator;

public class ComparadorPeliculasPorPuntuacion implements Comparator<Pelicula> {

	// Compara dos pel�culas seg�n la puntuaci�n en orden descendente.
	@Override
	public int compare(Pelicula pelicula1, Pelicula pelicula2) { 
		Double puntuacion1 = new Double(pelicula1.getPuntuacion());
		Double puntuacion2 = new Double(pelicula2.getPuntuacion());
		return puntuacion2.compareTo(puntuacion1);
	}

}

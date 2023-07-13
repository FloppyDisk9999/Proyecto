

import java.util.Comparator;

public class ComparadorPeliculasPorAgno implements Comparator<Pelicula> {

	// Compara dos pel�culas seg�n el a�o en orden ascendente.
	@Override
	public int compare(Pelicula pelicula1, Pelicula pelicula2) {
		int agno1 = pelicula1.getAgno();
		int agno2 = pelicula2.getAgno();
		return agno1 - agno2;
	}

}



import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

// Clase Videoteca con colección de películas.
public class Videoteca {
	
	// colección de películas
	private LinkedHashSet<Pelicula> conjunto;
	
	// Crea una videoteca vacía.
	public Videoteca() {
		conjunto = new LinkedHashSet<Pelicula>();
	}

	// Devuelve una cadena de caracteres con el estado de una colección.
	private String generarCadena(Collection<Pelicula> conjunto) {
		String cadena = "";
		int numeroPeliculas = conjunto.size();
		if (numeroPeliculas == 0) {
			cadena = "La videoteca está vacía.";
		}
		else {
			cadena = "La videoteca contiene " + numeroPeliculas + " películas:";
			for (Pelicula pelicula : conjunto) {
				cadena = cadena + "\n" + pelicula.toString();
			}
		}
		return cadena;
	}
	
	// Devuelve una cadena de caracteres con el estado de la videoteca.
	@Override
	public String toString() {
		return generarCadena(this.conjunto);
	}
	
	// Inserta una película en la colección.
	// Genera una excepcion si la película ya está en la colección.
	public void insertar(Pelicula pelicula) {
		if (!conjunto.contains(pelicula))
			conjunto.add(pelicula);
		else 
			throw new InsercionException();
	}
	
	// Elimina una película de la colección.
	// Genera una excepcion si la película no está en la colección.
	public void eliminar(Pelicula pelicula) {
		if (conjunto.contains(pelicula))
			conjunto.remove(pelicula);
		else
			throw new EliminacionException();
	}
	
	// Obtiene una película de la colección.
	// Genera una excepcion si la película no está en la colección.
	public Pelicula obtener(int agno, String titulo) {
		Pelicula pelicula = null;
		Pelicula pAux = new Pelicula (agno, titulo, null, 0);
		for(Pelicula p: conjunto) {
			if(p.equals(pAux))
				pelicula =p;
		}	
		if (pelicula != null)
			return pelicula;
		else
			throw new NoEncontradaException();
	}
		
	// Copia las películas de la colección 
	// a otra colección auxiliar que tiene una ordenación por año de estreno ascendente
	// y devuelve una cadena de caracteres con el estado de la colección auxiliar.
	public String generarCadenaConOrdenacionPorAgno() {
		ComparadorPeliculasPorAgno comparador = new ComparadorPeliculasPorAgno();
		ArrayList<Pelicula> listaOrdenadoPorAgno = new ArrayList<Pelicula>();
		listaOrdenadoPorAgno.addAll(conjunto);
		Collections.sort(listaOrdenadoPorAgno, comparador);
		return generarCadena(listaOrdenadoPorAgno);
	}
	
}

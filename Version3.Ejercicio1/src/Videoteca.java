

import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

// Clase Videoteca con colecci�n de pel�culas.
public class Videoteca {
	
	// colecci�n de pel�culas
	private LinkedHashSet<Pelicula> conjunto;
	
	// Crea una videoteca vac�a.
	public Videoteca() {
		conjunto = new LinkedHashSet<Pelicula>();
	}

	// Devuelve una cadena de caracteres con el estado de una colecci�n.
	private String generarCadena(Collection<Pelicula> conjunto) {
		String cadena = "";
		int numeroPeliculas = conjunto.size();
		if (numeroPeliculas == 0) {
			cadena = "La videoteca est� vac�a.";
		}
		else {
			cadena = "La videoteca contiene " + numeroPeliculas + " pel�culas:";
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
	
	// Inserta una pel�cula en la colecci�n.
	// Genera una excepcion si la pel�cula ya est� en la colecci�n.
	public void insertar(Pelicula pelicula) {
		if (!conjunto.contains(pelicula))
			conjunto.add(pelicula);
		else 
			throw new InsercionException();
	}
	
	// Elimina una pel�cula de la colecci�n.
	// Genera una excepcion si la pel�cula no est� en la colecci�n.
	public void eliminar(Pelicula pelicula) {
		if (conjunto.contains(pelicula))
			conjunto.remove(pelicula);
		else
			throw new EliminacionException();
	}
	
	// Obtiene una pel�cula de la colecci�n.
	// Genera una excepcion si la pel�cula no est� en la colecci�n.
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
		
	// Copia las pel�culas de la colecci�n 
	// a otra colecci�n auxiliar que tiene una ordenaci�n por a�o de estreno ascendente
	// y devuelve una cadena de caracteres con el estado de la colecci�n auxiliar.
	public String generarCadenaConOrdenacionPorAgno() {
		ComparadorPeliculasPorAgno comparador = new ComparadorPeliculasPorAgno();
		ArrayList<Pelicula> listaOrdenadoPorAgno = new ArrayList<Pelicula>();
		listaOrdenadoPorAgno.addAll(conjunto);
		Collections.sort(listaOrdenadoPorAgno, comparador);
		return generarCadena(listaOrdenadoPorAgno);
	}
	
}

import java.util.Arrays;

// Clase Almacén que contiene el vector de artículos y el índice.
public class Almacen {

	// atributos
	private Articulo[] articulos;
	private int indice;
	
	// Crea un almacén a partir de un parámetro.
	public Almacen(int capacidad) {
		this.articulos = new Articulo[capacidad];
		this.indice = 0;
	}
	
	// Genera una cadena de caracteres con el estado del almacén.
	@Override
	public String toString() {
		String cadena = "";
		int total = 0 ;
		if (this.indice == 0) {
			cadena = "El almacén está vacío.";
		}
		else {
			for (int pos = 0 ; pos < this.indice ; pos++) {
				cadena = cadena +
					"(" + pos + ") " +
					this.articulos[pos].toString() + "\n";
				total++;
			}
			cadena = cadena + "Se ha/n consultado " + total + " artículo/s del almacén.";
		}
		return cadena;
	}
	
	// Devuelve verdadero si el almacén está vacío.
	// Devuelve falso en contrario.
	public boolean estaVacio() {
		return (this.indice == 0);
	}
	
	// Inserta un artículo en el almacén.
	// Devuelve verdadero si se ha insertado correctamente.
	// Devuelve falso si no se ha podido insertar.
	public boolean insertar(Articulo articulo) {
		boolean insertado = false;
		if (this.indice < this.articulos.length) {
			this.articulos[this.indice] = articulo;
			this.indice++;
			insertado = true;
		}
		return insertado;
	}
	
	// Elimina un artículo, por posición, del almacén.
	// Devuelve verdadero si se ha eliminado correctamente.
	// Devuelve falso si no se ha podido eliminar.
	public boolean eliminar(int posicion) {
		boolean eliminado = false;
		if (posicion >= 0 && posicion < this.indice) {
			while (posicion < this.indice - 1) {
				this.articulos[posicion] = this.articulos[posicion+1];
				posicion++;
			}
			this.articulos[posicion] = null;
			this.indice--;
			eliminado = true;
		}
		return eliminado;
	}
	
	// Ordena el vector por título.
	public void ordenarPorTitulo() {
		Arrays.sort(articulos, 0, indice, new OrderPorTitulo());
	}
	
	// Devuelve una cadena de texto con las películas del vector.
	public String obtenerCadenaPeliculas() {
		String cadena = "";
		int total = 0;
		for (int pos = 0 ; pos < this.indice ; pos++) {
			if(articulos[pos] instanceof Pelicula) {
				cadena = cadena +
					"(" + pos + ") " +
					this.articulos[pos].toString() + "\n";
				total++;
			}
			cadena = cadena + "Se ha/n consultado " + total + " película/s del almacén.";
		}
		
		return cadena;
	}
}

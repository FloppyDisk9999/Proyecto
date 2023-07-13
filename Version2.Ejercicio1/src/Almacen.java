import java.util.Arrays;

// Clase Almac�n que contiene el vector de art�culos y el �ndice.
public class Almacen {

	// atributos
	private Articulo[] articulos;
	private int indice;
	
	// Crea un almac�n a partir de un par�metro.
	public Almacen(int capacidad) {
		this.articulos = new Articulo[capacidad];
		this.indice = 0;
	}
	
	// Genera una cadena de caracteres con el estado del almac�n.
	@Override
	public String toString() {
		String cadena = "";
		int total = 0 ;
		if (this.indice == 0) {
			cadena = "El almac�n est� vac�o.";
		}
		else {
			for (int pos = 0 ; pos < this.indice ; pos++) {
				cadena = cadena +
					"(" + pos + ") " +
					this.articulos[pos].toString() + "\n";
				total++;
			}
			cadena = cadena + "Se ha/n consultado " + total + " art�culo/s del almac�n.";
		}
		return cadena;
	}
	
	// Devuelve verdadero si el almac�n est� vac�o.
	// Devuelve falso en contrario.
	public boolean estaVacio() {
		return (this.indice == 0);
	}
	
	// Inserta un art�culo en el almac�n.
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
	
	// Elimina un art�culo, por posici�n, del almac�n.
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
	
	// Ordena el vector por t�tulo.
	public void ordenarPorTitulo() {
		Arrays.sort(articulos, 0, indice, new OrderPorTitulo());
	}
	
	// Devuelve una cadena de texto con las pel�culas del vector.
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
			cadena = cadena + "Se ha/n consultado " + total + " pel�cula/s del almac�n.";
		}
		
		return cadena;
	}
}

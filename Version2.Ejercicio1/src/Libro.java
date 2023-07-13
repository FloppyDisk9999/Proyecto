

// Clase Libro que hereda de Artículo y
// que añade el escritor y el formato de impresión.
public class Libro extends Articulo {

	// atributos
	private String escritor;
	private String formato;
	
	// Crea un libro a partir de cuatro parámetros.
	public Libro(String titulo, double precio, 
			     String escritor, String formato) {
		super(titulo, precio);
		this.escritor = escritor;
		this.formato = formato;
	}
	
	// Genera una cadena de caracteres con el estado del libro.
	@Override
	public String toString() {
		return
			"Libro [" +
				super.toString() +
				", Escritor=" + this.escritor +
				", Formato=" + this.formato + 
			"]";
	}
	
}

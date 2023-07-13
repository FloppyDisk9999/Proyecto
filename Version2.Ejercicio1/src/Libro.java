

// Clase Libro que hereda de Art�culo y
// que a�ade el escritor y el formato de impresi�n.
public class Libro extends Articulo {

	// atributos
	private String escritor;
	private String formato;
	
	// Crea un libro a partir de cuatro par�metros.
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

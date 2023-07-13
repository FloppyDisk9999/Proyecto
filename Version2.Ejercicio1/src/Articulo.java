

// Clase abstracta Artículo que contiene el código, el título y el precio.
public abstract class Articulo {

	// contador de artículos
	private static int total = 0;
	
	// atributos
	private int codigo;
	private String titulo;
	private double precio;  // en euros
	
	// Crea un artículo a partir de dos parámetros.
	public Articulo(String titulo, double precio) {
		Articulo.total++;
		this.codigo = Articulo.total;
		this.titulo = titulo;
		this.precio = precio;
	}
	
	// getter del atributo título
	public String getTitulo() {
		return titulo;
	}

	// Genera una cadena de caracteres con el estado del artículo.
	@Override
	public String toString() {
		return
			"Código=" + this.codigo +
			", Título=" + this.titulo + 
			", Precio=" + String.format("%.2f€", this.precio);
	}
		
}
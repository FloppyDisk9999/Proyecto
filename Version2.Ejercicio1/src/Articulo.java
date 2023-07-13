

// Clase abstracta Art�culo que contiene el c�digo, el t�tulo y el precio.
public abstract class Articulo {

	// contador de art�culos
	private static int total = 0;
	
	// atributos
	private int codigo;
	private String titulo;
	private double precio;  // en euros
	
	// Crea un art�culo a partir de dos par�metros.
	public Articulo(String titulo, double precio) {
		Articulo.total++;
		this.codigo = Articulo.total;
		this.titulo = titulo;
		this.precio = precio;
	}
	
	// getter del atributo t�tulo
	public String getTitulo() {
		return titulo;
	}

	// Genera una cadena de caracteres con el estado del art�culo.
	@Override
	public String toString() {
		return
			"C�digo=" + this.codigo +
			", T�tulo=" + this.titulo + 
			", Precio=" + String.format("%.2f�", this.precio);
	}
		
}
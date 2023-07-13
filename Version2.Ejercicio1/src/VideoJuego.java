// Clase Videojuego que hereda de Artículo y
// que añade el género y el número máximo de jugadores en modo local.
public class VideoJuego extends Articulo {

	// atributos
	private String genero;
	private int jugadoresLocal;
	
	// Crea un videojuego a partir de cuatro parámetros.
	public VideoJuego(String titulo, double precio,
			          String genero, int jugadoresLocal) {
		super(titulo, precio);
		this.genero = genero;
		this.jugadoresLocal = jugadoresLocal;
	}
	
	// Genera una cadena de caracteres con el estado del videojuego.
	@Override
	public String toString() {
		return
			"Videojuego [" +
				super.toString() +
				", Género=" + this.genero +
				", JugadoresLocal=" + this.jugadoresLocal + 
			"]";
	}
		
}

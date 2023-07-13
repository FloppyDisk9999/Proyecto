// Clase Videojuego que hereda de Art�culo y
// que a�ade el g�nero y el n�mero m�ximo de jugadores en modo local.
public class VideoJuego extends Articulo {

	// atributos
	private String genero;
	private int jugadoresLocal;
	
	// Crea un videojuego a partir de cuatro par�metros.
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
				", G�nero=" + this.genero +
				", JugadoresLocal=" + this.jugadoresLocal + 
			"]";
	}
		
}


public class EliminacionException extends RuntimeException{
	
	public EliminacionException() {
		super("Error al eliminar la película de la videoteca.\n" + 
				"No existe una película con ese año de estreno y ese título.");
	}
}


public class EliminacionException extends RuntimeException{
	
	public EliminacionException() {
		super("Error al eliminar la pel�cula de la videoteca.\n" + 
				"No existe una pel�cula con ese a�o de estreno y ese t�tulo.");
	}
}

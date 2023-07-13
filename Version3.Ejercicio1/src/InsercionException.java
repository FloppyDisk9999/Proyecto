
public class InsercionException extends RuntimeException{

	public InsercionException() {
		super("Error al insertar la pel�cula en la videoteca.\n" + 
				"Ya existe una pel�cula con ese a�o de estreno y ese t�tulo.");
	}

}

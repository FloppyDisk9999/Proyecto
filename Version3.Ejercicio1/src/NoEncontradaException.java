
public class NoEncontradaException extends RuntimeException{
	
	public NoEncontradaException() {
		super("No existe una pel�cula con ese a�o de estreno y ese t�tulo.");
	}
}

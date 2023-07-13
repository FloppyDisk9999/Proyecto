
public class NoEncontradaException extends RuntimeException{
	
	public NoEncontradaException() {
		super("No existe una película con ese año de estreno y ese título.");
	}
}


public class InsercionException extends RuntimeException{

	public InsercionException() {
		super("Error al insertar la película en la videoteca.\n" + 
				"Ya existe una película con ese año de estreno y ese título.");
	}

}

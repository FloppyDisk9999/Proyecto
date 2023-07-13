import java.util.Comparator;

public class OrderPorTitulo implements Comparator<Articulo> {

	@Override
	public int compare(Articulo a1, Articulo a2) {
		return a1.getTitulo().compareTo(a2.getTitulo());
	}

}

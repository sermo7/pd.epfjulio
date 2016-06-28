package pd.epfjulio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Comanda {

	
	private List<Producto> articulos = new ArrayList<Producto>();
	
	private double precioFinal=0;
	
	public Comanda(List<Producto> articulos){
		this.articulos = articulos;
	}
	
	public double getPrecioFinal() {
		Iterator<Producto> it = articulos.iterator();
        while (it.hasNext()) {
        	precioFinal=precioFinal+it.next().getPrecioProducto();
        }
        return precioFinal;
	}
	
	
}

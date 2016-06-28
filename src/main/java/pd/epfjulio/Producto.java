package pd.epfjulio;

public class Producto extends Familia {

	private double precio;

	public Producto(String nombre, double precio) {
        super(nombre);
        this.precio = precio;
    }
	
	@Override
	public void add(Producto producto) {
		throw new UnsupportedOperationException("Operación no soportada");
	}

	@Override
	public void add(Familia familia) {
		throw new UnsupportedOperationException("Operación no soportada");
	}

	public double getPrecioProducto(){
		return this.precio;
	}

	
	
}

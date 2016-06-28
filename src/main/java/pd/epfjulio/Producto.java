package pd.epfjulio;

public class Producto extends Familia {

	private static Producto producto = null;
	private double precio;

	public Producto(String nombre, double precio) {
        super(nombre);
        this.precio = precio;
    }
	
    public static Producto getInstance(String name, double precio) {
        // Creación perezosa
        if (Producto.producto == null) {
        	Producto.producto = new Producto(name, precio);
        }
        return Producto.producto;
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
		return precio;
	}

	
	
}

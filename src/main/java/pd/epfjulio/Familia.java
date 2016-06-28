package pd.epfjulio;

public abstract class Familia {

    private String name;

    public Familia(String name) {
    	this.name = name;
	}

	public String getName() {
		return this.name;
	}
	    
	public abstract void add(Familia familia);
	public abstract void add(Producto producto);
		
	
}

package pd.epfjulio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Conjunto extends Familia {

	private List<Familia> list;

	public Conjunto(String name) {
		super(name);
	    this.list = new ArrayList<Familia>();
	}

	@Override
	public void add(Familia familia) {
		// TODO Auto-generated method stub
		list.add(familia);		
	}

	@Override
	public void add(Producto producto) {
	// TODO Auto-generated method stub
		list.add(producto);		
	}
	
	public String getConjunto(){
		String cadenaProductos="";
		Iterator<Familia> it = this.list.iterator();
        while (it.hasNext()) {
        	cadenaProductos=cadenaProductos+it.next().getName()+",";
        }
        return cadenaProductos;
	}
	
}

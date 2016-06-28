package pd.epfjulio;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class Prueba {

	private Familia bebidas = new Conjunto("Bebidas");
	private Familia refrescos = new Conjunto("Refrescos");
	private Familia desayunos = new Conjunto("Desayunos");
	private Familia tapas = new Conjunto("Tapas");
	
	private Producto cafe = new Producto("cafe", 1.2);
	private Producto te = new Producto("te", 1.5);
	private Producto coca_cola = new Producto("coca_cola", 2);
	private Producto fanta_naranja = new Producto("fanta_naranja", 1.75);
	private Producto tostada_tomate = new Producto("tostada_tomate", 2);
	private Producto cacahuetes = new Producto("cafe", 0.75);
	private Producto patatas = new Producto("cafe", 1);
	List<Producto> articulos =new ArrayList<Producto>();
	
    @Before
    public void ini() {
    	bebidas.add(refrescos);
    	bebidas.add(cafe);
    	bebidas.add(te);
    	
    	refrescos.add(coca_cola);
    	refrescos.add(fanta_naranja);
    	
    	desayunos.add(cafe);
    	desayunos.add(te);
    	desayunos.add(tostada_tomate);
    	
    	tapas.add(cacahuetes);
    	tapas.add(patatas);
    	
		articulos.add(te);
		articulos.add(tostada_tomate);
    }
	
    @Test
	public void testFamiliaBebida(){
		assertEquals("Bebidas", bebidas.getName());
	}
	
    @Test
	public void testCafe(){
		assertEquals("cafe", cafe.getName());
		assertEquals(1.2, cafe.getPrecioProducto(), 0.0001);
	}
    
    @Test
	public void testComanda1(){
    	Comanda comanda1 = new Comanda(articulos);
		assertEquals(3.5, comanda1.getPrecioFinal(), 0.0001);
	}
    
	
}

package pd.epfjulio;

import java.util.ArrayList;
import java.util.List;

public class Prueba {

	public static void main(String[] args){
		
		Familia bebidas = new Conjunto("Bebidas");
		Familia refrescos = new Conjunto("Refrescos");
		Familia desayunos = new Conjunto("Desayunos");
		Familia tapas = new Conjunto("Tapas");
		
		Producto cafe = new Producto("cafe", 1.2);
		Producto te = new Producto("te", 1.5);
		Producto coca_cola = new Producto("coca_cola", 2);
		Producto fanta_naranja = new Producto("fanta_naranja", 1.75);
		Producto tostada_tomate = new Producto("tostada_tomate", 2);
		Producto cacahuetes = new Producto("cafe", 0.75);
		Producto patatas = new Producto("cafe", 1);
		
		
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
		
		List<Producto> articulos =new ArrayList<Producto>();
		articulos.add(te);
		articulos.add(tostada_tomate);
		Comanda comanda1 = new Comanda(articulos);
		
		System.out.println("Precio comanda1: "+ comanda1.getPrecioFinal());
		
	}
	
	
}

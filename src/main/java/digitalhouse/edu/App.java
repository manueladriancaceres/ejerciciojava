package digitalhouse.edu;

import java.util.ArrayList;

import digitalhouse.edu.servicios.DesdeHasta;

public class App {

	public static void main(String[] args) {
		
		ArrayList<Producto> productos = new ArrayList<Producto>();
		
		productos.add(new Producto(1,"Remera",1000.0));
		productos.add(new Producto(2,"Pantalon",2000.0));
		
		// filtro por id
		// filtro por desc
		// filtro por importe
		
		DesdeHasta<Integer,Integer> desdeHasta = new DesdeHasta<Integer,Integer>();
		desdeHasta.setDesde(2);
		desdeHasta.setHasta(2);
		
		for(Producto producto : productos) {
			if(producto.getId() >= desdeHasta.getDesde() && producto.getId() <= desdeHasta.getHasta()) {
				System.out.println(producto);
			}
		}
		
		
	}

}

package principal;

import clases.Electrodomestico;
import clases.Lavadora;
import clases.Television;

public class ElectrodomesticoApp {
	
	static Electrodomestico[] arrayElectro;
	static int totalLavadoras;
	static int totalTelevisiones;
	static int totalElectrodomesticos;
	
	public static void main(String[] args) {
		
		arrayElectro = new Electrodomestico[10];
		
		arrayElectro[0] = new Electrodomestico(700, 10, "blanco", "A");
		arrayElectro[1] = new Lavadora(200, 150, "blanco", "A");
		arrayElectro[2] = new Television(200, 50, "gris", "A");
		arrayElectro[3] = new Electrodomestico(100, 20, "blanco", "E");
		arrayElectro[4] = new Television(500, 20, "blanco", "F");
		arrayElectro[5] = new Electrodomestico(100, 50, "blanco", "A");
		arrayElectro[6] = new Lavadora(700, 80, "blanco", "A");
		arrayElectro[7] = new Electrodomestico(100, 50, "blanco", "E");
		arrayElectro[8] = new Television(400, 10, "blanco", "A");
		arrayElectro[9] = new Electrodomestico(900, 50, "blanco", "A");
		
		for (int i = 0; i < arrayElectro.length; i++) {
			
			if (arrayElectro[i] instanceof Electrodomestico) {
				totalElectrodomesticos += arrayElectro[i].getPrecioBase();
			}
			
			if (arrayElectro[i] instanceof Lavadora) {
				totalLavadoras += arrayElectro[i].getPrecioBase();
			}
			
			if (arrayElectro[i] instanceof Television) {
				totalTelevisiones += arrayElectro[i].getPrecioBase();
			}
			
		}
		
		imprimirTotales();
		
	}
	
	static void imprimirTotales() {
		System.out.println("PRECIO TOTAL ELECTRODOMÉSTICOS: " + totalElectrodomesticos);
		System.out.println("PRECIO TOTAL LAVADORAS: " + totalLavadoras);
		System.out.println("PRECIO TOTAL TELEVISIONES: " + totalTelevisiones);
	}
	
	

}

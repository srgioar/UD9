package main;

import java.util.concurrent.ThreadLocalRandom;

import clases.Espectador;
import clases.Pelicula;

public class CineApp {
	
	// en vez de crear un array de asientos, la matriz son booleanos
	
	static boolean arrayAsientos[][];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pelicula peli1 = new Pelicula("Hermanos por pelotas", 7, 120);
		Pelicula peli2 = new Pelicula("Scream 4", 18, 140);
		Pelicula peli3 = new Pelicula("Pacific Rim", 13, 80);
		
		Espectador espec1 = new Espectador("Victor Gallardo", 3, 8);
		Espectador espec2 = new Espectador("Adrian Serena", 14, 20);
		Espectador espec3 = new Espectador("Fernando de la Oliva", 37, 200);
		Espectador es3 = new Espectador("Javi", 45, 70);
		Espectador es5 = new Espectador("Pepe", 6, 90);
		
		arrayAsientos = new boolean[8][8];
		
		// Iniciar todos los asientos a false (vacíos)
		inicializarAsientos();
		
		// llenar una posición de prueba (0-5)
		llenarUnAsiento();
		
		// Pintar asientos para comprobar el estado de los asientos (true-false / lleno-vacío)
		pintarAsientos();
		
		
	}
	
	static void inicializarAsientos() {
		// inciializa todo a false
		
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				
				int randomCol = ThreadLocalRandom.current().nextInt(1, 8+1);
				int randomFila = ThreadLocalRandom.current().nextInt(1, 8+1);
				
					arrayAsientos[i][j] = false;
					//System.out.println("pasa x aqui");
			}
		}
		
		
	}
	
	// recorre el array y nos avisa si está la sala completa
	static boolean chequearSalaLlena() {
		
		boolean control = false;
		
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				
					if (arrayAsientos[i][j] = false) {
						control = true;
						// Si hay una posición vacía, control es false
					}
					//System.out.println("pasa x aqui");
			}
		} // FIN DEL FOR
		
		return control;
		
	}
	
	static void llenarAsientos() {
//		int randomCol = ThreadLocalRandom.current().nextInt(1, 8+1);
//		int randomFila = ThreadLocalRandom.current().nextInt(1, 8+1);
		
		// Meter a alguien en una posición random
		
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				
				int randomCol = ThreadLocalRandom.current().nextInt(1, 8+1);
				int randomFila = ThreadLocalRandom.current().nextInt(1, 8+1);
				
				if (!arrayAsientos[i][j]) {
					arrayAsientos[i][j] = true;
				}

			}
		}
		
	}
	
	// Función de testeo
	static void pintarAsientosBool() {
		
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				
				int randomCol = ThreadLocalRandom.current().nextInt(1, 8+1);
				int randomFila = ThreadLocalRandom.current().nextInt(1, 8+1);
				
				if (!arrayAsientos[i][j]) {
					System.out.println("Es false");
				}
				
				else if (arrayAsientos[i][j]) {
					System.out.println("es true");
				}

			}
		}
		
	}
	
	// Función de testeo
	static void llenarUnAsiento() {
		arrayAsientos[0][5] = true;
		System.out.println(arrayAsientos[0][5]);
	}
	
	static void pintarAsientos(){
		
		// Fuerzo a indicar si es true o false con strings porque inexplicablemente me devolvía todo el array false al pintarlo
		
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				
				String asientoLleno = "";
				
				if (arrayAsientos[i][j]) {
					asientoLleno = "Es true";
				}
				
				else if (!arrayAsientos[i][j]) {
					asientoLleno = "Es false";
				}
				
				if (j < 7) {
					System.out.print("F" + i + " " + "C" + j + " lleno: " + asientoLleno + "  ");
				}
				
				else {
					System.out.println("F" + i + " " + "C" + j + " lleno: " + asientoLleno + "  ");
				}

			}
		}
	}

}

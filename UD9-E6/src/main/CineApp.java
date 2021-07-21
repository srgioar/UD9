package main;

import java.util.concurrent.ThreadLocalRandom;

import clases.Espectador;
import clases.Pelicula;

public class CineApp {
	
	// en vez de crear un array de asientos, la matriz son booleanos
	
	static boolean arrayAsientos[][];
	
	static Pelicula peliElegida = null;
	
	static Espectador[] arrayEspectadores;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pelicula peli1 = new Pelicula("Hermanos por pelotas", 7, 120);
		Pelicula peli2 = new Pelicula("Scream 4", 18, 140);
		Pelicula peli3 = new Pelicula("Pacific Rim", 13, 80);
		
		Espectador es1 = new Espectador("Victor Gallardo", 3, 8);
		Espectador es2 = new Espectador("Adrian Serena", 14, 20);
		Espectador es3 = new Espectador("Fernando de la Oliva", 37, 200);
		Espectador es4 = new Espectador("Javi", 45, 70);
		Espectador es5 = new Espectador("Pepe", 6, 90);
		
		arrayAsientos = new boolean[8][8];
		arrayEspectadores = new Espectador[5];
		arrayEspectadores[0] = es1;
		arrayEspectadores[1] = es2;
		arrayEspectadores[2] = es3;
		arrayEspectadores[3] = es4;
		arrayEspectadores[4] = es5;
		
		peliElegida = peli3;

		
		// Iniciar todos los asientos a false (vacíos)
		inicializarAsientos();
		
		// llenar una posición de prueba (0-5)
		llenarUnAsiento();
		
		// Pintar asientos para comprobar el estado de los asientos (true-false / lleno-vacío)
		pintarAsientos();
		System.out.println();
		
		// Llena asientos según la cantidad de espectadores del array
		for (int i = 0; i < arrayEspectadores.length; i++) {
			if (comprobarPeli(arrayEspectadores[i], peliElegida)) {
				llenarAsiento(arrayEspectadores[i]);
			}
		}
		
	}
	
	// comprobar si el espectador puede acceder a la peli
	static boolean comprobarPeli(Espectador e, Pelicula p) {
		
		if (e.getEdad() < p.getEdad()) {
			System.out.println("Espectador " + e.getNombre() + " no admitido");
			return false;
		}
		
		else {
			return true;
		}
		
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
	
	static void llenarAsiento(Espectador espectador) {
		
		int randomFila = ThreadLocalRandom.current().nextInt(1, 8+1);
		int randomCol = ThreadLocalRandom.current().nextInt(1, 8+1);
		
//		System.out.println("randomFila: " + randomFila);
//		System.out.println("randomCol: " + randomCol);
		
		if (arrayAsientos[randomFila-1][randomCol-1]) {
			randomFila = ThreadLocalRandom.current().nextInt(1, 8+1);
			randomCol = ThreadLocalRandom.current().nextInt(1, 8+1);
			// Llamando la función a sí misma en teoría no hacen falta las dos asignaciones anteriores
			System.out.println("Asiento LLENO! Reasignando...");
			llenarAsiento(espectador);
		}
		
		else {
			System.out.println(espectador.getNombre() + " Sentado en: " + randomFila + " " + randomCol);
		}
		
	}
	
	static void llenarAsientos() {
//		int randomCol = ThreadLocalRandom.current().nextInt(1, 8+1);
//		int randomFila = ThreadLocalRandom.current().nextInt(1, 8+1);
		
		// Meter a alguien en una posición random
		
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
			
				if (!arrayAsientos[i][j]) {
					arrayAsientos[i][j] = true;
				}

			}
		}
		
	}
	
	// Función de testeo
	static void llenarUnAsiento() {
		arrayAsientos[0][5] = true;
		System.out.println("Valor posición 1 - 6: " + arrayAsientos[0][5]);
	}
	
	static void pintarAsientos(){
		
		// Fuerzo a indicar si es true o false con strings porque inexplicablemente me devolvía todo el array false al pintarlo
		
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				
				String asientoLleno = "";
				
				if (arrayAsientos[i][j]) {
					asientoLleno = "OCUPADO";
				}
				
				else if (!arrayAsientos[i][j]) {
					asientoLleno = "VACÍO";
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

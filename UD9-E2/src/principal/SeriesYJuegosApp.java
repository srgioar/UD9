package principal;

import clases.Serie;
import clases.Videojuego;

public class SeriesYJuegosApp {
	
	public static void main(String[] args) {
		
		Videojuego[] arrayJuegos = new Videojuego[5];
		Serie[] arraySeries = new Serie[5];
		
		arrayJuegos[0] = new Videojuego("GTA 4", 80, "Velocidad", "Take2");
		arrayJuegos[1] = new Videojuego("Ninja Gaiden 3", 22, "Velocidad", "TECMO");
		arrayJuegos[2] = new Videojuego("Halo 3", 8, "Shooter", "Bungie");
		arrayJuegos[3] = new Videojuego("Mario Kart Wii", 6, "Velocidad", "Nintendo");
		arrayJuegos[4] = new Videojuego("Halo 2", 120, "Shooter", "Bungie");
		
		arraySeries[0] = new Serie("Expediente X", 7, "Misterio", "Chris Carter");
		arraySeries[1] = new Serie("Game of Thrones", 9, "Intriga", "HBO");
		arraySeries[2] = new Serie("The Sopranos", 3, "Drama", "David Chase");
		arraySeries[3] = new Serie("Pesadillas", 2, "Misterio", "RL Stine");
		arraySeries[4] = new Serie("Misfits", 4, "Misterio", "Channel 4");
		
		arraySeries[4].entregar();
		
		arrayJuegos[0].entregar();
		
		// Contador de objetos totales prestados
		int contadorPrestados = 0;
		// Uso dos contadores adicionales para comparar y sacar los más longevos en el for posterior
//		int contadorTemporadas = 0;
//		int contadorHoras = 0;
		
		// Uso dos objetos para asignar
		Serie serieMasLarga = null;
		Videojuego juegoMasLargo = null;
		
		for (int i = 0; i < arrayJuegos.length; i++) {
		
			if (arrayJuegos[i].isEntregado()) {
				contadorPrestados++;
				arrayJuegos[i].devolver();
			}
			
			if (arraySeries[i].isEntregado()) {
				contadorPrestados++;
				arraySeries[i].devolver();
			}
		
		} // FIN DEL FOR
		
		for (int i = 0; i < arrayJuegos.length-1; i++) {
			
			
		
		} // FIN DEL FOR
		
		System.out.println("Contador de juegos y series prestados: " + contadorPrestados);
		
		/*
		System.out.println("El juego más largo es " + juegoMasLargo.getTitulo());
		System.out.println("Parámetros completos del JUEGO: " + juegoMasLargo.toString());
		System.out.println("La serie con más temporadas es" + serieMasLarga.getTitulo());
		System.out.println("Parámetros completos de la SERIE: " + serieMasLarga.toString());
		
		*/
		
	}

}

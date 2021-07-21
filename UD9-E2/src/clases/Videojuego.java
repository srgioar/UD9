package clases;

import interfaces.Entregable;

public class Videojuego implements Entregable {
	
	String titulo;
	int horasEstimadas;
	boolean entregado = false;
	String genero;
	String compa�ia;
	
	public Videojuego() {
		this.horasEstimadas = 10;
		this.entregado = false;
	}
	
	public Videojuego(String titulo, int horasEstimadas) {
		this.entregado = false;
	}
	
	public Videojuego(String titulo, int horasEstimadas, String genero, String compa�ia) {
		this.entregado = false;
		
	}

	public void entregar() {
		// TODO Auto-generated method stub
		this.entregado = true;
		
	}

	public void devolver() {
		// TODO Auto-generated method stub
		this.entregado = false;
		
	}

	public boolean isEntregado() {
		// TODO Auto-generated method stub
		return this.entregado;
		
	}

	public void compareTo(Object a) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		return "M�todo reescrito!";
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompa�ia() {
		return compa�ia;
	}

	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
	}

}

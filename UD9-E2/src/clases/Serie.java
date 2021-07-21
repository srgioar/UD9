package clases;

import interfaces.Entregable;

public class Serie implements Entregable {
	
	String titulo;
	int numeroDeTemporadas;
	boolean entregado;
	String genero;
	String creador;
	
	public Serie() {
		numeroDeTemporadas = 3;
		entregado = false;
		
	}
	
	public Serie(String titulo, String creador) {
		numeroDeTemporadas = 3;
		this.entregado = false;
	}
	

	public Serie(String titulo, int numeroDeTemporadas, String genero, String creador) {
		this.entregado = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroDeTemporadas() {
		return numeroDeTemporadas;
	}

	public void setNumeroDeTemporadas(int numeroDeTemporadas) {
		this.numeroDeTemporadas = numeroDeTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	// Sobreescribir toString() con un override
	@Override
	public String toString() {
		return "Método reescrito!";
		
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

}

package clases;

public class Pelicula {
	
	String nombre;
	int edad;
	int duracion;
	
	public Pelicula(String nombre, int edad, int duracion){
		this.nombre = nombre;
		this.edad = edad;
		this.duracion = duracion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}


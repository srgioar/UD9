package clases;

public abstract class Persona {
	
	String nombre;
	int edad;
	char sexo;
	boolean disponible;
	final char SEXO_MASC = 'M';
	final char SEXO_FEM = 'F';
	
	public Persona() {
		this.disponible = false;
	}
	
	public Persona(String nombre2, int edad2, char sexo2) {
		// TODO Auto-generated constructor stub
		this.disponible = false;
	}
	
	public boolean estaDisponible() {
		return this.disponible;
	}
	
	public static boolean calcularDisponibilidad(Profesor p) {
		int rand = (int) (1 + Math.random() * 10);
		boolean disponible = (rand > 2);
		System.out.println("disp " + rand);
		return disponible;
	}

	public static boolean calcularDisponibilidad(Estudiante e) {
		boolean disponible = ((1 + Math.random() * 10) > 5);
		return disponible;
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

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	


}

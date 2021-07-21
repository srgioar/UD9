package clases;

public class Profesor extends Persona {
	
	String tipoProfesor;
	final String PROF_MATES = "Matem�ticas";
	final String PROF_FILO = "Filosof�a";
	final String PROF_FISICA = "F�sica";

	// Constructor de profesor que usaremos
	
	public Profesor(String nombre, int edad, char sexo, String tipoProfesor) {
		// constructor completo
		super(nombre, edad, sexo);
		this.disponible = Persona.calcularDisponibilidad(this);
		this.tipoProfesor = tipoProfesor;
		checkProfesor();
	}
	
	public void checkProfesor() {
		
		if (tipoProfesor.equalsIgnoreCase("Matem�ticas") || tipoProfesor.equalsIgnoreCase("matematicas")) {
			tipoProfesor = PROF_MATES;
		}
		
		if (tipoProfesor.equalsIgnoreCase("Filosof�a") || tipoProfesor.equalsIgnoreCase("filosofia")) {
			tipoProfesor = PROF_FILO;
		}
		
		if (tipoProfesor.equalsIgnoreCase("F�sica") || tipoProfesor.equalsIgnoreCase("fisica")) {
			tipoProfesor = PROF_FISICA;
		}
		
	}

	public String getTipoProfesor() {
		return tipoProfesor;
	}

	public void setTipoProfesor(String tipoProfesor) {
		this.tipoProfesor = tipoProfesor;
	}

}

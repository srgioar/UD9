package clases;

public class Aula {
	
	int identificador, maxEstudiantes;
	String proposito;
	String AULA_MATES = "Matemáticas";
	String AULA_FILO = "Filosofía";
	String AULA_FISICA = "Física";
	
	public Aula(int identificador, int maxEstudiantes, String proposito) {
		this.identificador = identificador;
		this.maxEstudiantes = maxEstudiantes;
		this.proposito = proposito;
		
		if (proposito.equalsIgnoreCase("Matemáticas") || proposito.equalsIgnoreCase("matematicas")) {
			proposito = AULA_MATES;
		}
		
		if (proposito.equalsIgnoreCase("Filosofía") || proposito.equalsIgnoreCase("filosofia")) {
			proposito = AULA_FILO;
		}
		
		if (proposito.equalsIgnoreCase("Física") || proposito.equalsIgnoreCase("fisica")) {
			proposito = AULA_FISICA;
		}
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public int getMaxEstudiantes() {
		return maxEstudiantes;
	}

	public void setMaxEstudiantes(int maxEstudiantes) {
		this.maxEstudiantes = maxEstudiantes;
	}

	public String getProposito() {
		return proposito;
	}

	public void setProposito(String proposito) {
		this.proposito = proposito;
	}
	

}

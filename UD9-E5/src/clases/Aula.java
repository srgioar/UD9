package clases;

public class Aula {
	
	int identificador, maxEstudiantes;
	String proposito;
	String AULA_MATES = "Matem�ticas";
	String AULA_FILO = "Filosof�a";
	String AULA_FISICA = "F�sica";
	
	public Aula(int identificador, int maxEstudiantes, String proposito) {
		this.identificador = identificador;
		this.maxEstudiantes = maxEstudiantes;
		this.proposito = proposito;
		
		if (proposito.equalsIgnoreCase("Matem�ticas") || proposito.equalsIgnoreCase("matematicas")) {
			proposito = AULA_MATES;
		}
		
		if (proposito.equalsIgnoreCase("Filosof�a") || proposito.equalsIgnoreCase("filosofia")) {
			proposito = AULA_FILO;
		}
		
		if (proposito.equalsIgnoreCase("F�sica") || proposito.equalsIgnoreCase("fisica")) {
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

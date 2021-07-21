package clases;

public class Estudiante extends Persona {
	
	int nota;
	
	// Constructor que utilizamos
	public Estudiante() {
		this.nombre = null;
		this.edad = (int) (16 + Math.random() * (55-16));
		this.sexo = randomizarSexo();
		this.nota = randomizarNotas();
		this.disponible = Persona.calcularDisponibilidad(this);
	}
	
	int randomizarNotas() {
		int randomNum = (int) (1+ Math.random() * 10);
		return randomNum;
	}
	
	public int getNota() {
		return this.nota;
	}
	
	char randomizarSexo() {
		
		// masculino por def
		int randomNum = (int) (1+ Math.random() * 2);
		switch(randomNum) {
		case 1:
			return 'm';
		case 2:
			return 'f';
		}
			return 'm';
	}

}

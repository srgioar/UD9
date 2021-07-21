package main;

import clases.Aula;
import clases.Estudiante;
import clases.Profesor;

public class ClaseApp {
	
	static Estudiante arrayEstudiantes[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aula aula1 = new Aula(108, 40, "Matemáticas");
		Aula aula2 = new Aula(99, 24, "Física");
		Aula aula3 = new Aula(77, 44, "Filosofía");
		
		// Creamos profesor con matemáticas en lowercase para probar si la función que hace el check de strings funciona
		Profesor prof1 = new Profesor("profe1", 66, 'm', "matematicas");

		// Iniciamos una cantidad entre 1 y 55 alumnos
		int randomNum = (int) (1+ Math.random() * 55);
		
		arrayEstudiantes = new Estudiante[randomNum];
		
		llenarEstudiantes();
		
		System.out.println();
		System.out.println("INFORMACIÓN DE LA CLASE PROGRAMADA: ");
		System.out.println("------------------------------------");
		
		System.out.println("Tipo Aula: " + aula1.getProposito());
		
		System.out.println("Tipo Profesor: " + prof1.getTipoProfesor());
		
		System.out.println("¿Está disponible el profesor? " + prof1.isDisponible());
		
		System.out.println("Capacidad de la clase: " + aula1.getMaxEstudiantes());
		
		System.out.println("Estudiantes que acuden: " + arrayEstudiantes.length);
		
		System.out.println("¿SE PUEDE DAR CLASE? " + TestearClasePosible(aula1, prof1, arrayEstudiantes));

	}
	
	static void llenarEstudiantes() {
		
		//Pillamos el array de estudiantes inicializado y lo llenamos de objeto estudiante
		// El constructor es especial para que pillen valores random al inicializarse (los estudiantes dentro del array)
		
		System.out.println("ESTUDIANTES: ");
		System.out.println("-------------");

		for (int i = 0; i < arrayEstudiantes.length; i++) {
			arrayEstudiantes[i] = new Estudiante();
			System.out.println("Sexo: " + arrayEstudiantes[i].getSexo() + " Edad: " + arrayEstudiantes[i].getEdad() + " Nota: " + arrayEstudiantes[i].getNota() + " Disponibilidad: " + Estudiante.calcularDisponibilidad(arrayEstudiantes[i]));
		}
		
	}
	
	// Pilla un aula y un profesor y decide si la clase es posible, calculando probabilidad
	static boolean TestearClasePosible(Aula aula, Profesor prof, Estudiante[] arrayEstudiantes) {
		
		int contadorEstudiantes = 0;
		// Chequear cuantos de los estudiantes están disponibles
		for (int i = 0; i < arrayEstudiantes.length; i++) {
			if (Estudiante.calcularDisponibilidad(arrayEstudiantes[i])) {
				contadorEstudiantes++;
			}
		}
		
		System.out.println("Estudiantes disponibles: " + contadorEstudiantes);
		
		// Si el tipo de aula y de profesor coinciden...
		// Si el contador de estudiantes disponibles es menor o igual al máximo de capacidad del aula...
		// y el profesor está disponible, clase ok. De lo contrario false
		
		if (aula.getProposito().equals(prof.getTipoProfesor()) && prof.isDisponible() && contadorEstudiantes <= aula.getMaxEstudiantes()) {
			return true;
		}
		
		else {
			return false;
		}
		
	}

}

package main;

import clases.Libro;

public class LibroApp {
	
	public static void main(String[] args) {
		
		Libro libro1 = new Libro("978-3-16-148410-0", "Libro1", "Autor1", 122);
		Libro libro2 = new Libro("878-4-29-958460-3", "Libro2", "Autor2", 146);
		
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		
		System.out.println(conteoPaginas(libro1, libro2));
		
	}
	
	static String conteoPaginas(Libro libro1, Libro libro2) {
		
		String libroMayor = "";
		
		if (libro1.getnPaginas() > libro2.getnPaginas()) {
			libroMayor = libro1.getTitulo() + " tiene más páginas.";
		}
		
		else if (libro1.getnPaginas () < libro2.getnPaginas()) {
			libroMayor = libro2.getTitulo() + " tiene más páginas.";
		}
		
		return libroMayor;
		
	}

}

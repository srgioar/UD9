package clases;

public class Libro {
	
	String ISBN, titulo, autor;
	int nPaginas;
	
	public Libro() {
		
	}

	public Libro(String ISBN, String titulo, String autor, int nPaginas) {
		// TODO Auto-generated constructor stub
		//this(ISBN, titulo, autor, nPaginas);
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.autor = autor;
		this.nPaginas = nPaginas;
		
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getnPaginas() {
		return nPaginas;
	}

	public void setnPaginas(int nPaginas) {
		this.nPaginas = nPaginas;
	}

	@Override
	public String toString() {
		return "El libro con ISBN " + ISBN + " creado por el autor " + autor + " tiene " + nPaginas + " páginas. \n";
	}

}

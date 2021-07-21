package clases;

public class Electrodomestico {
	
	// HEREDABLES
	protected int precioBase;
	protected String color;
	protected char consumo;
	protected double peso;
	
	final String COLOR_BLANCO = "blanco";
	final String COLOR_ROJO = "rojo";
	final String COLOR_AZUL = "azul";
	final String COLOR_GRIS = "gris";
	
	final char CONSUMO_DEFAULT = 'F';
	final char CONSUMO_A = 'A';
	final char CONSUMO_B = 'B';
	final char CONSUMO_C = 'C';
	final char CONSUMO_D = 'D';
	final char CONSUMO_E = 'E';
	final char CONSUMO_F = 'F';
	
	public Electrodomestico() {
		this.color = COLOR_BLANCO;
		this.consumo = 'F';
		this.precioBase = 100;
		this.peso = 5;
	}
	
	public Electrodomestico(int precioBase, double peso) {
		this.color = COLOR_BLANCO;
		this.consumo = CONSUMO_DEFAULT;
	}
	
	public Electrodomestico(int precioBase, double peso, String color, String consumo) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = comprobarColor(color);
		this.consumo = comprobarConsumoEnergetico(consumo);
	}
	
	private String comprobarColor(String color) {
		
		String colorMinus = color.toLowerCase();
		
		switch (color) {
		case "blanco":
				this.color = COLOR_BLANCO;
				break;
		case "azul":
				this.color = COLOR_AZUL;
				break;
		case "rojo":
				this.color = COLOR_ROJO;
				break;
		case "gris":
				this.color = COLOR_GRIS;
				break;
		default:
			this.color = COLOR_BLANCO;
			break;
		}
		
		return color;
	}
	
	private char comprobarConsumoEnergetico(String consumo) {
		
		char letraFinal = consumo.toLowerCase().charAt(0);
	
		switch(letraFinal) {
		case 'A':
			letraFinal = CONSUMO_A;
			break;
		case 'B':
			letraFinal = CONSUMO_B;
			break;
		case 'C':
			letraFinal = CONSUMO_C;
			break;
		case 'D':
			letraFinal = CONSUMO_D;
			break;
		case 'E':
			letraFinal = CONSUMO_E;
			break;
		case 'F':
			letraFinal = CONSUMO_F;
			break;
		default:
			letraFinal = CONSUMO_DEFAULT;
		}
		
		return letraFinal;
		
	}
	
	public void precioFinal() {
		
		int precio = 0;
		double pesoF = this.peso;
		char con = this.consumo;
		
		switch(con) {
		case 'A':
			precio += 100;
			break;
		case 'B':
			precio += 80;
			break;
		case 'C':
			precio += 60;
			break;
		case 'D':
			precio += 50;
			break;
		case 'E':
			precio += 30;
			break;
		case 'F':
			precio += 10;
			break;
		}
		
		if (pesoF > 0 && pesoF < 20) {
			precio += 10;
		}
		
		else if (pesoF > 19 && pesoF < 50) {
			precio += 50;
		}
		
		else if (pesoF > 50 && pesoF < 80) {
			precio += 80;
		}
		
		else if (pesoF > 80) {
			precio += 100;
		}
		
		this.precioBase = precioBase + precio;
		
	}

	public int getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumo() {
		return consumo;
	}

	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}

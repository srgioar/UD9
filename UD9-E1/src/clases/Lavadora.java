package clases;

public class Lavadora extends Electrodomestico {
	
	int CARGA = 5;
	int carga;
	
	public Lavadora() {
		super();
		this.carga = CARGA;
	}
	
	public Lavadora(int precioBase, double peso, String color, String consumo) {
		super(precioBase, peso, color, consumo);
	}

	public int getCarga(){
		return carga;
	}
	
	public void precioFinal() {
		super.precioFinal();
		if (this.carga > 30) {
			this.precioBase += 50;
		}
	}

}

package clases;

public class Television extends Electrodomestico {
	
	int resolucion;
	boolean tdt;
	
	public Television() {
		resolucion = 20;
		tdt = false;
	}
	
	public Television(double precioBase, double peso) {
		resolucion = 20;
		tdt = false;
	}
	
	public Television(int precioBase, double peso, String color, String consumo) {
		super(precioBase, peso, color, consumo);
		resolucion = 20;
		tdt = false;
	}
	
	public void precioFinal() {
		
		super.precioFinal();
		if (resolucion > 40) {
			this.precioBase += this.precioBase * 0.30;
		}
		
		if (tdt) {
			this.precioBase += 50;
		}
		
	}

	public int getResolucion() {
		return resolucion;
	}

	public boolean isTdt() {
		return tdt;
	}

}


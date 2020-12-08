package tarea4Laura;

public class Bombon {

	private String sabor;
	private int cantidad;
	private String forma;
	
	public Bombon(String sabor, int cantidad, String forma) {
		super();
		this.sabor = sabor;
		this.cantidad = cantidad;
		this.forma = forma;
	}

	public Bombon() {
		super();
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	@Override
	public String toString() {
		return "Bombon [sabor=" + sabor + ", cantidad=" + cantidad + ", forma=" + forma + "]";
	}
	
	
	
}

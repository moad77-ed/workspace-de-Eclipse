package metodos;

public class Coche {
	private String marca;
	private String modelo;
	private int anio;
	
	public String getMarca() {
		return this.marca;
	}
	public void setMarca(String marca) {
		if(marca.length() > 0) {
			this.marca = marca;
		}
	}
	
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String modelo) {
		if(modelo.length() > 0) {
			this.modelo = modelo;
		}
	}
	
	public int getAnio() {
		return this.anio;
	}
	public void setAnio(int anio) {
		if(anio >= 1900 && anio <= 2030) {
			this.anio = anio;
		}
	}
	
	public void info() {
		System.out.println(this.marca + " " + this.modelo + " (" + this.anio + ")");
	}
	
	// Declaramos el método toString() para sobreescribir el que se crea por defecto, pero con una funcionalidad personalizada
	public String toString() {
		return this.marca + " " + this.modelo;
	}
}

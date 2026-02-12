package metodos;

public class Animal {
	private String especie;
	private String nombre;
	private double peso;
	
	// Constructor: Sirve para asignar valores al objeto al instanciarse, es decir, en el momento de la creación
	public Animal(String especie, String nombre, double peso) {
		this.especie = especie;
		this.nombre = nombre;
		this.peso = peso > 0 ? peso : 0;
	}
	
	public Animal() {
		this.especie = "";
		this.nombre = "";
		this.peso = 0;
	}
	
	public String getEspecie() {
		return this.especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getPeso() {
		return this.peso;
	}
	public void setPeso(double peso) {
		if(peso > 0) {
			this.peso = peso;
		}
	}
}

package metodos;

public class Persona {
	public String nombre;
	public String apellidos;
	public String dni;
	public String direccion;
	
	// Creamos un metodo para dar una funcionalidad a los objetos instanciados
	public String nombreCompleto() {
		return nombre + " " + apellidos;
	}
}

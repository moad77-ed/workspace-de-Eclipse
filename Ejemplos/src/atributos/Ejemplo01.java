package atributos;
public class Ejemplo01 {
	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.nombre = "David";
		p1.apellidos = "Munuera Sánchez";
		p1.dni = "12345678A";
		p1.fechaNac = "01/01/1988";
		
		System.out.println("Nombre completo: " + p1.nombre + " " + p1.apellidos);
		System.out.println("DNI: " + p1.dni);
		System.out.println("Fecha nacimiento: " + p1.fechaNac);
		
		System.out.println("\nFin de programa");
	}
}

class Persona {
	public String nombre;
	public String apellidos;
	public String dni;
	public String fechaNac;
}
package metodos;

public class Estudiante {
	public String nombre;
	public String apellidos;
	public double calificacion;
	
	public double getCalificacion() {
		return calificacion;
	}
	
	// El método controla que la nota recibida sea válida
	public void setCalificacion(double nota) {
		if(nota >= 0 && nota <= 10) {
			calificacion = nota;
		}
	}
	
	
}

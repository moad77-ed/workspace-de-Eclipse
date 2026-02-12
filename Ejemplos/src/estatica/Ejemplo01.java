package estatica;

public class Ejemplo01 {
	public static void main(String[] args) {
		Alumno alu1 = new Alumno(1, "David", "Munuera", "01/01/1988", "david.munuera@murciaeduca.es");
		Alumno alu2 = new Alumno(2, "Juan", "Oñate", "20/03/2007", "juano@gmail.com");
		
		// Dado que el alumno no tiene métodos estáticos, es necesario instanciar un objeto para acceder a los métodos, ya que estos utilizan atributos del objeto, por lo que cada objeto tendrá un comportamiento distinto al tener un estado distinto
		System.out.println("Alumno 1: " + alu1.getEmail());
		System.out.println("Alumno 2: " + alu2.getEmail());
		
		// Los métodos estáticos permite ser llamados sin tener que instancia un objeto de esa clase, ya que no acceder a atributos de la clase para cambiar su valor, es decir, solo trabajan con lo recibido por parámetro (o sin recibir nada)
		double resultado = Math.pow(2, 8);
		System.out.println("2 elevado a 8 = " + resultado);
	}

}

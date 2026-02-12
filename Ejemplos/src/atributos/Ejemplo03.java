package atributos;
import atributosEjemplo03.Coche;

public class Ejemplo03 {
	public static void main(String[] args) {
		Coche c1 = new Coche();
		
		c1.marca = "Ford";
		c1.modelo = "Focus";
		c1.color = "Azul";
		c1.matricula = "1234BCD";
		
		System.out.println(c1.marca + " " + c1.modelo + " " + c1.color + " (" + c1.matricula + ")");
	}
}

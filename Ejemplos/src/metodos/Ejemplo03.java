package metodos;
import java.util.Scanner;

public class Ejemplo03 {
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Especie: ");
		String especie = teclado.nextLine().trim();
		
		System.out.print("Nombre: ");
		String nombre = teclado.nextLine().trim();
		
		System.out.print("Peso: ");
		double peso = Double.parseDouble(teclado.nextLine().trim());
		
		Animal a1 = new Animal(especie, nombre, peso);

		System.out.println("Animal: " + a1.getEspecie());
		a1.setEspecie("Gato");
		System.out.println("Animal: " + a1.getEspecie());
		
		Animal a2 = new Animal();
	}

}

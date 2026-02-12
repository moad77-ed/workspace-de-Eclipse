package metodos;
import java.util.Scanner;

public class Ejercicio1_1 {
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		Coche c1 = new Coche();
		
		System.out.print("Marca: ");
		String marca = teclado.nextLine().trim();
		c1.setMarca(marca);
		
		System.out.print("Modelo: ");
		String modelo = teclado.nextLine().trim();
		c1.setModelo(modelo);
		
		System.out.print("Año: ");
		int anio = Integer.parseInt(teclado.nextLine().trim());
		c1.setAnio(anio);
		
		c1.info();
		System.out.println(c1);
	}
}

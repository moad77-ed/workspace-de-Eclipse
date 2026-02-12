package ficheros;

import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException; // Import the IOException class
import java.util.Scanner;

public class Ejemplo03 {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// Pedir por teclado un texto y añadir ese texto al fichero
		System.out.print("Escribe una frase: ");
		String frase = teclado.nextLine().trim();
		
		try {
			FileWriter fichero = new FileWriter("./assets/texto.txt", true);
			fichero.write("\n" + frase);
			fichero.close();
			System.out.println("Fichero escrito exitosamente");
		} catch (IOException e) {
			System.out.println("Ha ocurrido un error");
			e.printStackTrace();
		}
	}

}

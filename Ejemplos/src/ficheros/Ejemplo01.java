package ficheros;

import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Ejemplo01 {
	public static void main(String[] args) {
		File archivo = new File("./assets/texto.txt");
	//File archivo = new File(".\\assets\\texto.txt"); // Windows

		try {
			Scanner lector = new Scanner(archivo);
			while(lector.hasNextLine()) {
				String linea = lector.nextLine();
				System.out.println(linea);
			}
			lector.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
		System.out.println("\nFinal del programa");
	}
}

package ficheros;

import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException; // Import the IOException class

public class Ejemplo02 {
	public static void main(String[] args) {
		try {
			FileWriter fichero = new FileWriter("./assets/texto.txt", true);
			fichero.write("\nEsto es una nueva linea");
			fichero.close();
			System.out.println("Fichero escrito exitosamente");
		} catch (IOException e) {
			System.out.println("Ha ocurrido un error");
			e.printStackTrace();
		}
	}

}

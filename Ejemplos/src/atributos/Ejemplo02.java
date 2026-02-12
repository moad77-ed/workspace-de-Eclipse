package atributos;
import java.util.Scanner;

public class Ejemplo02 {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		Libro[] libros = new Libro[3];
		
		for(int i = 0; i < libros.length; i++) {
			System.out.println((i+1) + "º libro");
			
			libros[i] = new Libro();
			
			System.out.print("Titulo: ");
			libros[i].titulo = teclado.nextLine().trim();
			
			System.out.print("Páginas: ");
			libros[i].paginas = Integer.parseInt(teclado.nextLine().trim());
			
			System.out.print("Autor: ");
			libros[i].autor = teclado.nextLine().trim();
			
			System.out.print("Genero: ");
			libros[i].genero = teclado.nextLine().trim();
		}
		
		System.out.println("\nLIBROS\n");
		
		for(int i = 0; i < libros.length; i++) {
			System.out.println((i+1) + "º libro");
			System.out.println(libros[i].titulo + " (" + libros[i].paginas + " paginas)");
		}
	}
}
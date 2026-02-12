package estatica;
import java.util.Scanner;

public class Ejemplo02 {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Precio de una tarjeta gráfica: ");
		double precioGrafica = Double.parseDouble(teclado.nextLine().trim());
		
		System.out.print("Precio de 1kg de harina: ");
		double precioHarina = Double.parseDouble(teclado.nextLine().trim());
		
		double ivaGrafica = Utilidades.calcularIva(precioGrafica);
		System.out.println("IVA de la gráfica: " + ivaGrafica + "€");
		
		double ivaHarina = Utilidades.calcularIvaReducido(precioHarina);
		System.out.println("IVA de la harina: " + ivaHarina + "€");
		
		// Dado que los métodos de calcular el precio sin IVA no los he puesto estáticos, el programa me obliga a instanciar un objeto de la clase Utilidades para acceder a los métodos. Aunque para este ejemplo, lo correcto sería que estos dos métodos también fueran estáticos
		Utilidades util = new Utilidades();
		
		double precioSinIvaGrafica = util.calcularPrecioSinIva(precioGrafica);
		System.out.println("Precio sin IVA de la grafica: " + precioSinIvaGrafica + "€");
		
		double precioSinIvaHarina = util.calcularPrecioSinIvaReducido(precioHarina);
		System.out.println("Precio sin IVA de la harina: " + precioSinIvaHarina + "€");
	}

}

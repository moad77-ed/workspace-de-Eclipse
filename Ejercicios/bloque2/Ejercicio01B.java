package bloque2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio01B {

	public static void main(String[] args) {
		ArrayList<Titular> titulares = obtenerTitulares();
		ArrayList<Movimiento> movimientos = obtenerMovimientos();
		
		ArrayList<CuentaV2> cuentas = obtenerCuentas(titulares, movimientos);
		
		mostrarCuentas(cuentas);
		
		// Llamar a un método que reciba las cuentas y genere el HTML con tablas, listados, etc, hechos con Bootstrap
	}

	public static ArrayList<Titular> obtenerTitulares() {
		ArrayList<Titular> titulares = new ArrayList<Titular>();
		File fichero = new File("./assets/titulares.csv");

		try {
			Scanner lector = new Scanner(fichero);
			while (lector.hasNextLine()) {
				String linea = lector.nextLine();
				String[] campos = linea.split(";");
				if(campos.length == 4) {
					Titular t = new Titular(campos[0], campos[1], campos[2], campos[3]);
					titulares.add(t);
				}
			}
			lector.close();
		} catch (FileNotFoundException e) {
			System.out.println("Ha ocurrido un error!");
		}
		return titulares;
	}
	
	public static ArrayList<Movimiento> obtenerMovimientos() {
		ArrayList<Movimiento> movimientos = new ArrayList<Movimiento>();
		
		File fichero = new File("./assets/movimientos.csv");

		try {
			Scanner lector = new Scanner(fichero);
			while (lector.hasNextLine()) {
				String linea = lector.nextLine();
				String[] campos = linea.split(";");
				if(campos.length == 6) {
					int orden = Integer.parseInt(campos[1]);
					double importe = Double.parseDouble(campos[4]);
					Movimiento m = new Movimiento(campos[0], orden, campos[2], campos[3], importe, campos[5]);
					movimientos.add(m);
				}
			}
			lector.close();
		} catch (FileNotFoundException e) {
			System.out.println("Ha ocurrido un error!");
		}
		
		return movimientos;
	}
	
	public static ArrayList<CuentaV2> obtenerCuentas(ArrayList<Titular> titulares, ArrayList<Movimiento> movimientos) {
		ArrayList<CuentaV2> cuentas = new ArrayList<CuentaV2>();
		
		for(int i = 0; i < titulares.size(); i++) {
			CuentaV2 c = new CuentaV2(titulares.get(i));
			
			for(int j = 0; j < movimientos.size(); j++) {
				String dni1 = c.getTitular().getDni();
				String dni2 = movimientos.get(j).getDni();
				if(dni1.equalsIgnoreCase(dni2)) {
					c.addMovimiento(movimientos.get(j));
				}
			}
			
			cuentas.add(c);
		}
		
		return cuentas;
	}
	
	public static void mostrarCuentas(ArrayList<CuentaV2> cuentas) {
		System.out.println("\nCUENTAS BANCARIAS\n---------------");
		
		for(int i = 0; i < cuentas.size(); i++) {
			System.out.println("\n" + cuentas.get(i));
			ArrayList<Movimiento> moves = cuentas.get(i).getMovimientos();
			for(int j = 0; j < moves.size(); j++) {
				System.out.println(moves.get(j).getNumero() + " " + moves.get(j).getFecha() + " " + moves.get(j).getHora() + " " + moves.get(j).getImporte() + " " + moves.get(j).getConcepto());
			}
		}
	}
}

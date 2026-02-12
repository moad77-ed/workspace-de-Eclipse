package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejemplo04 {
	public static void main(String[] args) {
		ArrayList<Alumno> lista = obtenerAlumnos();

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}

		generarHTML(lista);

		System.out.println("\nFinal del programa");
	}

	public static ArrayList<Alumno> obtenerAlumnos() {
		ArrayList<Alumno> listado = new ArrayList<Alumno>();

		File archivo = new File("./assets/alumnos.csv");

		try {
			Scanner lector = new Scanner(archivo);
			while (lector.hasNextLine()) {
				String linea = lector.nextLine();

				String[] campos = linea.split(";");
				if (campos.length == 5) {
					int id = Integer.parseInt(campos[0]);
					Alumno alu = new Alumno(id, campos[1], campos[2], campos[3], campos[4]);

					listado.add(alu);
				}

			}
			lector.close();
		} catch (FileNotFoundException e) {
			System.out.println("Ha ocurrido un error al abrir el fichero");
		}

		return listado;
	}

	public static void generarHTML(ArrayList<Alumno> lista) {
		String html = "<!DOCTYPE html><html><head><title>Listado de alumnos</title><link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"></head><body><h1>Listado de alumnos</h1><table class=\"table\">";

		for (int i = 0; i < lista.size(); i++) {
			Alumno alu = lista.get(i);
			html += "<tr><td>" + alu.getId() + "</td><td>" + alu.getNombre() + "</td><td>" + alu.getApellidos() + "</td><td>" + alu.getFechaNac() + "</td><td>" + alu.getEmail() + "</td></tr>";
		}

		html += "</table></body></html>";

		try {
			String nombre = fechaHoraArchivo();
			FileWriter fichero = new FileWriter("./output/alumnos_" + nombre + ".html");
			fichero.write(html);
			fichero.close();
		} catch (IOException e) {
			System.out.println("Ha ocurrido un error!");
		}
	}
	
	public static String fechaHoraArchivo() {
		LocalDateTime fechaHora = LocalDateTime.now();  
	    
	    DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");  
	    
	    return fechaHora.format(formato);  
	}
}

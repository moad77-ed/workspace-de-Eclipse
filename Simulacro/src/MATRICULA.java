import java.util.*;

public class MATRICULA {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Introduce la matricula: ");
		String matricula = teclado.nextLine();
		String regex = "[0-9]{4}[BCDFGHIJKLMNPRSTVWXYZ]{3}"; 
		String regex1 = "(VI|AB|A|AL|AV|BA|PM/B|B|BU|CC|CA|CS|CE|CR|CO|C|CU|GE/GI|GR|GU|SS|H|HU|J|LE|L|LO|LU|M|MA|ML|MU|NA|OR/OU|O|P|GC|PO|SA|TF|S|SG|SE|SO|T|TE|TO|V|VA|BI|ZA|Z)[0-9]{4}[BCDFGHIJKLMNPRSTVWXYZ]{1,2}"; 

		if(matricula.matches(regex)||matricula.matches(regex1)) {
			System.out.print("Matricula válida ");
		}else {
			System.out.print("Matricula no válida");
		}
	}
}
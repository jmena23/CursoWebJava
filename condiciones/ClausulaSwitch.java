package condiciones;

import java.util.Scanner;

public class ClausulaSwitch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una letra: ");
		String letra = sc.nextLine();
		
		switch (letra) {
		
		case "a":
			System.out.println("Vocal a");
			break;
		case "e":
			System.out.println("Vocal e");
			break;
		case "i":
			System.out.println("Vocal i");
			break;
		case "o":
			System.out.println("Vocal o");
			break;
		case "u":
			System.out.println("Vocal u");
			break;
		default:
			System.out.println("La letra " + letra + " es una consonante.");
		}

	}

}

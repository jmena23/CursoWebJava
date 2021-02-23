package condiciones;

import java.util.Scanner;

public class CondicionIf {

	public static void main(String[] args) {
		
		//Por teclado con un numero
		
		Scanner numero = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int n = numero.nextInt();
		
		if (n % 2 == 0) {
			
			System.out.println("El numero " + n + " es par.");
		}
		else {
			System.out.println("El numero " + n + " es impar.");	
		}

		//Por teclado con una cadena
		
		Scanner nombre = new Scanner(System.in);
		System.out.println("Pon tu nombre: ");
		String cadena = nombre.nextLine();
		System.out.println("El nombre introducido es " + cadena);
	}

}

package condiciones;

import java.util.Scanner;

public class Condiciones2 {

	public static void main(String[] args) {
		
		Scanner numero = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int n1 = numero.nextInt();
		System.out.println("Introduce otro numero: ");
		int n2 = numero.nextInt();
		System.out.println("Introduce un tercer numero: ");
		int n3 = numero.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			System.out.println("El numero mayor es el " + n1);
		}
		else if (n2 > n1 && n2 > n3) {
			System.out.println("El numero mayor es el " + n2);
		}
		else {
			System.out.println("El numero mayor es el " + n3);
		}
		numero.close();
	}
}

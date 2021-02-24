package bucles;

import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int num = numero.nextInt();
		
		//contador
		int i = 2;
		
		//switch
		boolean primo = true;
		
		while (i < num) {
			if (num % i == 0) {
				System.out.println("Numero No primo");
				primo = false;
				break;
			}
			i++;
		}
		if (primo) {
			System.out.println("Numero primo");
		}

	}

}

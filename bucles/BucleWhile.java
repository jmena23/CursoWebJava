package bucles;

import java.util.Scanner;

public class BucleWhile {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int num1 = num.nextInt();
		System.out.println("Introduce otro numero: ");
		int num2 = num.nextInt();
		
		
		while (num1 <= num2) {
			
			System.out.println(num1);
			num1++;
		}
		num.close();
	}

}

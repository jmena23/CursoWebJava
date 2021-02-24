package arrays;

import java.util.Scanner;

public class TresEnRaya {

	public static void main(String[] args) {
		
		String x[][] = new String[3][3];
		
		int i = 9;
		
		while (i > 0) {
			Scanner posicion = new Scanner(System.in);
			System.out.println("Introduce una posicion: ");
			int uno = posicion.nextInt();
			System.out.println("Introduce una posicion: ");
			int dos = posicion.nextInt();
			
			if (i%2 != 0) {
				x[uno][dos] = "x";
			}
			else {
				x[uno][dos] = "-";
			}
			
			for (int z = 0; z < x.length; z++) {
				for(int h = 0; h < x[z].length; h++) {
					
					System.out.print(x[z][h]);
				}
				System.out.println();
			}
			i--;
			System.out.println("\n");
		}

	}

}

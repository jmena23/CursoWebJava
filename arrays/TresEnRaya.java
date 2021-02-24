package arrays;

import java.util.Scanner;

public class TresEnRaya {

	public static void main(String[] args) {
		
		String x[][] = new String[3][3];
		
		for (int z = 0; z < x.length; z++) {
			for(int h = 0; h < x[z].length; h++) {
				
				x[z][h] = "-";
				System.out.print(x[z][h]);
			}
			System.out.println();
		}
		
		int i = 9;
		
		Scanner posicion = new Scanner(System.in);
		
		while (i > 0) {
			System.out.println("Introduce una posicion: ");
			int uno = posicion.nextInt();
			System.out.println("Introduce una posicion: ");
			int dos = posicion.nextInt();
			
			if (i%2 != 0) {
				x[uno][dos] = "x";
			}
			else {
				x[uno][dos] = "o";
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
		posicion.close();
	}

}

package arrays;

import java.util.Scanner;

public class ClaseArray1 {

	public static void main(String[] args) {
		
		int[] array = new int[10];
		String[] frases = new String[5];
		
		Scanner nombres = new Scanner(System.in);
		System.out.println("Introduce nombre: ");
		frases[0] = nombres.nextLine();
		System.out.println("Introduce nombre: ");
		frases[1] = nombres.nextLine();
		System.out.println("Introduce nombre: ");
		frases[2] = nombres.nextLine();
		
		//frases[0] = nomb1;
		//frases[1] = nomb2;
		//frases[2] = nomb3;
		
		/*
		for (int posicion = 0; posicion < 3; posicion++){
			System.out.println("Introduce nombre: ");
			frases[posicion] = nombres.nextLine();
		} 
		 */
		
		for (int i=0; i < 3; i++) {
			System.out.println(frases[i]);
		}
		nombres.close();
	}

}

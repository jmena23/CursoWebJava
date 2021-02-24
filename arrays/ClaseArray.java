package arrays;

public class ClaseArray {

	public static void main(String[] args) {
		
		//Dos opciones
		
		//Estilo C++
		int array[];
		//Estilo Java
		int[] array2;
		
		int[] array3 = {20, 30, 40, 34, 37};
		
		for (int i = 0; i < array3.length; i++) {
			System.out.println(array3[i]);
		}
		
		System.out.println("\nAhora al reves:");
		
		for (int j = array3.length - 1; j >= 0; j--) {
			System.out.println(array3[j]);
		}

	}

}


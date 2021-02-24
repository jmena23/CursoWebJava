package bucles;

public class BuclesEtiquetas {

	public static void main(String[] args) {
		
		boolean b = true;
		
		
		
principal: while(b) {
			System.out.println("Estoy en el bucle principal");
			
			secundario: for (int x = 0; x <= 10; x++) {
				
				System.out.println("Estoy en el bucle secundario");
				
				if (x == 5) break principal;
			}
}

	}

}

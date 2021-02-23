package variablesyoperadores;

public class OperadoresLogicos {
	
	public static void main(String[] args) {
		
		int z = 10;
		int r = 9;
		System.out.println(z < r);
		
		int x = 90;
		System.out.println(z < r || x > r);
		System.out.println(z < r && x > r);
		System.out.println( !(z < r && x > r) );
		
		String cadena = z < r ? "SI" : "NO";
		System.out.println(cadena);
		
		String parImpar = r % 2 == 0 ? "Par" : "Impar";
		System.out.println(parImpar);
	}

}

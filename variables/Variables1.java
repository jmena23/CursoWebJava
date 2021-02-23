package variables;

public class Variables1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		boolean v = true;
		char letra = 'x';
		long l1 = 189090;
		byte b = 127;           //8 bits         
		int i = 10;             //32 bits
		short s = 200;          //16 bits
		double d1 = 3.10;
		float f = 2.4f;
		
		
		
		String name = "Juan";
		
		//Ejemplo
		String nombre = "Juan";
		String apellido = "Mena";
		long salario = 25000;
		double irpf = 0.21;
		
		System.out.println("Tu nombre completo es: " + nombre + " " + apellido);
		System.out.println("Tu salario es: " + salario + "€");
		System.out.println("Tu IRPF anual asciende a: " + salario * irpf + "€");
		
		

	}

}

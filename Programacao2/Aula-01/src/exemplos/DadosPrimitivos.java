package exemplos;

public class DadosPrimitivos {

	public static void main(String[] args) {
		//8 tipos primitivos
		// dados primitivos come�am com letras mai�sculas 
		//N�o s�o classes/objetos
		
		//8 bits
		byte b1 = 127;
		//b1++;
		short s1 = 200; //16 bits
		int i1 = 1000; //32 bits
		//64 bits
		long l1 = 1000000000000000001l; //inserir l no final
		float f1 = 3.14f; // f no final
		double d1 = 123.2367267236782326;
		
		boolean t1 = true;
		boolean t2 = false;
		
		char c1 = 'a'; // somente um caracter por variavel
		char c2 = 'b';
		char c3 = 'c';
		
		System.out.println(c2);
		System.out.println(c1);
		System.out.println(c3);
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(l1);
		System.out.println(f1);
		System.out.println(d1);
		
		
		System.out.println("-----------------------------------------");
		//String n�o � um tipo de dado primitivo e sim uma Classe
		
		String campus = "IFRS-Feliz";
		System.out.println(campus);
	}

}

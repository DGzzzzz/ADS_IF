package exemplos;

public class Condicional {

	public static void main(String[] args) {
		
		// opera��es aritm�ticas
		int a = 10;
		int b = 2;
		
		int soma = a + b;
		int sub = a - b;
		int mult = a * b;
		int div = a / b;
		int resto = a % b;
		
		System.out.println("Soma: " + soma);
		System.out.println("Subtra��o: " + sub);
		System.out.println("Multiplica��o: " + mult);
		System.out.println("Divis�o: " + div);
		System.out.println("Resto da divis�o: " + resto);
		
		System.out.println("------------------------------");
		//Condicionais
		
		if (a > b) {
			System.out.println("A � maior que B");
		} else {
			System.out.println("B � maior que A");
		}
		
		if (soma > 11) {
			System.out.println("Soma deu mais que 11");
		} else {
			System.out.println("Soma deu menos que 12");
		}
		
		int c = 10;
		int d = 5;
		
		// operador "E" &&
		// operador "OU" ||
		// operador diferente � !=
		if(c == 10 && d == 5) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		if(c != 23) {
			System.out.println("C � diferente");
		}
		
		boolean temp = true;
		
		if(!temp) {
			System.out.println(temp);
		}
	}
	
}

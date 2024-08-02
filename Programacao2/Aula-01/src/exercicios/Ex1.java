package exercicios;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n1 = Integer.parseInt(s.nextLine());
		int n2 = Integer.parseInt(s.nextLine());
		
		int soma = n1 + n2;
		int sub = n1 - n2;
		int div = n1 / n2;
		int resto = n1 % n2;
		
		System.out.println(soma);
		System.out.println(sub);
		System.out.println(div);
		System.out.println(resto);
	}

}

package exercicios;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n1 = Integer.parseInt(s.nextLine());
		int n2 = Integer.parseInt(s.nextLine());
		
		if(n1 == n2) {
			System.out.println("Os dois numeros são iguais");
		} else if(n1 > n2) {
			System.out.println(n1);
		} else {
			System.out.println(n2);
		}
	}
}

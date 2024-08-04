package exercicios;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = Integer.parseInt(s.nextLine());
        int sucessor = numero + 1;
        int antecessor = numero - 1;

        System.out.println("O antecessor de " + numero + " é " + antecessor + " e o sucessor é " + sucessor);

        s.close();
    }
}

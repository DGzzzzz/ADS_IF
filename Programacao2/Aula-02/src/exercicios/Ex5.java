package exercicios;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = Integer.parseInt(s.nextLine());

        int resultado = fatorial(n);
        System.out.println("O fatorial de " + n + " é " + resultado);

        s.close();
    }

    public static int fatorial(int n) {
        for(int i = n - 1; i > 0; i--) {
            n *= i;
        }
        return n;
    }
}

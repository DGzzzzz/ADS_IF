package exercicios;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = Integer.parseInt(s.nextLine());

        int[] valores = new int[n];

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite um valor: ");
            valores[i] = s.nextInt();
        }

        for (int i = valores.length - 1; i >= 0; i--) {
            System.out.print(valores[i] + " ");
        }

        s.close();
    }
}

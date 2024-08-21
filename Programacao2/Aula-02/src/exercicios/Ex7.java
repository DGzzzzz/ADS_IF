package exercicios;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n1 = Integer.parseInt(s.nextLine());
        int n2 = Integer.parseInt(s.nextLine());

        if (n1 > n2) {
            int aux = n1;
            n1 = n2;
            n2 = aux;
        }

        if (n1 == n2) {
            System.out.println("Os números são iguais");
        }

        for (int i = n1 + 1; i < n2; i++) {
            System.out.println(i);
        }

        s.close();
    }
}

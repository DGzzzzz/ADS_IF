package exercicios;

import java.util.Scanner;

public class Ex3 {
public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double[] valores = new double[5];

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite um valor: ");
            valores[i] = s.nextDouble();
        }

        double soma = 0;
        for (double valor : valores) {
            soma += valor;
        }

        double media = soma / valores.length;
        System.out.println("Média: " + media);

        s.close();
    }
}

package exercicios.matriz;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o número de linhas (n): ");
        int n = s.nextInt();
        System.out.print("Digite o número de colunas (m): ");
        int m = s.nextInt();

        int[][] matriz = new int[n][m];
        int soma = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = s.nextInt();
                soma += matriz[i][j];
            }
        }

        s.close();

        System.out.println("A soma dos elementos da matriz é: " + soma);
    }
}

package exercicios.matriz;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        int positivos = 0;
        int negativos = 0;
        int zeros = 0;

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = s.nextInt();
                
                if (matriz[i][j] > 0) {
                    positivos++;
                } else if (matriz[i][j] < 0) {
                    negativos++;
                } else {
                    zeros++;
                }
            }
        }

        s.close();

        System.out.println("Valores positivos: " + positivos);
        System.out.println("Valores negativos: " + negativos);
        System.out.println("Valores zero: " + zeros);
    }
}

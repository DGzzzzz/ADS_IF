package exercicios.matriz;

import java.util.Scanner;


public class Ex3 {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        int maior = 0;
        int menor = 0;

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite um valor: ");
                matriz[i][j] = s.nextInt();
                if(i == 0 && j == 0) {
                    maior = matriz[i][j];
                    menor = matriz[i][j];
                } else {
                    if(matriz[i][j] > maior) {
                        maior = matriz[i][j];
                    }
                    if(matriz[i][j] < menor) {
                        menor = matriz[i][j];
                    }
                }                
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        s.close();
    }
}

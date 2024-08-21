package exercicios.matriz;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        int matriz2[][] = new int[3][3];
        int matriz3[][] = new int[3][3];

        Scanner s = new Scanner(System.in);
        
        System.out.println("Matriz 1");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite um valor: ");
                matriz[i][j] = s.nextInt();
            }
        }

        System.out.println("Matriz 2");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print("Digite um valor: ");
                matriz2[i][j] = s.nextInt();
            }
        }

        //matriz 3 a partir dos maiores numeros de cada possicao comparando as duas primeiras matrizes
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                if(matriz[i][j] > matriz2[i][j]) {
                    matriz3[i][j] = matriz[i][j];
                } else {
                    matriz3[i][j] = matriz2[i][j];
                }
            }
        }

        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                System.out.print(matriz3[i][j] + " ");
            }
            System.out.println();
        }

        s.close();
    }    
}

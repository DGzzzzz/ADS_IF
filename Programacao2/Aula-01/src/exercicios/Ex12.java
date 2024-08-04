package exercicios;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double[] valores = new double[6];
        int quantidade = 6;

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite um número: ");
            valores[i] = Double.parseDouble(s.nextLine());
        }
        
        double somaPrimeiros = 0;
        for (int i = 0; i < 3; i++) {
            somaPrimeiros += valores[i];
        }
        double mediaPrimeiros = somaPrimeiros / 3;

        double somaUltimos = 0;
        for (int i = 3; i < quantidade; i++) {
            somaUltimos += valores[i];
        }
        double mediaUltimos = somaUltimos / 3;

        System.out.println("Média dos primeiros: " + mediaPrimeiros);
        System.out.println("Média dos últimos: " + mediaUltimos);

        s.close();
    }
}

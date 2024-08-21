package exercicios;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o metro quadrado a ser pintado: ");
        double metros = Integer.parseInt(s.nextLine());

        double totalLitros = metros / 3;

        double latas = totalLitros / 10;

        double preco = latas * 50;

        System.out.printf("Você precisará de %.2f litros de tinta e isso custará R$ %.2f", totalLitros, preco);

        s.close();
    }
}

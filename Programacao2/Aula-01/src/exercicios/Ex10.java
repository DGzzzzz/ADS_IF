package exercicios;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe o salário mínimo: ");
        double salarioMinimo = Double.parseDouble(s.nextLine());
        System.out.print("Informe o sey salário: ");
        double salario = Double.parseDouble(s.nextLine());

        double qtdSalarioMinimo = salario / salarioMinimo;

        System.out.printf("Você recebe %.2f salários mínimos", qtdSalarioMinimo);

        s.close();
    }
}

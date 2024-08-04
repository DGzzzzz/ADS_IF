package exercicios;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Qual o seu salário? ");
        double salario = Double.parseDouble(s.nextLine());
        

        if (salario <= 1000) {
            double aumento = salario * 0.20;
            System.out.printf("O seu aumento é de " + aumento);
        } else if (salario <= 2000) {
            double aumento = salario * 0.15; 
            System.out.printf("O seu aumento é de " + aumento);
        } else {
            double aumento = salario * 0.10;
            System.out.printf("O seu aumento é de " + aumento);
        }
        
        s.close();
    }
}

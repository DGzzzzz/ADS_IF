package exercicios;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Smartphone smartphone = new Smartphone();

        System.out.println("Informe a marca do Smartphone: ");
        smartphone.marca = s.nextLine();
        System.out.println("Informe a cor do Smartphone: ");
        smartphone.cor = s.nextLine();
        System.out.println("Informe o ano de fabricação do Smartphone: ");
        smartphone.anoFabr = Integer.parseInt(s.nextLine());

        smartphone.imprimir();

        s.close();
    }
}

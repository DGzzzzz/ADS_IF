package exercicios;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Qual a quilometragem inicial do carro? ");
        int kmInicial = Integer.parseInt(s.nextLine());
        System.out.println("Qual a quilometragem final do carro? ");
        int kmFinal = Integer.parseInt(s.nextLine());
        System.out.println("Quantos litros de combustível foram gastos? ");
        int litros = Integer.parseInt(s.nextLine());

        double mediaConsumo = (kmFinal - kmInicial) / litros;

        System.out.println("A média de consumo do carro foi de " + mediaConsumo + " km/l");

        s.close();
    }
}

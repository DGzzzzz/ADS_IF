package exercicios.publicc;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Partido partido = new Partido();
        System.out.print("Informe o nome do partido: ");
        partido.nome = s.nextLine();
        System.out.print("Informe a sigla do partido: ");
        partido.sigla = s.nextLine();

        Prefeito prefeito = new Prefeito();
        System.out.println("Informe o nome do prefeito: ");
        prefeito.nome = s.nextLine();
        System.out.print("Informe a idade de prefeito: ");
        prefeito.idade = Integer.parseInt(s.nextLine());

        Cidade cidade = new Cidade();
        System.out.print("Informe o nome da cidade: ");
        cidade.nome = s.nextLine();
        System.out.print("Informe o codigo nacional da cidade: ");
        cidade.cod = Integer.parseInt(s.nextLine());

        prefeito.partido = partido;
        cidade.prefeito = prefeito;

        cidade.imprimir();

        s.close();
    }
}

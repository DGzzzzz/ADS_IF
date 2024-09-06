package exercicios.privatee;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Partido partido = new Partido();
        System.out.print("Informe o nome do partido: ");
        partido.setNome(s.nextLine());
        System.out.print("Informe a sigla do partido: ");
        partido.setSigla(s.nextLine());

        Prefeito prefeito = new Prefeito();
        System.out.println("Informe o nome do prefeito: ");
        prefeito.setNome(s.nextLine());
        System.out.print("Informe a sigla do prefeito: ");
        prefeito.setSigla(s.nextLine());

        Cidade cidade = new Cidade();
        System.out.print("Informe o nome da cidade: ");
        cidade.setNome(s.nextLine());
        System.out.print("Informe o codigo nacional da cidade: ");
        cidade.setCod(Integer.parseInt(s.nextLine()));

        cidade.setPrefeito(prefeito);
        prefeito.setPartido(partido);

        s.close();

        cidade.imprimir();

        // System.out.println("Cidade: " + cidade.getNome() + " Cod.Nacional: " + cidade.getCod());
        // System.out.println("Prefeito: " + cidade.getPrefeito().getNome() + " Sigla: " + cidade.getPrefeito().getSigla());
        // System.out.println("Partido: " + prefeito.getPartido().getNome());
    }

}

package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Filme filme = new Filme();
        List<Filme> listaFilme = new ArrayList<>();
        
        System.out.println("Quantos filmes você quer cadastrar? ");
        int qtdFilmes = Integer.parseInt(s.nextLine());
        
        for(int i = 0; qtdFilmes > i; i++) {
            System.out.println("Informe o nome do filme: ");
            filme.nome = s.nextLine();
            System.out.println("Informe a sinopse do filme: ");
            filme.sinopse = s.nextLine();
            System.out.println("Informe o ano de lançamento do filme: ");
            filme.anoLanc = Integer.parseInt(s.nextLine());
            listaFilme.add(filme);
        }
        
        

        s.close();
    }
}

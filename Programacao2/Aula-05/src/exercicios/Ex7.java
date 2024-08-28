package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Canal> listaCanais = new ArrayList<>();
        
        System.out.println("Quantos filmes você quer cadastrar? ");
        int qtdCanais = Integer.parseInt(s.nextLine());
        
        for(int i = 0; qtdCanais > i; i++) {
            Canal canal = new Canal();
            System.out.println("Informe o nome do canal: ");
            canal.nome = s.nextLine();
            System.out.println("Informe a descrição do canal: ");
            canal.descricao = s.nextLine();
            System.out.println("Informe o ano de criação do canal: ");
            canal.anoCriacao = Integer.parseInt(s.nextLine());
            listaCanais.add(filme);
        }
        
        for(Canal canal : listaCanais) {
            canal.imprimir();
        }
 
        s.close();
    }
}

package exercicios;

import java.util.Scanner;

public class Ex4 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Curso curso = new Curso();
        
        System.out.println("Informe o nome do curso: ");
        curso.nome = s.nextLine();
        System.out.println("Informe a descrição do curso: ");
        curso.descricao = s.nextLine();
        System.out.println("Informe o status do curso (Ativo ou Inativo): ");
        curso.status = s.nextLine();

        curso.imprimir();

        s.close();
    }
}

package exercicios;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o número de turmas: ");
        int numTurmas = Integer.parseInt(s.nextLine());
        int numAlunos = 0;

        for (int i = 0; i < numTurmas; i++) {
            while (true) {
                System.out.println("Digite o número de alunos da turma " + (i + 1) + ":");
                int alunosTurma = Integer.parseInt(s.nextLine());
                if(alunosTurma < 32) {
                    numAlunos += alunosTurma;
                    break;
                } else {
                    System.out.println("Número de alunos inválido. Digite um número menor que 32.");
                }
            }
        }
        double media = numAlunos / numTurmas;
        System.out.println("A média de alunos por turma é: " + media);
        s.close();
    }
}

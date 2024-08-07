package exercicios;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String usuario, senha;

        while(true) {
            System.out.println("Digite seu usuário: ");
            usuario = s.nextLine();
            System.out.println("Digite seu usuário: ");
            senha = s.nextLine();

            if (!usuario.equals(senha)) {
                break;
            } else {
                System.out.println("Usuario e senha não pode ser iguais");
            }
        }
        System.out.println("Entrando...");
        s.close();
    }
}

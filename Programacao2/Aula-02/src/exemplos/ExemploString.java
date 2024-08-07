package exemplos;

public class ExemploString {
    public static void main(String[] args) {
        // == usado apenas com tipos de dados primitivos, ou caso eu queria comparar se o objeto apontado por duas variaveis é o mesmo.
        String c1 = "Feliz";
        String c2 = "Feliz";
        String c3 = "FELIZ";

        if(c1.equals(c2)) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }

        if(c1.equalsIgnoreCase(c3)) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }

        String banda = "Led Zeppelin";

        System.out.println(banda.length());  //verifica o tamanho da string

        System.out.println(banda.charAt(0)); //pega a letra que esta nesse indice
        System.out.println(banda.charAt(11));

        String b1 = "Led";
        String b2 = "Zeppelin";

        System.out.println(b1 + " " + b2);

        int n1 = 10;
        int n2 = 20;

        System.out.println("Soma: " + (n1 + n2));
    }
}

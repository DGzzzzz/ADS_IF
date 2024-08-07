package exemplos;

public class ExemploWhile {
    public static void main(String[] args) {
        int i = 6;

        while (i >= 0) {
            System.out.println(i);
            i-=2; // i++ || i-- || i*=2
        }

        System.out.println("----------------------------");

        int j = 0;
        do {
            System.out.print(j + " ");
            j++;
        } while (j<5);
    }
}

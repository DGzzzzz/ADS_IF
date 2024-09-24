import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double soma = 0;
        int n = Integer.parseInt(s.nextLine());
        String[] nomes = new String[n];

        for (int i = 0; i < n; i++) {
            nomes[i] = s.nextLine();
            soma += nomes[i].length();
        }

        double media = soma / n;
        System.out.println("Media: " + media);

        s.close();
    }
}

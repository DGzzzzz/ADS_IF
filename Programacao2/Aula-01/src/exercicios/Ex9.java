package exercicios;

public class Ex9 {
    public static void main(String[] args) {

        int soma = 0;
        int quantidade = 4;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Informe um valor: ");
            int valor = Integer.parseInt(System.console().readLine());
            soma += valor;

            if (valor > maior) {
                maior = valor;
            }

            if (valor < menor) {
                menor = valor;
            }
        }

        double media = soma / quantidade;
        System.out.printf("A média dos valores informados é: %.2f", media);
        System.out.printf("\nO maior valor informado foi: %d", maior);
        System.out.printf("\nO menor valor informado foi: %d", menor);
    }
}

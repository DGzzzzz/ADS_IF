package exercicios;

public class Ex4 {
    public static void main(String[] args) {
        int a = 0 , b = 1;

        System.out.println("Série de Fibonacci até 500: ");
        
        while (true) {
            int next = a + b;
            if (next > 500) {
                break;
            }
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
}

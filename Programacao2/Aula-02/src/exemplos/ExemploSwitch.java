package exemplos;

public class ExemploSwitch {
    public static void main(String[] args) {
        int option = 0;

        // switch não é um laço de repetição
        switch (option) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Um");
                break;
            default:
                System.out.println("Outro numero");
        }
    }
}

package exemplos;

public class ExemploFor {
    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("i= " + i + "j= " + j);
            }
        }
        
        for(int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }

        for(int j = 40; j >= 0; j-=5) {
            if(j == 20) {
                continue;
            }
            System.out.print(j + " ");
        }

        System.out.println("Saiu");
    }
}

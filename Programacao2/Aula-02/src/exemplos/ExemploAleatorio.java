package exemplos;

import java.util.Random;

public class ExemploAleatorio {
    public static void main(String[] args) {
        Random r = new Random();
        
        int cara = 0;
        int coroa = 0;
        for (int i = 0; i < 10; i++) {
            // System.out.println(r.nextInt(2));
            int sorteio = r.nextInt(2);
            
            if(sorteio == 1) {
                cara+=i;
            } else {
                coroa+=i;
            }       
        }
        System.out.println("Cara: " + cara + " Coroa: " + coroa);
    }
}

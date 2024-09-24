package ex1;

public class App {
    public static void main(String[] args) {
        
        Diretor diretor = new Diretor("Douglas", "Winter", 21);
        Cidade cidade = new Cidade("Vale Real", "RS", 3000);
        
        Filme filme = new Filme("Us guri do programa", diretor, cidade);

        filme.imprimir();
    }
}

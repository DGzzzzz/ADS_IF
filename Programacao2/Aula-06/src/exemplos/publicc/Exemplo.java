package exemplos.publicc;

public class Exemplo {
    public static void main(String[] args) {
        //Associação da classe endereço na classe pessoa

        Endereco e = new Endereco();
        e.cidade = "Vale Real";
        e.rua = "Rua";
        e.complemento = "123";
        e.CEP = "378237283";
        e.numero = 123;


        Pessoa p = new Pessoa();
        p.nome = "Douglas";
        p.endereco = e;

        p.imprimir();
        e.imprimirEnd();
    }
}

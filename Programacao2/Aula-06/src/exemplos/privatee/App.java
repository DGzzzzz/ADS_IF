package exemplos.privatee;

public class App {
    public static void main(String[] args) {

        Endereco end = new Endereco();
        end.setCidade("Cidade");
        end.setRua("Rua");
        end.setNumero(123);
        end.setComplemento("Complemento");
        end.setCEP("123243434");

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Douglas");
        pessoa.setIdade(12);
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        
        pessoa.setEnd(end); //associação
        System.out.println("Cidade: " + pessoa.getEnd().getCidade());
    }
}

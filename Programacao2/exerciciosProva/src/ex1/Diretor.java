package ex1;

public class Diretor {

    private String nome;
    private String sobrenome;
    private int premios;

    public Diretor(String nome, String sobrenome, int premios) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.premios = premios;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public int getPremios() {
        return premios;
    }
    public void setPremios(int premios) {
        this.premios = premios;
    }

    public void imprimir() {
        System.out.println("Nome: " + this.nome + " " + this.sobrenome);
        System.out.println("Premios: " + this.premios);
    }
}

package exercicios.privatee;

public class Cidade {
    
    private String nome;
    private int cod;
    private Prefeito prefeito;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCod() {
        return cod;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }

    public Prefeito getPrefeito() {
        return prefeito;
    }
    public void setPrefeito(Prefeito prefeito) {
        this.prefeito = prefeito;
    } 
    
    public void imprimir() {
        System.out.println("Cidade: " + this.getNome() + " Cod.Nacional: " + this.getCod());
        System.out.println("Prefeito: " + this.getPrefeito().getNome() + " Sigla: " + this.getPrefeito().getSigla());
        System.out.println("Partido: " + prefeito.getPartido().getNome());
    }
}

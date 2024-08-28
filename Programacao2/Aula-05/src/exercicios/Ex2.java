package exercicios;
public class Ex2 {
    public static void main(String[] args) throws Exception {
        //Construtores das classes
        Animal animal = new Animal();
        Canal canal = new Canal();
        Casa casa = new Casa();
        Curso curso = new Curso();
        Filme filme = new Filme();
        Rodovia rodovia = new Rodovia();
        Smartphone smartphone = new Smartphone();

        //Objetos da classe Animal
        animal.especie = "Gato";
        animal.cor = "malhado";
        animal.sexo = "Macho";
        //Método
        animal.imprimir();

        //Objetos da classe Canal
        canal.nome = "Tatica DS";
        canal.descricao = "Canal de vídeos sobre jogos Soulslike";
        canal.anoCriacao = 2013; //chutei nao sei
        //Método
        canal.imprimir();

        //Objetos da classe Casa
        casa.cor = "Verde";
        casa.valor = 125000.50;
        casa.quartos = 4;
        //Método
        casa.imprimir();
        System.out.print(casa.vendido());

        //Objetos da classe Curso
        curso.nome = "ADS";
        curso.descricao = "Curso de tecnlogia";
        curso.status = "Ativo";
        //Método
        curso.imprimir();

        //Objetos da classe Filme
        filme.nome = "Spider-man";
        filme.sinopse = "Super heroi";
        filme.anoLanc = 2000;
        //Método
        filme.imprimir();

        //Objetos da classe Rodovia
        rodovia.nome = "BR 116";
        //Método
        rodovia.imprimir();

        //Objetos da classe Smartphone
        smartphone.marca = "iPhone 7";
        smartphone.cor = "verde";
        smartphone.anoFabr = 2015;
        //Método
        smartphone.imprimir();
    }
}

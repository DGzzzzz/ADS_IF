package exercicios.ex1.jogo;

import java.util.Scanner;

import exercicios.ex1.jogo.equipamentos.Bols;
import exercicios.ex1.jogo.equipamentos.Campo;
import exercicios.ex1.jogo.pessoas.Jogador;
import exercicios.ex1.jogo.pessoas.Juiz;
import exercicios.ex1.jogo.pessoas.Treinador;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Futebol futebol = new Futebol();
		
		Campo campo = new Campo();
		System.out.println("Informe o comprimento do campo: ");
		campo.setCompr(Integer.parseInt(s.nextLine()));
		System.out.println("Informe a largura do campo: ");
		campo.setLarg(Integer.parseInt(s.nextLine()));
		futebol.setCampo(campo);
		
		Bols bola = new Bols();
		System.out.println("Informe a marca da bola: ");
		bola.setMarca(s.nextLine());
		futebol.setBola(bola);
		
		Juiz juiz = new Juiz();
		System.out.println("Informe o nome do Juiz: ");
		juiz.setNome(s.nextLine());
		futebol.setJuiz(juiz);
		
		Equipe equipe1 = new Equipe();
		System.out.println("Nome da equipe 1: ");
		futebol.setEquipeAzul(equipe1);
		equipe1.setNome(s.nextLine());
		
		Jogador goleiro1 = new Jogador();
		System.out.println("Informe o nome dos jogadores da " + equipe1.getNome());
		System.out.println("Goleiro: ");
		goleiro1.setNome(s.nextLine());
		equipe1.setGoleiro(goleiro1);
		
		Jogador zagueiro1 = new Jogador();
		System.out.println("Zagueiro: ");
		zagueiro1.setNome(s.nextLine());
		equipe1.setZagueiro(zagueiro1);
		
		Jogador alaDireito1 = new Jogador();
		System.out.println("Ala Direito: ");
		alaDireito1.setNome(s.nextLine());
		equipe1.setAlaDireito(alaDireito1);
		
		Jogador alaEsquerdo1 = new Jogador();
		System.out.println("Ala Esquerdo: ");
		alaEsquerdo1.setNome(s.nextLine());
		equipe1.setAlaEsquerdo(alaEsquerdo1);
		
		Jogador atacante1 = new Jogador();
		System.out.println("Atacante: ");
		atacante1.setNome(s.nextLine());
		equipe1.setAtacante(atacante1);
		
		Treinador treinador1 = new Treinador();
		System.out.println("Treinador: ");
		treinador1.setNome(s.nextLine());
		equipe1.setTreinador(treinador1);
		
		// -----------------------------------
		
		Equipe equipe2 = new Equipe();
		System.out.println("Nome da equipe 2: ");
		equipe2.setNome(s.nextLine());
		futebol.setEquipeVermelha(equipe2);
		
		Jogador goleiro2 = new Jogador();
		System.out.println("Informe o nome dos jogadores da " + equipe2.getNome());
		System.out.println("Goleiro: ");
		goleiro2.setNome(s.nextLine());
		equipe2.setGoleiro(goleiro2);
		
		Jogador zagueiro2 = new Jogador();
		System.out.println("Zagueiro: ");
		zagueiro2.setNome(s.nextLine());
		equipe2.setZagueiro(zagueiro2);
		
		Jogador alaDireito2 = new Jogador();
		System.out.println("Ala Direito: ");
		alaDireito2.setNome(s.nextLine());
		equipe2.setAlaDireito(alaDireito2);
		
		Jogador alaEsquerdo2 = new Jogador();
		System.out.println("Ala Esquerdo: ");
		alaEsquerdo2.setNome(s.nextLine());
		equipe2.setAlaEsquerdo(alaEsquerdo2);
		
		Jogador atacante2 = new Jogador();
		System.out.println("Atacante: ");
		atacante2.setNome(s.nextLine());
		equipe2.setAtacante(atacante2);
		
		Treinador treinador2 = new Treinador();
		System.out.println("Treinador: ");
		treinador2.setNome(s.nextLine());
		equipe2.setTreinador(treinador2);
		
		futebol.imprimir();
		
		s.close();
	}

}

package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import entities.Jogador;
import entities.Perguntas;
import entities.Quiz;
import entities.Respostas;

public class Programa {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		Quiz quiz = new Quiz();
		
		//Recebe nome dos jogadores//

		System.out.println("Informe nome do jogador 1");
		String nomeJogador1 = ent.next();

		System.out.println("Informe nome do jogador 2");
		String nomeJogador2 = ent.next();

		Jogador jogador1 = new Jogador(nomeJogador1);
		Jogador jogador2 = new Jogador(nomeJogador2);
		
		//Cria��o do banco de perguntas e respostas//

		Respostas respostas1 = new Respostas("Polui��o", "Jogadores de Futebol", "Vacas", "Filmes de her�i", 'a');
		Perguntas pergunta1 = new Perguntas("Qual � a causa do efeito esfuta?", respostas1);
		quiz.addPerguntas(pergunta1);

		Respostas respostas2 = new Respostas("Azul, Verde, Vermelho e Rosa", "Azul, Verde, Branco e Amarelo",
				"Azul, Verde, Amarelo e Vermelho", "Preto, Branco, Rosa e Roxo", 'c');
		Perguntas pergunta2 = new Perguntas("Quais s�o as cores das lixeiras de reciclagem?", respostas2);
		quiz.addPerguntas(pergunta2);

		Respostas respostas3 = new Respostas("Menos de 100 anos", "200 anos", "Entre 300 e 400 anos",
				"Mais de 400 anos", 'd');
		Perguntas pergunta3 = new Perguntas("Quantos anos leva para o pl�stico se decompor no meio ambiente?",
				respostas3);
		quiz.addPerguntas(pergunta3);

		Respostas respostas4 = new Respostas("Brasil", "EUA", "China", "R�ssia", 'c');
		Perguntas pergunta4 = new Perguntas("Qual o pa�s que mais consome energia el�trica no mundo?", respostas4);
		quiz.addPerguntas(pergunta4);

		Respostas respostas5 = new Respostas(
				"Propelente em aeross�is e medicamentos que contenham CFC, encontrados em alguns desodorantes e em alguns medicamentos antiflamat�rios em spray.",
				"Solvente para limpeza de elementos de precis�o e eletr�nica.",
				"Fluidos usados na refrigera��o comercial como por exemplo em aparelhos de ar condicionado dom�sticos.",
				"Todos os items listados.", 'd');
		Perguntas pergunta5 = new Perguntas(
				"Quais das seguintes subst�ncias contribuem para a destrui��o da camada de oz�nio?", respostas5);
		quiz.addPerguntas(pergunta5);

		Respostas respostas6 = new Respostas("Cerrado", "Pampa", "Mata Atl�ntica", "Amaz�nia", 'c');
		Perguntas pergunta6 = new Perguntas("Qual o bioma mais amea�ado do pa�s?", respostas6);
		quiz.addPerguntas(pergunta6);

		Respostas respostas7 = new Respostas("Dirigir carros el�tricos", "Usar energia solar",
				"Usar �gua para lavar o carro", "Usar materiais pl�sticos", 'b');
		Perguntas pergunta7 = new Perguntas("Quais das alternativas s�o exemplos de consumo sustent�vel?", respostas7);
		quiz.addPerguntas(pergunta7);

		Respostas respostas8 = new Respostas(
				"Separar lixo inorg�nico (pl�sticos, vidros, metais e pap�is) para reciclagem antes de sua coleta.",
				"Incinerar o lixo org�nico em casa.", "Jogar seu lixo na rua", "Nenhuma das alternativas", 'a');
		Perguntas pergunta8 = new Perguntas(
				"Qual a estrat�gia correta para diminuir o ac�mulo de lixo nos aterros sanit�rios?", respostas8);
		quiz.addPerguntas(pergunta8);

		Respostas respostas9 = new Respostas(
				"Incentivar o estudo �s quest�es ambientais e o uso da tecnologia em prol delas",
				"Fiscalizar a utiliza��o da coleta seletiva nos bairros",
				"Controle potencial da emiss�o de gases em ind�strias de grande porte",
				"Reflorestar �reas de desmatamento", 'b');
		Perguntas pergunta9 = new Perguntas("A Lei da Pol�tica Nacional do Meio Ambiente tem por objetivo:",
				respostas9);
		quiz.addPerguntas(pergunta9);

		Respostas respostas10 = new Respostas("Energia nuclear", "Energia e�lica", "Energia Geot�rmica",
				"Energia solar passiva", 'a');
		Perguntas pergunta10 = new Perguntas("N�o � fonte de energia renov�vel:", respostas10);
		quiz.addPerguntas(pergunta10);
		
		//Aplica��o do m�todo de embaralhar as perguntas e sua imrpess�o de forma aleat�ria para os jogadores//

		quiz.embaralhar();

		char escolha;

		for (int i = 0; i < 10; i++) {

			System.out.println(quiz.getPerguntas().get(i));
			escolha = ent.next().charAt(0);

			quiz.atribuirPontos(i, escolha, jogador1, jogador2);
		}
		
		//Impress�o dos jogadores com suas pontua��es e o vencedor//

		System.out.println(jogador1);
		System.out.println(jogador2);
		
		System.out.println("");
		
		if(jogador1.getPontuacao() > jogador2.getPontuacao()) {
			System.out.println("Vencedor: " + jogador1.getNome());
		}else {
			System.out.println("Vencedor: " + jogador2.getNome());
		}

		ent.close();

	}

}

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
		
		//Criação do banco de perguntas e respostas//

		Respostas respostas1 = new Respostas("Poluição", "Jogadores de Futebol", "Vacas", "Filmes de herói", 'a');
		Perguntas pergunta1 = new Perguntas("Qual é a causa do efeito esfuta?", respostas1);
		quiz.addPerguntas(pergunta1);

		Respostas respostas2 = new Respostas("Azul, Verde, Vermelho e Rosa", "Azul, Verde, Branco e Amarelo",
				"Azul, Verde, Amarelo e Vermelho", "Preto, Branco, Rosa e Roxo", 'c');
		Perguntas pergunta2 = new Perguntas("Quais são as cores das lixeiras de reciclagem?", respostas2);
		quiz.addPerguntas(pergunta2);

		Respostas respostas3 = new Respostas("Menos de 100 anos", "200 anos", "Entre 300 e 400 anos",
				"Mais de 400 anos", 'd');
		Perguntas pergunta3 = new Perguntas("Quantos anos leva para o plástico se decompor no meio ambiente?",
				respostas3);
		quiz.addPerguntas(pergunta3);

		Respostas respostas4 = new Respostas("Brasil", "EUA", "China", "Rússia", 'c');
		Perguntas pergunta4 = new Perguntas("Qual o país que mais consome energia elétrica no mundo?", respostas4);
		quiz.addPerguntas(pergunta4);

		Respostas respostas5 = new Respostas(
				"Propelente em aerossóis e medicamentos que contenham CFC, encontrados em alguns desodorantes e em alguns medicamentos antiflamatórios em spray.",
				"Solvente para limpeza de elementos de precisão e eletrônica.",
				"Fluidos usados na refrigeração comercial como por exemplo em aparelhos de ar condicionado domésticos.",
				"Todos os items listados.", 'd');
		Perguntas pergunta5 = new Perguntas(
				"Quais das seguintes substâncias contribuem para a destruição da camada de ozônio?", respostas5);
		quiz.addPerguntas(pergunta5);

		Respostas respostas6 = new Respostas("Cerrado", "Pampa", "Mata Atlântica", "Amazônia", 'c');
		Perguntas pergunta6 = new Perguntas("Qual o bioma mais ameaçado do país?", respostas6);
		quiz.addPerguntas(pergunta6);

		Respostas respostas7 = new Respostas("Dirigir carros elétricos", "Usar energia solar",
				"Usar água para lavar o carro", "Usar materiais plásticos", 'b');
		Perguntas pergunta7 = new Perguntas("Quais das alternativas são exemplos de consumo sustentável?", respostas7);
		quiz.addPerguntas(pergunta7);

		Respostas respostas8 = new Respostas(
				"Separar lixo inorgânico (plásticos, vidros, metais e papéis) para reciclagem antes de sua coleta.",
				"Incinerar o lixo orgânico em casa.", "Jogar seu lixo na rua", "Nenhuma das alternativas", 'a');
		Perguntas pergunta8 = new Perguntas(
				"Qual a estratégia correta para diminuir o acúmulo de lixo nos aterros sanitários?", respostas8);
		quiz.addPerguntas(pergunta8);

		Respostas respostas9 = new Respostas(
				"Incentivar o estudo às questões ambientais e o uso da tecnologia em prol delas",
				"Fiscalizar a utilização da coleta seletiva nos bairros",
				"Controle potencial da emissão de gases em indústrias de grande porte",
				"Reflorestar áreas de desmatamento", 'b');
		Perguntas pergunta9 = new Perguntas("A Lei da Política Nacional do Meio Ambiente tem por objetivo:",
				respostas9);
		quiz.addPerguntas(pergunta9);

		Respostas respostas10 = new Respostas("Energia nuclear", "Energia eólica", "Energia Geotérmica",
				"Energia solar passiva", 'a');
		Perguntas pergunta10 = new Perguntas("Não é fonte de energia renovável:", respostas10);
		quiz.addPerguntas(pergunta10);
		
		//Aplicação do método de embaralhar as perguntas e sua imrpessão de forma aleatória para os jogadores//

		quiz.embaralhar();

		char escolha;

		for (int i = 0; i < 10; i++) {

			System.out.println(quiz.getPerguntas().get(i));
			escolha = ent.next().charAt(0);

			quiz.atribuirPontos(i, escolha, jogador1, jogador2);
		}
		
		//Impressão dos jogadores com suas pontuações e o vencedor//

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

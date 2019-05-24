package entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Quiz {

	private List<Perguntas> perguntas = new ArrayList<>();

	public Quiz() {
	}

	public List<Perguntas> getPerguntas() {
		return perguntas;
	}

	public void addPerguntas(Perguntas pergunta) {
		perguntas.add(pergunta);
	}

	public void embaralhar() {
		Collections.shuffle(perguntas);
	}
	
	//Lógica de atribuição de pontos conforme acerto dos jogadores//

	public void atribuirPontos(Integer i, Character escolha, Jogador jogador1, Jogador jogador2) {
		if (i % 2 == 0) {
			perguntas.get(i).getRespostas().conferirResposta(escolha, jogador1);
		} else {
			perguntas.get(i).getRespostas().conferirResposta(escolha, jogador2);
		}
	}
	
	//Lógica para mostrar o vencedor do Quiz//

	public void vencedorQuiz(Jogador jogador1, Jogador jogador2) {

		if (jogador1.getPontuacao() > jogador2.getPontuacao()) {
			System.out.println(jogador1.getNome());
		} else {
			System.out.println(jogador2.getNome());
		}
	}

}

package regrasNegocio;

import java.util.ArrayList;

import Apresentacao.Menu;
import FileIO.Leitura;

public class Jogo {
	public Menu menu;
	public ArrayList<BatalhaIndividual> batalhas;
	//BatalhaIndividual batalha;
	
	public Jogo() {
		batalhas = new ArrayList<BatalhaIndividual>();
		menu = new Menu();
	}

	

	public void iniciar(Personagem p1, Personagem p2) {
		//batalha = new BatalhaIndividual(p1, p2);
		
		//batalha.lutar(p1, p2);
		
		
		for (BatalhaIndividual batalha : batalhas) {
			batalha.lutar(p1, p2);
			
			menu.imprimirRelatorioFinal(batalha);	
		}

		System.out.println("Nome p1: "+p1.getNome());
		System.out.println("Nome p2: "+p2.getNome());
		System.out.println("Pontuação p1: "+p1.getPontuacao());
		System.out.println("Pontuação p2: "+p2.getPontuacao());
		//menu.relatorioFinal(p1,p2);
		
	}
}

package regrasNegocio;

import java.util.ArrayList;

import Apresentacao.Menu;
import FileIO.Leitura;

public class Jogo {
	public Menu menu;
	public ArrayList<BatalhaIndividual> batalhas;
	//BatalhaIndividual batalha;
	Morfel m = new Morfel();
	
	Copinho cp = new Copinho();
	Cafezito c = new Cafezito();
	Trinity t = new Trinity();
	Neo n = new Neo();
	Oraculo o = new Oraculo();
	
	
	public Jogo() {
		batalhas = new ArrayList<BatalhaIndividual>();
		menu = new Menu();
	}

	

	public void iniciar(Personagem p1, Personagem p2, int numBatalhas, String nome1, String nome2) {
		//batalha = new BatalhaIndividual(p1, p2);
		
		//batalha.lutar(p1, p2);
		
		Morfel m = new Morfel();
		Copinho cp = new Copinho();
		Cafezito c = new Cafezito();
		Trinity t = new Trinity();
		Neo n = new Neo();
		Oraculo o = new Oraculo();
		
		System.out.println("xxxxxxxxxx");
		
		for (int i = 0; i < numBatalhas; i++) {
			BatalhaIndividual batalha = new BatalhaIndividual(i);
			batalhas.add(batalha);
		}
		
		
		
		for (BatalhaIndividual batalha : batalhas) {

			
				
				
				batalha.lutar(p1, p2, o, n, c, m, t, cp);
				menu.relatorioFinal(p1, p2, o, n, c, m, t, cp);	
			
		}
		
		
		
	}
}

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

	
	public void lutar(Personagem p1, Personagem p2) {
		
		System.out.println("luta");
		
		for (Integer i : p1.getListaAcoes()) {
			for(Integer j : p2.getListaDefesa()) {
				if(p1.getListaAcoes().get(i)> p2.getListaDefesa().get(i)) {
					p1.setPontuacao(p1.getPontuacao()+1);
				}else if(p1.getListaAcoes().get(i)< p2.getListaDefesa().get(i)) {
					p2.setPontuacao(p2.getPontuacao()+1);
				}
			}
		}
		for (Integer i : p2.getListaAcoes()) {
			for(Integer j : p1.getListaDefesa()) {
				if(p2.getListaAcoes().get(i)> p1.getListaDefesa().get(i)) {
					p2.setPontuacao(p2.getPontuacao()+1);
				}else if(p2.getListaAcoes().get(i)< p1.getListaDefesa().get(i)) {
					p1.setPontuacao(p1.getPontuacao()+1);
				}
			}
		}
	}

	

	public void iniciar(Personagem p1, Personagem p2, int numBatalhas) {
		//batalha = new BatalhaIndividual(p1, p2);
		
		//batalha.lutar(p1, p2);
		for (int i = 0; i < numBatalhas; i++) {
			BatalhaIndividual batalha = new BatalhaIndividual(i);
			batalhas.add(batalha);
		}
		
		
		for (BatalhaIndividual batalha : batalhas) {
			
			batalha.lutar(p1, p2);
		}
		
		menu.relatorioFinal(p1, p2);
		
		
	}
}

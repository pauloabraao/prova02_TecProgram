package regrasNegocio;

import java.util.ArrayList;

import Apresentacao.Menu;
import FileIO.Escrita;
import FileIO.Leitura;

public class Jogo {
	public Menu menu;
	public ArrayList<BatalhaIndividual> batalhas;
	BatalhaIndividual batalha = new BatalhaIndividual();
	private int quantDeBatalhas;
	public String string = "";
	
	Escrita escrita = new Escrita();
	
	
	public Jogo() {
		batalhas = new ArrayList<BatalhaIndividual>();
		menu = new Menu();
	}
	
	public int getQuantDeBatalhas() {
		return quantDeBatalhas;
	}

	public void setQuantDeBatalhas(int quantDeBatalhasIndividuais) {
		this.quantDeBatalhas = quantDeBatalhasIndividuais;
	}

	public void iniciar(Personagem p1, Personagem p2) {
		
		Morfel m = new Morfel();
		Copinho cp = new Copinho();
		Cafezito c = new Cafezito();
		Trinity t = new Trinity();
		Neo n = new Neo();
		Oraculo o = new Oraculo();

		batalha.lutar(p1, p2, o, n, c, m, t, cp);
			
		setQuantDeBatalhas(getQuantDeBatalhas()+1);

		menu.relatorioFinal(p1, p2, o, n, c, m, t, cp);
		escrita.escrever(quantDeBatalhas  + ";"+ string + menu.string(),"dados/BF_500_resposta.csv");	

	}
}

package regrasNegocio;

import java.util.ArrayList;

import Apresentacao.Menu;
import FileIO.Leitura;

public class Jogo {
	public Menu menu;
	public ArrayList<BatalhaIndividual> batalhas;
	public ArrayList<Morfel> morfeus = new  ArrayList<>();
	public ArrayList<Cafezito> cafezitos = new  ArrayList<>();
	public ArrayList<Copinho> copinhos = new  ArrayList<>();
	public ArrayList<Neo> neos = new  ArrayList<>();
	public ArrayList<Trinity> trinitys = new  ArrayList<>();
	public ArrayList<Oraculo> oraculos = new  ArrayList<>();
	private int quantDeBatalhasIndividuais;
	private int qntPersonagemMOR = 0;
	private int qntPersonagemCAF = 0;
	private int qntPersonagemTRI = 0;
	private int qntPersonagemORC = 0;
	private int qntPersonagemNEO = 0;
	private int qntPersonagemCOP = 0;
	Morfel m = new Morfel();
	
	Copinho cp = new Copinho();
	Cafezito c = new Cafezito();
	Trinity t = new Trinity();
	Neo n = new Neo();
	Oraculo o = new Oraculo();
	
	String ORC = "ORC";
	String NEO = "NEO";
	String CAF = "CAF";
	String MOR = "MOR";
	String COP = "COP";
	String TRI = "TRI";
	
	public Jogo() {
		batalhas = new ArrayList<BatalhaIndividual>();
		menu = new Menu();
	}
	
	public int getQuantDeBatalhasIndividuais() {
		return quantDeBatalhasIndividuais;
	}

	public void setQuantDeBatalhasIndividuais(int quantDeBatalhasIndividuais) {
		this.quantDeBatalhasIndividuais = quantDeBatalhasIndividuais;
	}
	
	public Morfel novoMorfeu(Personagem p1, Personagem p2, String nome1, String nome2) {
		Morfel m = new Morfel();
		if(p1.getTipo().equals(m.getTipo()) ) {
			m.setNome(nome1);
			morfeus.add(m);
			for (int i = 0; i< morfeus.size()-1; i++) {
					if(morfeus.get(i).getNome().equals(p1.getNome())) {
						System.out.println("\n\n xxx \n\n");
						return morfeus.get(i);	
					}else {
						System.out.println("yyyy");
						return m;
					}
			}
		}
		if(p2.getTipo().equals(m.getTipo())) {
			m.setNome(nome2);
			morfeus.add(m);
			for (int i = 0; i< morfeus.size()-1; i++) {
					if( morfeus.get(i).getNome().equals(p2.getNome())) {
						System.out.println("\n\n xxx \n\n");
						return morfeus.get(i);	
					}else {
						System.out.println("yyyy");
						return m;
					}
			}
			
		}
		return m;
	}
	public Cafezito novoCaf(Personagem p1, Personagem p2, String nome1, String nome2) {
		Cafezito c = new Cafezito();
		if(p1.getTipo().equals(c.getTipo()) ) {
			c.setNome(nome1);
			cafezitos.add(c);
			for (int i = 0; i<cafezitos.size()-1; i++) {
					if(cafezitos.get(i).getNome().equals(p1.getNome())) {
						System.out.println("\n\n xxx \n\n");
						return cafezitos.get(i);	
					}else {
						System.out.println("yyyy");
						return c;
					}
			}
		}
		if(p2.getTipo().equals(c.getTipo())) {
			c.setNome(nome2);
			cafezitos.add(c);
			for (int i = 0; i<cafezitos.size()-1; i++) {
					if( cafezitos.get(i).getNome().equals(p2.getNome())) {
						System.out.println("\n\n xxx \n\n");
						return cafezitos.get(i);	
					}else {
						System.out.println("yyyy");
						return c;
					}
			}
			
		}
		return c;
	}
	public Copinho novoCop(Personagem p1, Personagem p2, String nome1, String nome2) {
		Copinho c = new Copinho();
		if(p1.getTipo().equals(c.getTipo()) ) {
			c.setNome(nome1);
			copinhos.add(c);
			for (int i = 0; i<copinhos.size()-1; i++) {
					if(copinhos.get(i).getNome().equals(p1.getNome())) {
						System.out.println("\n\n xxx \n\n");
						return copinhos.get(i);	
					}else {
						System.out.println("yyyy");
						return c;
					}
			}
		}
		if(p2.getTipo().equals(c.getTipo())) {
			c.setNome(nome2);
			copinhos.add(c);
			for (int i = 0; i<copinhos.size()-1; i++) {
					if( copinhos.get(i).getNome().equals(p2.getNome())) {
						System.out.println("\n\n xxx \n\n");
						return copinhos.get(i);	
					}else {
						System.out.println("yyyy");
						return c;
					}
			}
			
		}
		return c;
	}
	
	public Neo novoNeo(Personagem p1, Personagem p2, String nome1, String nome2) {
		Neo n = new Neo();
		if(p1.getTipo().equals(n.getTipo()) ) {
			n.setNome(nome1);
			neos.add(n);
			for (int i = 0; i<neos.size()-1; i++) {
					if(neos.get(i).getNome().equals(p1.getNome())) {
						System.out.println("\n\n xxx \n\n");
						return neos.get(i);	
					}else {
						System.out.println("yyyy");
						return n;
					}
			}
		}
		if(p2.getTipo().equals(n.getTipo())) {
			n.setNome(nome2);
			neos.add(n);
			for (int i = 0; i<neos.size()-1; i++) {
					if(neos.get(i).getNome().equals(p2.getNome())) {
						System.out.println("\n\n xxx \n\n");
						return neos.get(i);	
					}else {
						System.out.println("yyyy");
						return n;
					}
			}
			
		}
		return n;
	}
	public Trinity novoTri(Personagem p1, Personagem p2, String nome1, String nome2) {
		Trinity t = new Trinity();
		if(p1.getTipo().equals(t.getTipo()) ) {
			t.setNome(nome1);
			trinitys.add(t);
			for (int i = 0; i<trinitys.size()-1; i++) {
					if(trinitys.get(i).getNome().equals(p1.getNome())) {
						System.out.println("\n\n xxx \n\n");
						return trinitys.get(i);	
					}else {
						System.out.println("yyyy");
						return t;
					}
			}
		}
		if(p2.getTipo().equals(t.getTipo())) {
			t.setNome(nome2);
			trinitys.add(t);
			for (int i = 0; i<trinitys.size()-1; i++) {
					if(trinitys.get(i).getNome().equals(p2.getNome())) {
						System.out.println("\n\n xxx \n\n");
						return trinitys.get(i);	
					}else {
						System.out.println("yyyy");
						return t;
					}
			}
			
		}
		return t;
	}
	public Oraculo novoOrc(Personagem p1, Personagem p2, String nome1, String nome2) {
		Oraculo o = new Oraculo();
		if(p1.getTipo().equals(o.getTipo()) ) {
			o.setNome(nome1);
			oraculos.add(o);
			for (int i = 0; i<oraculos.size()-1; i++) {
					if(oraculos.get(i).getNome().equals(p1.getNome())) {
						System.out.println("\n\n xxx \n\n");
						return oraculos.get(i);	
					}else {
						System.out.println("yyyy");
						return o;
					}
			}
		}
		if(p2.getTipo().equals(o.getTipo())) {
			o.setNome(nome2);
			oraculos.add(o);
			for (int i = 0; i<oraculos.size()-1; i++) {
					if(oraculos.get(i).getNome().equals(p2.getNome())) {
						System.out.println("\n\n xxx \n\n");
						return oraculos.get(i);	
					}else {
						System.out.println("yyyy");
						return o;
					}
			}
			
		}
		return o;
	}

	

	public void iniciar(Personagem p1, Personagem p2,Oraculo o, Neo n,
			Cafezito c, Morfel m, Trinity t, Copinho cp, int numBatalhas, String nome1, String nome2) {
		//batalha = new BatalhaIndividual(p1, p2);
		
		//batalha.lutar(p1, p2);
		
		
		
		if(p1.getTipo().equals(MOR)) {
			 qntPersonagemMOR++;
		}
		if(p1.getTipo().equals(CAF)) {
			 qntPersonagemCAF++;
		}
		if(p1.getTipo().equals(ORC)) {
			 qntPersonagemORC++;
		}
		if(p1.getTipo().equals(TRI)) {
			 qntPersonagemTRI++;
		}
		if(p1.getTipo().equals(NEO)) {
			 qntPersonagemNEO++;
		}
		if(p1.getTipo().equals(COP)) {
			 qntPersonagemCOP++;
		}
	
		
		
		
		
		for (int i = 0; i < numBatalhas; i++) {
			BatalhaIndividual batalha = new BatalhaIndividual(i);
			batalhas.add(batalha);
		}

		for (BatalhaIndividual batalha : batalhas) {
				batalha.lutar(p1, p2, o, n, c, m, t, cp);
					
				setQuantDeBatalhasIndividuais(getQuantDeBatalhasIndividuais()+1);
			
		}
		
		menu.relatorioFinal(p1, p2, o, n, c, m, t, cp);
		
		System.out.println("Qnt de Batalhas Individuias " + getQuantDeBatalhasIndividuais());
		
		System.out.println("Qnt de morfeus: "+ qntPersonagemMOR + "Qnt de orc: " + qntPersonagemORC);
		
		
	}
}

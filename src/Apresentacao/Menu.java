package Apresentacao;
import FileIO.Leitura;

import java.util.ArrayList;
import java.util.Scanner;
import regrasNegocio.BatalhaIndividual;
import regrasNegocio.Cafezito;
import regrasNegocio.Copinho;
import regrasNegocio.Morfel;
import regrasNegocio.Neo;
import regrasNegocio.Oraculo;
import regrasNegocio.Personagem;
import regrasNegocio.Trinity;

public class Menu {
	
	String ORC = "ORC";
	String NEO = "NEO";
	String CAF = "CAF";
	String MOR = "MOR";
	String COP = "COP";
	String TRI = "TRI";

	public Scanner ler;

	Cafezito c = new Cafezito();
	Oraculo o = new Oraculo();
	Neo n = new Neo();
	Morfel m = new Morfel();
	Trinity t = new Trinity();
	Copinho cp = new Copinho();

	public Menu() {
		ler = new Scanner(System.in);
	}

	public void apresentacao() {

		System.out.println("***** Bem vindo ao jogo do Senhor dos Cafes! ****");
	}

	public void relatorioFinal(Personagem p1, Personagem p2, Personagem o, Personagem n,
			Personagem c, Personagem m, Personagem t, Personagem cp) {

		if(p1.getTipo().equals(ORC) ) {
			o.setNome(p1.getNome());
			System.out.println("Nome: "+o.getNome()+"\nPontuação: " + o.getPontuacao());
		}if(p2.getTipo().equals(ORC)) {
			o.setNome(p2.getNome());
			System.out.println("Nome: "+o.getNome()+"\nPontuação: " + o.getPontuacao());
		}if(p1.getTipo().equals(NEO)) {
			n.setNome(p1.getNome());
			System.out.println("Nome: "+n.getNome()+"\nPontuação: " + n.getPontuacao());
			
		}if(p2.getTipo().equals(NEO)) {
			n.setNome(p2.getNome());
			System.out.println("Nome: "+n.getNome()+"\nPontuação: " + n.getPontuacao());
			
		}
		if(p1.getTipo().equals(CAF)) {
			c.setNome(p1.getNome());
			System.out.println("Nome: "+c.getNome()+"\nPontuação: " + c.getPontuacao());
			
		}if(p2.getTipo().equals(CAF)) {
			c.setNome(p2.getNome());
			System.out.println("Nome: "+c.getNome()+"\nPontuação: " + c.getPontuacao());
			
		}
		if(p1.getTipo().equals(MOR)) {
			m.setNome(p1.getNome());
			System.out.println("Nome: "+m.getNome()+"\nPontuação: " + m.getPontuacao());
			
		}if( p2.getTipo().equals(MOR)) {
			m.setNome(p2.getNome());
			System.out.println("Nome: "+m.getNome()+"\nPontuação: " + m.getPontuacao());
			
		} if(p1.getTipo().equals(TRI)) {
			t.setNome(p1.getNome());
			System.out.println("Nome: "+t.getNome()+"\nPontuação: " + t.getPontuacao());
			
		}else if(p2.getTipo().equals(TRI)) {
			t.setNome(p2.getNome());
			System.out.println("Nome: "+t.getNome()+"\nPontuação: " + t.getPontuacao());
			
		}
		if(p1.getTipo().equals(COP)) {
			cp.setNome(p1.getNome());
			System.out.println("Nome: "+cp.getNome()+"\nPontuação: " + cp.getPontuacao());
			
		}
		if(p2.getTipo().equals(COP)) {
			cp.setNome(p2.getNome());
			System.out.println("Nome: "+cp.getNome()+"\nPontuação: " + cp.getPontuacao());
			
		}
		
	}
}

package Apresentacao;
import FileIO.Leitura;

import java.util.ArrayList;
import java.util.Scanner;
import regrasNegocio.BatalhaIndividual;
import regrasNegocio.Cafezito;
import regrasNegocio.Copinho;
import regrasNegocio.Jogo;
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

	String string = "";
	String personagensvivos = "";
	String personagensmortos = "";
	int qntpersonagensvivos = 0;
	int qntpersonagensmortos = 0;

	public void relatorioFinal(Personagem p1, Personagem p2, Personagem o, Personagem n,
			Personagem c, Personagem m, Personagem t, Personagem cp) {

		if(p1.getTipo().equals(ORC) ) {
			o.setNome(p1.getNome());
			System.out.println("Nome: "+o.getNome()+"\nPontuação: " + o.getPontuacao());
			if(o.getPontuacao()>0) {
				personagensvivos+= o.getNome()+";" ;
				 qntpersonagensvivos++;
			}else {
				personagensmortos += o.getNome()+";" ;
				qntpersonagensmortos++;
			}
			string += p1.getTipo() + "=" + o.getPontuacao() + ";" ;
		}if(p2.getTipo().equals(ORC)) {
			o.setNome(p2.getNome());
			System.out.println("Nome: "+o.getNome()+"\nPontuação: " + o.getPontuacao());
			if(o.getPontuacao()>0) {
				personagensvivos+= o.getNome()+";" ;
				 qntpersonagensvivos++;
			}else {
				personagensmortos += o.getNome()+";" ;
				qntpersonagensmortos++;
			}
			string += p2.getTipo() + "=" + o.getPontuacao() + ";";
		}if(p1.getTipo().equals(NEO)) {
			n.setNome(p1.getNome());
			System.out.println("Nome: "+n.getNome()+"\nPontuação: " + n.getPontuacao());
			string += p1.getTipo() + "=" + n.getPontuacao() + ";";
			if(n.getPontuacao()>0) {
				personagensvivos+= n.getNome()+";" ;
				 qntpersonagensvivos++;
			}else {
				personagensmortos += n.getNome()+";" ;
				qntpersonagensmortos++;
			}
		}if(p2.getTipo().equals(NEO)) {
			n.setNome(p2.getNome());
			System.out.println("Nome: "+n.getNome()+"\nPontuação: " + n.getPontuacao());
			if(n.getPontuacao()>0) {
				personagensvivos+= n.getNome()+";" ;
				 qntpersonagensvivos++;
			}else {
				personagensmortos += n.getNome()+";" ;
				qntpersonagensmortos++;
			}
			string += p2.getTipo() + "=" + n.getPontuacao() + ";";
		}
		if(p1.getTipo().equals(CAF)) {
			c.setNome(p1.getNome());
			System.out.println("Nome: "+c.getNome()+"\nPontuação: " + c.getPontuacao());
			string += p1.getTipo() + "=" + c.getPontuacao() + ";";
			if(c.getPontuacao()>0) {
				personagensvivos+= c.getNome()+";" ;
				 qntpersonagensvivos++;
			}else {
				personagensmortos += c.getNome()+";" ;
				qntpersonagensmortos++;
			}
		}if(p2.getTipo().equals(CAF)) {
			c.setNome(p2.getNome());
			System.out.println("Nome: "+c.getNome()+"\nPontuação: " + c.getPontuacao());
			string += p2.getTipo() + "=" + c.getPontuacao() + ";";
			if(c.getPontuacao()>0) {
				personagensvivos+= c.getNome()+";" ;
				 qntpersonagensvivos++;
			}else {
				personagensmortos += c.getNome()+";" ;
				qntpersonagensmortos++;
			}
		}
		if(p1.getTipo().equals(MOR)) {
			m.setNome(p1.getNome());
			System.out.println("Nome: "+m.getNome()+"\nPontuação: " + m.getPontuacao());
			if(m.getPontuacao()>0) {
				personagensvivos+= m.getNome()+";" ;
				 qntpersonagensvivos++;
			}else {
				personagensmortos += m.getNome()+";" ;
				qntpersonagensmortos++;
			}
			string += p1.getTipo() + "=" + m.getPontuacao()+";" ;
		}if( p2.getTipo().equals(MOR)) {
			m.setNome(p2.getNome());
			System.out.println("Nome: "+m.getNome()+"\nPontuação: " + m.getPontuacao());
			string += p2.getTipo() + "=" + m.getPontuacao() +";" ;
			if(m.getPontuacao()>0) {
				personagensvivos+= m.getNome()+";" ;
				 qntpersonagensvivos++;
			}else {
				personagensmortos += m.getNome()+";" ;
				qntpersonagensmortos++;
			}
		} if(p1.getTipo().equals(TRI)) {
			t.setNome(p1.getNome());
			System.out.println("Nome: "+t.getNome()+"\nPontuação: " + t.getPontuacao());
			string += p1.getTipo() + "=" + t.getPontuacao() +";" ;
			if(t.getPontuacao()>0) {
				personagensvivos+= t.getNome()+";" ;
				 qntpersonagensvivos++;
			}else {
				personagensmortos += t.getNome()+";" ;
				qntpersonagensmortos++;
			}
		} if(p2.getTipo().equals(TRI)) {
			t.setNome(p2.getNome());
			System.out.println("Nome: "+t.getNome()+"\nPontuação: " + t.getPontuacao());
			string += p2.getTipo() + "=" + t.getPontuacao() +";" ;
			if(t.getPontuacao()>0) {
				personagensvivos+= t.getNome()+";" ;
				 qntpersonagensvivos++;
			}else {
				personagensmortos += t.getNome()+";" ;
				qntpersonagensmortos++;
			}
		}
		if(p1.getTipo().equals(COP)) {
			cp.setNome(p1.getNome());
			System.out.println("Nome: "+cp.getNome()+"\nPontuação: " + cp.getPontuacao());
			string += p1.getTipo() + "=" + cp.getPontuacao() +";" ;
			if(cp.getPontuacao()>0) {
				personagensvivos+= cp.getNome()+";" ;
				 qntpersonagensvivos++;
			}else {
				personagensmortos += cp.getNome()+";" ;
				qntpersonagensmortos++;
			}
		}
		if(p2.getTipo().equals(COP)) {
			cp.setNome(p2.getNome());
			System.out.println("Nome: "+cp.getNome()+"\nPontuação: " + cp.getPontuacao());
			string += p2.getTipo() + "=" + cp.getPontuacao() +";" ;
			if(cp.getPontuacao()>0) {
				personagensvivos+= cp.getNome()+";" ;
				 qntpersonagensvivos++;
			}else {
				personagensmortos += cp.getNome()+";" ;
				qntpersonagensmortos++;
			}
		}
		
	}
	
	public String string() {
		return string + qntpersonagensvivos+";" +qntpersonagensmortos+";" +personagensvivos +personagensmortos;
	}
}

package regrasNegocio;

import java.util.ArrayList;
import java.util.Iterator;

import FileIO.Leitura;

public class Personagem {
	String ORC = "ORC";
	String NEO = "NEO";
	String CAF = "CAF";
	String MOR = "MOR";
	String COP = "COP";
	String TRI = "TRI";

	protected  String nome;
	protected String tipo;
	protected int pontuacao;
	protected boolean vencedor;
	private ArrayList<Integer> listaAcoes;
	private ArrayList<Integer> listaDefesa;
	protected int superAtaque;

	
	public Personagem() {
		
	}
	
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getPontuacao() {
		return pontuacao;
	}

	
	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}


	public int getSuperAtaque() {
		return superAtaque;
	}


	public void setSuperAtaque(int superAtaque) {
		this.superAtaque = superAtaque;
	}


	public ArrayList<Integer> getListaAcoes(){
		return listaAcoes;
	}
	
	public void setListaAcoes(ArrayList<Integer> lista){
		this.listaAcoes = lista;
	}
	
	public void setListaElemento(ArrayList<Integer> lista){
		
		for (Integer integer : lista) {
			integer*= 2;
		}
		this.listaAcoes = lista;
	}
	
	public void setListaZero() {
		for (Integer integer : listaAcoes) {
			integer = 0;
		}
		
	}
	
	public ArrayList<Integer> getListaDefesa() {
		return listaDefesa;
	}


	public void setListaDefesa(ArrayList<Integer> lista){
		this.listaDefesa = lista;
	}
	
	public void imprimirLista() {
		System.out.println("\nLista de Acões");
		for (Integer integer : listaAcoes) {
			System.out.print(integer + " ");
		}
		System.out.println("\n");
	}
	public void imprimirListaDefesa() {
		System.out.println("\nLista de Defesa");
		for (Integer integer : listaDefesa) {
			System.out.print(integer + " ");
		}
		System.out.println("\n");
	}
	
	public void superAtaque(Personagem p1, Personagem p2,Personagem o, Personagem n,
			Personagem c, Personagem m, Personagem t, Personagem cp, int i, int j) {
		if(p1.getTipo().equals(MOR)|| p2.getTipo().equals(MOR)) {
			if(m.getListaAcoes().get(i)==7) {
				m.setListaElemento(m.getListaAcoes());
			}
		}
		if(p1.getTipo().equals(ORC)|| p2.getTipo().equals(ORC)) {
			if(o.getListaAcoes().get(i)==4) {
				o.setListaElemento(o.getListaAcoes());
			}
		}
	}
}

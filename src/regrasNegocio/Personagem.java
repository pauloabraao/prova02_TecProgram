package regrasNegocio;

import java.util.ArrayList;
import java.util.Iterator;

import FileIO.Leitura;

public class Personagem {


	protected  String nome;
	protected String tipo;
	protected int pontuacao;
	protected boolean vencedor;
	private ArrayList<Integer> listaAcoes;
	private ArrayList<Integer> listaDefesa;

	
	public Personagem() {
		this.nome= nome;
		this.tipo = tipo;
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

	
	public ArrayList<Integer> getListaAcoes(){
		return listaAcoes;
	}
	
	public void setListaAcoes(ArrayList<Integer> lista){
		this.listaAcoes = lista;
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
	
	public String listaDeAcoesOrganizadas() {
		String saida="";
		for (Integer i : listaAcoes) {
			saida = saida +  i + " - "; 
		}
		return saida;
	}
	
	public int tamanhoListaAcoes() {
		return listaAcoes.size();
	}
	
}

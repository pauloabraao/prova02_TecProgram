package FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import regrasNegocio.Cafezito;
import regrasNegocio.Copinho;
import regrasNegocio.Jogo;
import regrasNegocio.ListadePersonagens;
import regrasNegocio.Morfel;
import regrasNegocio.Neo;
import regrasNegocio.Oraculo;
import regrasNegocio.Personagem;
import regrasNegocio.Trinity;

public class Leitura {
	int num = 0;
	public ArrayList<String> linhas;
	ArrayList<Integer> lista;
	ArrayList<Integer> lista2;
	ListadePersonagens personagens = new ListadePersonagens();
	ListadePersonagens personagens2 = new ListadePersonagens();
	public ArrayList<Morfel> morfeus = new  ArrayList<>();
	
	Personagem p = new Personagem();
	Personagem p2 = new Personagem();
	Jogo jogo = new Jogo();
	
	Morfel m = new Morfel();
	Copinho cp = new Copinho();
	Cafezito c = new Cafezito();
	Trinity t = new Trinity();
	Neo n = new Neo();
	Oraculo o = new Oraculo();
	

	int contadorDeLinha = 0;
	int quantidadeDeBatalhas;
	int combateIndividual=0;
	
	public Leitura() {
		linhas = new ArrayList<String>();
	}
	public void ler(String caminho) {
		BufferedReader br;

		try {
			br = new BufferedReader(new FileReader(caminho));

			while (br.ready()) {
				String textoDaLinha = br.readLine();
				splitLinha(textoDaLinha);
				getLines();
				contadorDeLinha++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	public void splitLinha(String linha) {

		if (linha != null) {
			if (contadorDeLinha == 0) {
				quantidadeDeBatalhas = Integer.parseInt(linha);
				System.out.println("Quantidade de batalhas " + quantidadeDeBatalhas);
				
			}else {
				if (contadorDeLinha != (quantidadeDeBatalhas + 1)) {
					combateIndividual++;

					System.out.println("Linha " + contadorDeLinha);
					String[] splitted = linha.split(";");
   
					lista = new ArrayList<>();
					lista2 = new ArrayList<>();
					p.setNome(splitted[4]);
					p.setTipo(splitted[3]);
					for (int i = 0; i < 10; i++) {						
						num = Integer.parseInt(splitted[i + 7]);
						lista.add(num);
						
					}
					p.setListaAcoes(lista);
					for (int i = 0; i < 10; i++) {	
						num = Integer.parseInt(splitted[i + 17]);
						lista2.add(num);	
					}
					p.setListaDefesa(lista2);
					personagens.personagens.add(p);
					
					lista = new ArrayList<>();
					lista2 = new ArrayList<>();
					p2.setNome(splitted[6]);
					p2.setTipo(splitted[5]);
					for (int i = 0; i < 10; i++) {
						
						num = Integer.parseInt(splitted[i + 27]);
						lista.add(num);
						
					}
					p2.setListaAcoes(lista);
					for (int i = 0; i < 10; i++) {
						
						num = Integer.parseInt(splitted[i + 37]);
						lista2.add(num);	
					}
					p2.setListaDefesa(lista2);
					personagens2.personagens.add(p2);
					
					
					
					jogo.iniciar(p, p2,jogo.novoOrc(p, p2, splitted[4], splitted[6]),
							jogo.novoNeo(p, p2, splitted[4], splitted[6]),jogo.novoCaf(p, p2, splitted[4], splitted[6]), jogo.novoMorfeu(p, p2, splitted[4], splitted[6]),
							jogo.novoTri(p, p2, splitted[4], splitted[6]), jogo.novoCop(p, p2, splitted[4], splitted[6]), quantidadeDeBatalhas, splitted[4], splitted[6]);
				}
			}
		}	
	}
	
	public void getLines() {
		/*for (Personagem p : personagens.personagens) {
			System.out.println("\nNome: "+p.getNome());
			System.out.println("\nTipo: "+ p.getTipo());
			p.imprimirLista();
			
			p.imprimirListaDefesa();
		}
		for (Personagem p : personagens2.personagens) {
			System.out.println("\nNome: "+p.getNome());
			System.out.println("\nTipo: "+ p.getTipo());
			p.imprimirLista();
			
			p.imprimirListaDefesa();
		}*/
		
		/*for (int i = 0; i < personagens.personagens.size()-1; i++) {
			for (int j = 0; j< personagens2.personagens.size()-1; j++) {
				jogo.iniciar(personagens.personagens.get(i), personagens2.personagens.get(j), quantidadeDeBatalhas);
				
			}
		}*/
		
		
				
				
				
				
		
		
		
	}
	
	public ArrayList<Personagem> listadePersonagens() {
		return personagens.personagens;
	}
}
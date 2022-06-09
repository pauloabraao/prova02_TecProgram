package FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import regrasNegocio.Jogo;
import regrasNegocio.ListadePersonagens;
import regrasNegocio.Personagem;

public class Leitura {
	int num = 0;
	public ArrayList<String> linhas;
	ArrayList<Integer> lista;
	ArrayList<Integer> lista2;
	ListadePersonagens personagens = new ListadePersonagens();
	ListadePersonagens personagens2 = new ListadePersonagens();
	Personagem p = new Personagem();
	Personagem p2 = new Personagem();
	Jogo jogo = new Jogo();
	

	int contadorDeLinha = 0;
	int quantidadeDeBatalhas;
	
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
					p2.setNome(splitted[5]);
					p2.setTipo(splitted[6]);
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
		for (Personagem p : personagens.personagens) {
			for (Personagem p2 : personagens2.personagens) {
				jogo.iniciar(p, p2, quantidadeDeBatalhas);
			}
		}
	}
	
	public ArrayList<Personagem> listadePersonagens() {
		return personagens.personagens;
	}
}
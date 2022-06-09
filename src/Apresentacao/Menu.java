package Apresentacao;
import FileIO.Leitura;

import java.util.ArrayList;
import java.util.Scanner;
import regrasNegocio.BatalhaIndividual;
import regrasNegocio.Personagem;

public class Menu {

	public Scanner ler;

	public Menu() {
		ler = new Scanner(System.in);
	}

	public void apresentacao() {

		System.out.println("***** Bem vindo ao jogo do Senhor dos Cafes! ****");
	}

	public void relatorioFinal(Personagem p1, Personagem p2) {
		System.out.println("Nome p1: "+p1.getNome());
		System.out.println("Nome p2: "+p2.getNome());
		System.out.println("Pontuação p1: "+p1.getPontuacao());
		System.out.println("Pontuação p2: "+p2.getPontuacao());
	}
}

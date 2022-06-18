package regrasNegocio;

import FileIO.Escrita;
import FileIO.Leitura;

public class Main {

	public static void main(String[] args) {
		
		Leitura leitura = new Leitura();
		leitura.ler("dados/BF_500.csv");
		
	}
}

package regrasNegocio;

public class BatalhaIndividual {

	private Personagem morfeu;
	private Personagem copinho;
	private Personagem vencedor;
	private  int codigo;

	public BatalhaIndividual(Personagem m, Personagem c) {
		this.morfeu = m;
		this.copinho = c;
		this.codigo = codigo;
	}

	
	public Personagem getMorfeu() {
		return morfeu;
	}


	public Personagem getCopinho() {
		return copinho;
	}


	public Personagem getVencedor() {
		return vencedor;
	}


	public int getCodigo() {
		return codigo;
	}


	private int tamanhoListasConsideradas(Personagem p1, Personagem p2) {
		int tamanhoListaAcoes = 0;

		if (p1.getListaAcoes().size() > p2.getListaAcoes().size()) {
			tamanhoListaAcoes = p2.getListaAcoes().size();
		} else {
			tamanhoListaAcoes = p1.getListaAcoes().size();
		}

		return tamanhoListaAcoes;

	}

	public void lutar(Personagem p1, Personagem p2) {
		
		for (Integer i : p1.getListaAcoes()) {
			for(Integer j : p2.getListaDefesa()) {
				if(p1.getListaAcoes().get(i)> p2.getListaDefesa().get(i)) {
					p1.pontuacao++;
				}else if(p1.getListaAcoes().get(i)< p2.getListaDefesa().get(i)) {
					p2.pontuacao++;
				}
			}
		}
		for (Integer i : p2.getListaAcoes()) {
			for(Integer j : p1.getListaDefesa()) {
				if(p2.getListaAcoes().get(i)> p1.getListaDefesa().get(i)) {
					p2.pontuacao++;
				}else if(p2.getListaAcoes().get(i)< p1.getListaDefesa().get(i)) {
					p1.pontuacao++;
				}
			}
		}
		verificarVencedor(p1, p2);
	}
	
	private void verificarVencedor(Personagem p1, Personagem p2) {
		
		if(p1.pontuacao > p2.pontuacao) {
			this.vencedor = p1;
		} else if(p1.pontuacao < p2.pontuacao) {
			this.vencedor = p2;
		}
	}
}

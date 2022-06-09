package regrasNegocio;

public class BatalhaIndividual {
	
	private Personagem vencedor;
	private  int codigo;

	public BatalhaIndividual(int codigo) {
		this.codigo = codigo;
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
		
		for (int i = 0; i< p1.getListaAcoes().size()-1; i++) {
			for(int j = 0; j< p2.getListaDefesa().size()-1; j++) {
				if(p1.getListaAcoes().get(i)> p2.getListaDefesa().get(j)) {
					p1.setPontuacao(p1.getPontuacao()+1);
				}else if(p1.getListaAcoes().get(i)< p2.getListaDefesa().get(j)) {
					p2.setPontuacao(p2.getPontuacao()+1);
				}
			}
		}
		for (int i = 0; i< p2.getListaAcoes().size()-1; i++) {
			for(int j = 0; j< p1.getListaDefesa().size()-1; j++) {
				if(p2.getListaAcoes().get(i)> p1.getListaDefesa().get(j)) {
					p2.setPontuacao(p2.getPontuacao()+1);
				}else if(p2.getListaAcoes().get(i)< p1.getListaDefesa().get(j)) {
					p1.setPontuacao(p1.getPontuacao()+1);
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

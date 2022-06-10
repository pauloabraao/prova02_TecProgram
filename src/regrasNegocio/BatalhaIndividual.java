package regrasNegocio;

public class BatalhaIndividual {
	String ORC = "ORC";
	String NEO = "NEO";
	String CAF = "CAF";
	String MOR = "MOR";
	String COP = "COP";
	String TRI = "TRI";
	
	
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
	public void atribuirPontuacaoP1(Personagem p1, Personagem p2, Personagem o, Personagem n,
			Personagem c, Personagem m, Personagem t, Personagem cp, int i, int j) {
		
		
		if(p1.getTipo().equals(ORC)) {
			o.setPontuacao(o.getPontuacao()+(p1.getListaAcoes().get(i)- p2.getListaDefesa().get(j)));
		}else if(p1.getTipo().equals(NEO)) {
			n.setPontuacao(n.getPontuacao()+(p1.getListaAcoes().get(i)- p2.getListaDefesa().get(j)));
		}else if(p1.getTipo().equals(CAF)) {
			c.setPontuacao(c.getPontuacao()+(p1.getListaAcoes().get(i)- p2.getListaDefesa().get(j)));
		}else if(p1.getTipo().equals(MOR)) {
			m.setPontuacao(m.getPontuacao()+(p1.getListaAcoes().get(i)- p2.getListaDefesa().get(j)));
		}else if(p1.getTipo().equals(TRI)) {
			t.setPontuacao(t.getPontuacao()+(p1.getListaAcoes().get(i)- p2.getListaDefesa().get(j)));
		}else if(p1.getTipo().equals(COP)) {
			cp.setPontuacao(cp.getPontuacao()+(p1.getListaAcoes().get(i)- p2.getListaDefesa().get(j)));
		}
		
		
		
	}
	public void atribuirPontuacaoP2(Personagem p1, Personagem p2, Personagem o, Personagem n,
			Personagem c, Personagem m, Personagem t, Personagem cp, int i, int j) {
		if(p2.getTipo().equals(ORC)) {
			o.setPontuacao(o.getPontuacao()+(p2.getListaAcoes().get(i)- p1.getListaDefesa().get(j)));
		}else if(p2.getTipo().equals(NEO)) {
			n.setPontuacao(n.getPontuacao()+(p2.getListaAcoes().get(i)- p1.getListaDefesa().get(j)));
		}else if(p2.getTipo().equals(CAF)) {
			c.setPontuacao(c.getPontuacao()+(p2.getListaAcoes().get(i)- p1.getListaDefesa().get(j)));
		}else if(p2.getTipo().equals(MOR)) {
			m.setPontuacao(m.getPontuacao()+(p2.getListaAcoes().get(i)- p1.getListaDefesa().get(j)));
		}else if(p2.getTipo().equals(TRI)) {
			t.setPontuacao(t.getPontuacao()+(p2.getListaAcoes().get(i)- p1.getListaDefesa().get(j)));
		}else if(p2.getTipo().equals(COP)) {
			cp.setPontuacao(cp.getPontuacao()+(p2.getListaAcoes().get(i)- p1.getListaDefesa().get(j)));
		}	
	}

	public void lutar(Personagem p1, Personagem p2, Personagem o, Personagem n,
			Personagem c, Personagem m, Personagem t, Personagem cp) {
		
		
		for (int i = 0; i< p1.getListaAcoes().size()-1; i++) {
			for(int j = 0; j< p2.getListaDefesa().size()-1; j++) {
				if(p1.getListaAcoes().get(i)> p2.getListaDefesa().get(j)) {
					atribuirPontuacaoP1(p1, p2, o, n,c, m, t, cp, i, j);
					//p1.setPontuacao(p1.getPontuacao()+1);
				}else if(p1.getListaAcoes().get(i)< p2.getListaDefesa().get(j)) {
					atribuirPontuacaoP2(p1, p2,o, n,c, m, t, cp, i, j);
					//p2.setPontuacao(p2.getPontuacao()+1);
				}
			}
		}
		for (int i = 0; i< p2.getListaAcoes().size()-1; i++) {
			for(int j = 0; j< p1.getListaDefesa().size()-1; j++) {
				if(p2.getListaAcoes().get(i)> p1.getListaDefesa().get(j)) {
					atribuirPontuacaoP2(p1, p2, o, n,c, m, t, cp, i, j);
					//p2.setPontuacao(p2.getPontuacao()+1);
				}else if(p2.getListaAcoes().get(i)< p1.getListaDefesa().get(j)) {
					atribuirPontuacaoP1(p1, p2, o, n,c, m, t, cp, i, j);
					//p1.setPontuacao(p1.getPontuacao()+1);
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

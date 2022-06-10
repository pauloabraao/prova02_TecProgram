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
			if(p1.getListaAcoes().get(i).equals(4)) {
				o.setPontuacao(o.getPontuacao()+(2*p1.getListaAcoes().get(i)- p2.getListaDefesa().get(j)));
			}else {
				o.setPontuacao(o.getPontuacao()+(p1.getListaAcoes().get(i)- p2.getListaDefesa().get(j)));
			}	
		}
		if(p1.getTipo().equals(NEO)) {
			if(p1.getListaAcoes().get(i).equals(6)) {
				n.setPontuacao(n.getPontuacao()+(2*p1.getListaAcoes().get(i)- p2.getListaDefesa().get(j)));
			}else {
				n.setPontuacao(n.getPontuacao()+(p1.getListaAcoes().get(i)- p2.getListaDefesa().get(j)));
			}	
		}
		if(p1.getTipo().equals(CAF)) {
			if(p1.getListaAcoes().get(i).equals(5)) {
				c.setPontuacao(c.getPontuacao()+(2*p1.getListaAcoes().get(i)- p2.getListaDefesa().get(j)));
			}else {
				c.setPontuacao(c.getPontuacao()+(p1.getListaAcoes().get(i)- p2.getListaDefesa().get(j)));
			}
		} 
		if(p1.getTipo().equals(MOR)) {
			if(p1.getListaAcoes().get(i).equals(7)) {
				m.setPontuacao(m.getPontuacao()+(2*p1.getListaAcoes().get(i)- p2.getListaDefesa().get(j)));
			}else {
				m.setPontuacao(m.getPontuacao()+(p1.getListaAcoes().get(i)- p2.getListaDefesa().get(j)));
			}
		}
		if(p1.getTipo().equals(TRI)) {
			if(p1.getListaAcoes().get(i).equals(3)) {
				t.setPontuacao(t.getPontuacao()+(2*p1.getListaAcoes().get(i)- p2.getListaDefesa().get(j)));
			}else {
				t.setPontuacao(t.getPontuacao()+(p1.getListaAcoes().get(i)- p2.getListaDefesa().get(j)));
			}		
		} 
		if(p1.getTipo().equals(COP)) {
			if(p1.getListaAcoes().get(i).equals(2)) {
				cp.setPontuacao(cp.getPontuacao()+(2*p1.getListaAcoes().get(i)- p2.getListaDefesa().get(j)));
			}else {
				cp.setPontuacao(cp.getPontuacao()+(p1.getListaAcoes().get(i)- p2.getListaDefesa().get(j)));
			}
			
		}	
	}
	public void atribuirPontuacaoP2(Personagem p1, Personagem p2, Personagem o, Personagem n,
			Personagem c, Personagem m, Personagem t, Personagem cp, int i, int j) {
		
		if(p2.getTipo().equals(ORC)) {
			if(p2.getListaAcoes().get(i).equals(4)) {
				o.setPontuacao(o.getPontuacao()+(2*p2.getListaAcoes().get(i)- p1.getListaDefesa().get(j)));
			}else {
				o.setPontuacao(o.getPontuacao()+(p2.getListaAcoes().get(i)- p1.getListaDefesa().get(j)));
			}
		}if(p2.getTipo().equals(NEO)) {
			if(p2.getListaAcoes().get(i).equals(6)) {
				n.setPontuacao(n.getPontuacao()+(2*p2.getListaAcoes().get(i)- p1.getListaDefesa().get(j)));
			}else {
				n.setPontuacao(n.getPontuacao()+(p2.getListaAcoes().get(i)- p1.getListaDefesa().get(j)));
			}
		} if(p2.getTipo().equals(CAF)) {
			if(p2.getListaAcoes().get(i).equals(5)) {
				c.setPontuacao(c.getPontuacao()+(2*p2.getListaAcoes().get(i)- p1.getListaDefesa().get(j)));
			}else {
				c.setPontuacao(c.getPontuacao()+(p2.getListaAcoes().get(i)- p1.getListaDefesa().get(j)));
			}
		} if(p2.getTipo().equals(MOR)) {
			if(p2.getListaAcoes().get(i).equals(7)) {
				m.setPontuacao(m.getPontuacao()+(2*p2.getListaAcoes().get(i)- p1.getListaDefesa().get(j)));
			}else {
				m.setPontuacao(m.getPontuacao()+(p2.getListaAcoes().get(i)- p1.getListaDefesa().get(j)));
			}
		}if(p2.getTipo().equals(TRI)) {
			if(p2.getListaAcoes().get(i).equals(3)) {
				t.setPontuacao(t.getPontuacao()+(2*p2.getListaAcoes().get(i)- p1.getListaDefesa().get(j)));
			}else {
				t.setPontuacao(t.getPontuacao()+(p2.getListaAcoes().get(i)- p1.getListaDefesa().get(j)));
			}
		}if(p2.getTipo().equals(COP)) {
			if(p2.getListaAcoes().get(i).equals(2)) {
				cp.setPontuacao(cp.getPontuacao()+(2*p2.getListaAcoes().get(i)- p1.getListaDefesa().get(j)));
			}else {
				cp.setPontuacao(cp.getPontuacao()+(p2.getListaAcoes().get(i)- p1.getListaDefesa().get(j)));
			}
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
		
		
	}
	
	
}

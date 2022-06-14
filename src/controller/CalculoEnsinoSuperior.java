package controller;

import model.Candidato;

public class CalculoEnsinoSuperior implements ICandidatoPontos{

	@Override
	public int calculaPontos(Candidato c) {
		if(c.isEnsinoSuperiorCompleto()) {
			c.setPontosProva(c.getPontosProva() + 10);
		}
		return c.getPontosProva();
	}

	@Override
	public void proximoCalculo(Candidato c) {
		c.setPontosProva(calculaPontos(c));
		
		CalculoRegistroEntidade calculo = new CalculoRegistroEntidade();
		
		calculo.proximoCalculo(c);
		
		
	}

}

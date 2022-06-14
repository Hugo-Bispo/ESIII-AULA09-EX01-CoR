package controller;

import model.Candidato;

public class CalculoRegistroEntidade implements ICandidatoPontos {

	@Override
	public int calculaPontos(Candidato c) {
		if (c.getAnosRegistroEntidadeClasse() > 0) {
			c.setPontosProva(c.getPontosProva() + c.getAnosRegistroEntidadeClasse());
		}
		return c.getPontosProva();
	}

	@Override
	public void proximoCalculo(Candidato c) {
		c.setPontosProva(calculaPontos(c));
		
		CalculoAnosExperiencia calculo = new CalculoAnosExperiencia();
		calculo.proximoCalculo(c);	
	}

}

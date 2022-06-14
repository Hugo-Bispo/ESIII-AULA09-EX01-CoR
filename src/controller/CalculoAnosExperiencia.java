package controller;

import model.Candidato;

public class CalculoAnosExperiencia implements ICandidatoPontos {

	@Override
	public int calculaPontos(Candidato c) {
		if (c.getAnosExperiencia() > 0) {
			c.setPontosProva(c.getPontosProva() + (c.getAnosExperiencia() * 2));
		}
		return c.getPontosProva();
	}

	@Override
	public void proximoCalculo(Candidato c) {
		c.setPontosProva(calculaPontos(c));

	}

}

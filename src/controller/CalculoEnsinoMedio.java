package controller;

import model.Candidato;

public class CalculoEnsinoMedio implements ICandidatoPontos {

	@Override
	public int calculaPontos(Candidato c) {
		if(c.isEnsinoMedioPublico()) {
			c.setPontosProva(c.getPontosProva() + 5);
		}
		return c.getPontosProva();
	}

	@Override
	public void proximoCalculo(Candidato c) {
		c.setPontosProva(calculaPontos(c));
		
		CalculoEnsinoSuperior calculo = new CalculoEnsinoSuperior();
		calculo.proximoCalculo(c);		
	}

}

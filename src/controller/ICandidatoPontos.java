package controller;

import model.Candidato;

public interface ICandidatoPontos {
	public int calculaPontos(Candidato c);
	public void proximoCalculo(Candidato c);
}

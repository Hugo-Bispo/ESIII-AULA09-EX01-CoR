package view;

import controller.CalculoEnsinoMedio;
import controller.CalculoEnsinoSuperior;
import model.Candidato;

public class Principal {
	public static void main(String[] args) {
		Candidato c = new Candidato();
		c.setId(1);
		c.setNome("Hugo");
		c.setEnsinoMedioPublico(true);
		c.setEnsinoSuperiorCompleto(true);
		c.setAnosRegistroEntidadeClasse(10);
		c.setAnosExperiencia(5);
		c.setPontosProva(50);
		
		CalculoEnsinoMedio pontosCalculo = new CalculoEnsinoMedio();
		pontosCalculo.proximoCalculo(c);
		
		System.out.println(c.toString());
	}
	
}

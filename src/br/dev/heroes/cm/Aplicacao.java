package br.dev.heroes.cm;

import br.dev.heroes.cm.modelo.Tabuleiro;
import br.dev.heroes.cm.visao.TabuleiroConsole;

public class Aplicacao {
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);
		

	}
}

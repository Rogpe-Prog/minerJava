package br.dev.heroes.cm.visao;

import java.util.Scanner;

import br.dev.heroes.cm.excecao.ExplosaoException;
import br.dev.heroes.cm.excecao.SairException;
import br.dev.heroes.cm.modelo.Tabuleiro;

public class TabuleiroConsole {

	private Tabuleiro tabuleiro;
	private Scanner entrada = new Scanner(System.in);
	
	public TabuleiroConsole(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		
		executarJogo();
	}
	
	private void executarJogo() {
		try {
			boolean continuar = true;
			
			while(continuar) {
				cicloDoJogo();
				
				System.out.println("Outra partida? (S/n)");
				String resposta = entrada.nextLine();
				
				if("n".equalsIgnoreCase(resposta)) {
					continuar = false;
				} else {
					tabuleiro.reiniciar(); 
				}
				
			}
		} catch (Exception e) {
			System.out.println("Tchau!!!");
		} finally {
			entrada.close();
		} 
	}
 
	private void cicloDoJogo() {
		try {
			
			while(!tabuleiro.objetivoAlcancado()) {
				System.out.println(tabuleiro.toString());
				
				String digitado = capturarValorDigitado("Digite (x,y): ");
			}
			
			System.out.println("Você ganhou!!!");
		} catch (ExplosaoException e) {
			System.out.println("Voce perdeu!");
		}
		
	}
	
	private String capturarValorDigitado(String texto) {
		System.out.println(texto);
		String digitado = entrada.nextLine();
		
		if("sair".equalsIgnoreCase(digitado)) {
			System.out.println("Lançou exception");
		}
		return digitado;
	}
	
	
}

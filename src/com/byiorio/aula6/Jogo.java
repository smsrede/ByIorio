package com.byiorio.aula6;

import java.util.Random;
import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		int continua = 0;
		int numero = 0;
		int contador = 0;
		
		Random numeroRandomico = new Random();
		Scanner teclado = new Scanner(System.in);
		numero = numeroRandomico.nextInt(10) + 1;
		
		
		do {
			System.out.print("Advinhe o Numero: ");
			continua = Integer.valueOf(teclado.next());
			if (continua > numero){
				System.out.println("Numero digitado é maior");
			}
			if (continua < numero){
				System.out.println("Numero digitado é Menor");
			}
			contador =+ 1;
		} while (continua != numero);

		System.out.println("Parabéns, acertou o número " + continua + " em " + contador + " tentativas!!");
		
		//user.close();
		teclado.close();
	}

}

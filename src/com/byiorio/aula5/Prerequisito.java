package com.byiorio.aula5;

import java.util.Random;
import java.util.Scanner;

public class Prerequisito {
	public static void main(String[] args) {
		
		int idade = Integer.valueOf("3");
		double milhas = Double.valueOf("2.5");
		boolean bol = Boolean.valueOf ("true");
		char letra = "testando".charAt(3);
		System.out.println(idade);
		System.out.println(milhas);
		System.out.println(bol);
		System.out.println(letra);
		
		Random numeroRandomico = new Random();
		int numero = numeroRandomico.nextInt(100)+1;
		System.out.println(numero);
		
		Scanner user = new Scanner(System.in);
		System.out.print("Digite ano de nasc: ");
		int anonasc = Integer.valueOf(user.next());
		System.out.print("Digite ano atual: ");
		int anoatual = Integer.valueOf(user.next());
		
		idade = anoatual - anonasc;
		System.out.println("Sua idade é: " + idade);
		user.close();
		
	}

}

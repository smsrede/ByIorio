package com.byiorio.aula3;

public class Idade {
	public static void main(String[] args) {
		int anoNasc = 2002;
		int anoAtual = 2017;
		
		int idade = anoAtual - anoNasc;
		
		if (idade < 18 && idade >= 16){
			System.out.println("idade permitida com os pais");
		}else if (idade < 16){
			System.out.println("idade n�o permitida");
		}else{
			System.out.println("Idade permitida");			
		}
		
		System.out.println("Sua idade �: " + idade + " anos");			

	}
}

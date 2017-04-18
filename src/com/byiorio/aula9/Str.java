package com.byiorio.aula9;

public class Str {
	public static void main(String[] args) {
		//cabe de tudo no String at� frases, numero, acento
		//char primitivo apenas 1 caracter
		//� uma classe, (tem que instanciar para existir)
		//�nsatnciar � dar o NEW, gerar todo objeto na
		//mem�ria atribuindo-o � vari�vel
		//Ela � especial e uma das �nicas que
		//podem ser usadas sem a presen�a do NEW
		//contudo em alguns cassos o NEW � importante
		//para convers�o
		//formato americano, portugues...maiores problemas
		String teste = new String();
		String teste2 = "Teste do TESTE das testE";
		String teste3 = "teste";
		String teste4 = null;
		String teste5 = "1";
		System.out.println(teste2);
		//teste.
		
		System.out.println(teste2.charAt(6));
		//charAT = Extrair uma letra da frase ou valor da string
		//repare que ele pulou o branco e paegou o proximo

		System.out.println(teste2.contains("das"));
		//contains = Retorna verdadeiro ou falso, Se contem a sequencia de caracateres em quest�o
		//� case sensitive
		System.out.println(teste.contentEquals("DAS"));
		
		//ToUpper / ToLower - imprime tudo em maiusculo ou minusculo
		System.out.println(teste2.toUpperCase());
		System.out.println(teste2.toLowerCase());
		
		//podemos usar mais que um m�todo JUNTOS
		System.out.println(teste2.toUpperCase().contains("DAS"));
		//repare que agora � true pois antes de perguntar se
		//contem usamos o metodo que aumentou a letra
		//assim, a partir da perunta ja existia, saco?
		//al�m disso repare que consegui concatenar
		//pelo fato de que o RETORNO SER String (uma "classe")
		//assim tenho tudo acess�vel do relativo ao String
		//outra vez...
		
		//OBS: CONTRL + SHIFT + X OU + Y - MUDA PARA MAIUSC OU MINUSC
		//a �ltima palavra escrita  quando apertamos
		//ponto para acessar os metodos de uma classe
		//� o nome DA CLASSE a qual o metodo se encontra
		//o penultim item � O TIPO DE RETORNO
		//repare sempre no parametro que
		//precisa ser passado
		
		//endsWith();
		System.out.println(teste2.endsWith("e"));
		//para pesquisar fim de arquivo ou lote
		//ou algo espec�fico que est� esperando
		
		//starsWith();
		//para pesquisar come�o de arquivo ou lote
		System.out.println(teste2.startsWith("a"));
		
		//trim -  remove os espa�os antes e depois da string
		//----- SEM ALTERAR O VALOR ORGINAL NO CODIGO ----
		//apenas exibe a saida nova diferente
		//altera a saida!
		//posso jogar o valor alterado para uma variavel
		//nova ou ela mesma
		System.out.println(teste2);
		System.out.println(teste2.endsWith("e"));
		System.out.println(teste2.trim());
		System.out.println(teste2.trim().toUpperCase().endsWith("E"));
		//repare mais uma vez que todos os metodos
		//que retornam String me permitem usar tudo que
		//ha dentro da classe e inclusive concatenar
		
		//equals - pergunta se o conte�do � igual em OBJETOS
		//repare o parametro - OBJETOS!!
		//o nome de vari�vel que vc cria tb �
		//um objeto utiliz�vel
		int a=1;
		System.out.println(teste2.equals(teste3));
		System.out.println(teste5.equals(a));
		//para a linha acima ser verdadeira
		//precisar�amos converter
		System.out.println(teste5.equals(String.valueOf(a)));
//		int idade = Integer.valueOf("3");
//		double milhas = Double.valueOf("2.5");
//		boolean bol = Boolean.valueOf ("true");
//		char letra = "testando".charAt(3);
		System.out.println(teste2.equalsIgnoreCase("TESTE do TESTE das teste"));
		
		//esse 4 esta null
		//a dica sobre ERRO DE NULL POINTER
		//carregue a vari�vel 
		//valida PRIMEIRO, na frente
		//variavel equals variNull
		//pois null n�o tem metodo 
		//nehum carregado, esta vazio, null
//		if (teste4.equals ("Teste do TESTE das testE")){
//			
//			
//		}
		//Exemplo:
		String b="";
		if ("".equals(teste4)){
			
			
		}
		//INDEX OF
		//retorna o indice da onde encontra-se a string
		//("teste do TESTE das teste")
		System.out.println(teste2.indexOf("TESTE"));	
		//retorna � partir da posi��o
		System.out.println(teste2.indexOf("TESTE", 1));
		//posso usar um looping
		//para saber quantas ocorrencias
		//guardando e exibindo a posi��o encontrada		
		
		//Esta vazia ou em branc, nula??
		System.out.println(teste2.isEmpty());
		//temanho total
		System.out.println(teste2.length());
		//poderia usar o FOR 
		//passando tamho da STRING
		
		//REPLACE ALL
		//n�o altera valor original
		//retorna altera��o
		//ent�o teria que receber
		//em outra variavel
		//ou chamar direto na saida
		//teste2.replaceAll("TESTE", "SAMUCAO");
		System.out.println(teste2.replaceAll("TESTE", "SAMUCAO"));
		//o primeiro parametro � uma
		//EXPRESS�O REGULAR
		//repare que ele subsitui
		//por cada ocorrencia
		//� case sensitive
		System.out.println(teste2.replaceAll("T", "222"));
		//"Teste do TESTE das testE"
		//encontre e mude tudo entre um valor e outro
		System.out.println(teste2.replaceAll("[Teste-testE]", "222"));
		
		//SUB STRING
		//corta a string e retorna um sub valor
		//N�O ELTERA ORIGNAL
		//SO SE PASSAR P VARIAVEL
		System.out.println(teste2.substring(9));
		//poderia querer retornar num ponto
		//onde n�o sei o index
		//use o indexOF outra vez
		//"Teste do TESTE das testE"
		System.out.println(teste2.substring(teste2.indexOf("TESTE")));
		//repare que o peda�o da string
		//retorna metodos
		//ex. se eu quisesse excluir o TESTE
		//"Teste do TESTE das testE"
		System.out.println(teste2.substring(teste2.indexOf("TESTE")+ "TESTE".length()));
		
		//se eu quisesse descartar os esp�os
		System.out.println(teste2.substring(teste2.indexOf("TESTE")+ "TESTE".length()).trim());
		
		//obter um intervalo
		System.out.println(teste2.substring(10,12));
		
		//Quando tem demanda para 
		//absorver arquivos separados
		//por algum delmitador
		
		//"Teste do TESTE das testE"
		String teste8 = "Teste do; TESTE; das testE";
		String[] lista = teste8.split(";");
		if (lista.length >=1){
			System.out.println(lista[0]);
	}
		//SBRE o MAIN String args
		//passando paramtros
		//e trabalhando
		//Run configuration
		if(args.length >=1){
			if("H".equalsIgnoreCase(args[0])){
				System.out.println("homem");
			}
		// No DOS seria: java -jar mainparam.jar H
			//depois de exportar
		}
		
		
		
	}  
}

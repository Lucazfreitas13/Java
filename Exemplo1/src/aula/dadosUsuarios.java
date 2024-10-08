package aula;

import java.util.Scanner;

public class dadosUsuarios {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		// Variaveis
		int idade = 0;
		String profissao = "";
		System.out.println("Informe sua idade: ");
		idade = ler.nextInt();
		System.out.println("Informe sua profissão: ");
		profissao = ler.next();
		System.out.println("Sua idade é:" + idade + " e sua profissão é:" + profissao);
		System.out.println("Obrigado por utilizar meu programa =) By: Lucas Freitas");
		
		

	}

}

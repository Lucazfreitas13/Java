package aula;

import java.util.Scanner;

public class media {

	public static void main(String[] args) {
		// variavel
		float n1=0;
		float n2=0;
		float media=0;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		n1 = ler.nextFloat();
		System.out.println("Digite o segundo número: ");
		n2 = ler.nextFloat();
		media = (n1+n2)/2;
		System.out.println(media);
		System.out.println("Obrigado por utilizar meu programa =) By: Lucas Freitas");

	}

}

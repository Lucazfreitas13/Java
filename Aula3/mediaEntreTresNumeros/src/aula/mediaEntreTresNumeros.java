package aula;
import java.util.Scanner;
public class mediaEntreTresNumeros {

	public static void main(String[] args) {
	Scanner ler=new Scanner(System.in);
	float n1 = 0;
	float n2 = 0;
	float n3 = 0;
	float media = 0; 
	System.out.println("Digite o 1º número: ");
	n1 = ler.nextFloat();
	System.out.println("Digite o 2º número: ");
	n2 = ler.nextFloat();
	System.out.println("Digite o 3º número: ");
	n3 = ler.nextFloat();
	media = (n1+n2+n3)/3;
	System.out.println("A média é: "+media);
	System.out.println("Obrigado por utilizar meu programa =) By: Lucas Freitas");
	}

}

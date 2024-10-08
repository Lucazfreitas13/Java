package aula;
import java.util.Scanner;
public class descontoMetodos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double precoOriginal = 0;
		System.out.println("Informe o preço do produto: R$ ");
		precoOriginal=leia.nextFloat();
		desconto(precoOriginal);
		

	}
	public static void desconto(double precoFinal) {
		double descontoFinal=precoFinal-(precoFinal * 0.10);
		System.out.println("O novo valor do produto é R$" + descontoFinal);
		
	}

}

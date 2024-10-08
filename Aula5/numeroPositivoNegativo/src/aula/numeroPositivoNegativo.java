package aula;
import java.util.Scanner;
public class numeroPositivoNegativo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero = 0;
		System.out.println("Informe o número a ser verificado: ");
		numero = ler.nextInt();
		if (numero >= 0) {
			System.out.println("O " + numero + " é um número positivo!");
		} else {
			System.out.println("O " + numero + " é um número negativo!");
		}
}
}
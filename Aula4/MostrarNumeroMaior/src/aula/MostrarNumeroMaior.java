package aula;
import java.util.Scanner;
public class MostrarNumeroMaior {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int n1 = 0,n2 = 0;
	System.out.println("Informe o primeiro número: ");
	n1 = ler.nextInt();
	System.out.println("Informe o segundo número: ");
	n2 = ler.nextInt();
	if (n1 > n2) {
		System.out.println("O maior número é " + n1 + "!");
	}
	if (n2>n1) {
		System.out.println("O maior número é " + n2 + "!");
	}
	}
}
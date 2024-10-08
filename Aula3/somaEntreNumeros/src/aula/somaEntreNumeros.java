package aula;
import java.util.Scanner;
public class somaEntreNumeros {

	public static void main(String[] args) {
	int n1 = 0, n2 = 0;
	Scanner ler = new Scanner(System.in);
	System.out.println("Informe o 1º número: ");
	n1 = ler.nextInt();
	System.out.println("Informe o 2º número: ");
	n2 = ler.nextInt();
	System.out.println("A soma entre " + n1 + " e " + n2 + " é " + (n1 + n2));
	System.out.println("Obrigado por utilizar meu programa =). By Lucas Freitas");
	}

}

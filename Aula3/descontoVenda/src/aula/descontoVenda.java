package aula;
import java.util.Scanner;
public class descontoVenda {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	double valor = 0, valorFinal = 0;
	System.out.println("Informe o valor original do produto: R$ ");
	valor = ler.nextDouble();
	valorFinal = valor - (valor*0.10);
	System.out.println("Valor com desconto: R$ " + valorFinal);
	System.out.println("Obrigado por utilizar meu programa =). By Lucas de Freitas");
	}

}

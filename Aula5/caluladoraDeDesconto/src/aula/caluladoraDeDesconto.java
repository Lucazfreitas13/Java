package aula;
import java.util.Scanner;
public class caluladoraDeDesconto {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double valorCompra, valorComDesconto, desconto;
		int perceDesconto;
		System.out.println("Informe o valor final da compra: ");
		valorCompra=ler.nextFloat();
		if(valorCompra>300) {
			valorComDesconto = valorCompra-(valorCompra * 0.10);
			System.out.println("Valor original = " + valorCompra + "\n" + "Valor com Desconto = " + valorComDesconto);
		}else {
			System.out.println("Valor Final = " + valorCompra);
		}

	}

}

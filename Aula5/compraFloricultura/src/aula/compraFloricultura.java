package aula;
import java.util.Scanner;
public class compraFloricultura {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int qntidade=0;
		float valorCompra=0;
		System.out.println("Informe a quantidade de rosas compradas: ");
		qntidade = ler.nextInt();
		if (qntidade >=12) {
			valorCompra=qntidade*3;
		} else {
			valorCompra=qntidade*5;
		}
		System.out.println("Valor da compra = R$ " + valorCompra);
	}

}

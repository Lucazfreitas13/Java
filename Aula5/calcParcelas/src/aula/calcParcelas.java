package aula;
import java.util.Scanner;
public class calcParcelas {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		float valorDaCompra=0,valorParcelas=0;
		int qntParcelas=0;
		System.out.println("Informe o valor da compra: R$");
		valorDaCompra=ler.nextFloat();
		if(valorDaCompra >=500) {
			valorParcelas = valorDaCompra/10;
			qntParcelas = 10;
		} else {
			valorParcelas = valorDaCompra/5;
			qntParcelas=5;
		}
		System.out.println("Valor da compra: R$ " + valorDaCompra + "\n" + "Valor das parcelas = R$" + valorParcelas +"\n"+ "Quantidade Parcelas = " + qntParcelas);
	}
}
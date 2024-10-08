package atividades;
import java.util.Scanner;
public class creditoEspecial {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double saldo = 0, credito = 0;
		System.out.println("Digite o saldo médio do cliente: R$ ");
		saldo = ler.nextFloat();
		if(saldo > 400) {
			credito = saldo * 0.30;
		}
		else if(saldo <= 400 && saldo > 300) {
			credito = saldo * 0.25;	
		}
		else if(saldo <= 300 && saldo > 200) {
			credito=saldo*0.20;
		} else {
			credito=saldo*0.10;
		}
		System.out.println("O seu saldo médio é R$ " +saldo+" e o valor do crédito especial é R$ "+credito);
	}
}

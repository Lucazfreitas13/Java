package aula;
import java.util.Scanner;
public class calculoIdade {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int anoNasc=0,anoAtual=0,idade=0;
		System.out.println("Informe o ano de nascimento: ");
		anoNasc=leia.nextInt();
		System.out.println("Informe o ano atual: ");
		anoAtual=leia.nextInt();
		idade=calculoAnos(anoNasc,anoAtual);
		System.out.println("Sua idade é: " + idade);
		System.out.println("Quantidade de meses de vida: " + calculoMeses(idade));
		System.out.println("Quantidade de dias de vida: " + calculoDias(idade));
		System.out.println("Quantidade de semanas de vida: " + calculoSemanas(idade));

	}
	public static int calculoAnos(int anoNasc, int anoAtual) {
		return anoAtual-anoNasc;
	}
	public static int calculoMeses(int idade) {
		return idade * 12;
	
	}
	public static int calculoDias(int idade) {
		return idade *365;
		
	}
	public static int calculoSemanas(int idade) {
		return idade * 52;
	}
}

package aula;
import java.util.Scanner;
public class metodoRetorno {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int valor=0,resultado=0;
		System.out.println("Informe um número: ");
		valor=leia.nextInt();
		resultado=calculo(valor);
		exibirResultado(resultado);

	}
	public static int calculo (int numero) {
		return numero * 2;
	}
	public static void exibirResultado(int resultado) {
		System.out.println(resultado);
	}
}

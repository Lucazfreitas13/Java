package Aula;
import java.util.Scanner;
public class solicitarNumero {

	public static void main(String[] args) {
	 //Algoritmo Principal
	Scanner leia = new Scanner(System.in);
	int n1=0, n2=0;
	System.out.println("Informe o primeiro número: ");
	n1=leia.nextInt();
	System.out.println("Informe o segundo número: ");
	n2=leia.nextInt();
	subtrairNumeros(n1,n2);
	mensagem();
	}
	//Segundo algortimo (novo metodo) - Metodo com parâmetros
	public static void subtrairNumeros( int x, int y) {
		System.out.println(x-y);
	}
	//Metodo sem parâmetros
	public static void mensagem() {
		System.out.println("Boa noite!");
	}
}

package aula;
import java.util.Scanner;
public class ordemCrescenteDoisNumeros {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int n1 = 0,n2 = 0,aux=0;
	System.out.println("Informe o primeiro número: ");
	n1 = ler.nextInt();
	System.out.println("Informe o segundo número: ");
	n2 = ler.nextInt();
	if (n1 > n2) {
		aux=n1;
		n1=n2;
		n2=aux;
	}
	System.out.println(n1+","+n2);
	}
}
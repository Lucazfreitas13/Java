package aula;
import java.util.Scanner;
public class areaRetangulo {

	public static void main(String[] args) {
	float largura = 0, altura=0, area = 0;
	Scanner ler = new Scanner(System.in);
	System.out.println("Informe a largura do retângulo: ");
	largura = ler.nextFloat();
	System.out.println("Informe a altura do retângulo: ");
	altura = ler.nextFloat();
	area = largura * altura;
	System.out.println("A área do retângulo é: " + area);
	System.out.println("Obrigado por utilizar meu programa =). By Lucas Freitas");

	}

}

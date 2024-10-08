package aula;
import java.util.Scanner;
public class CalculoMedia {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float mb1 = 0,mb2 = 0, media = 0;
		System.out.println("Digite a primeira nota: ");
		mb1 = leia.nextFloat();
		System.out.println("Digite a segunda nota: ");
		mb2 = leia.nextFloat();
		media=(mb1+mb2)/2;
		if (media > 7) {
				System.out.println("Você tirou a média de " + media + ". Aprovado!");
		}else {
				System.out.println("Você tirou a média de " + media + ". Reprovado!");
		}
	}
}

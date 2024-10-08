package atividades;
import java.util.Scanner;
public class mediaNotas {

	public static void main(String[] args) {
	Scanner ler= new Scanner(System.in);
	float nota1=0, nota2=0;
	double media=0;
	System.out.println("Informe a 1º nota: ");
	nota1=ler.nextFloat();
	System.out.println("Informe a 2º nota: ");
	nota2=ler.nextFloat();
	media=(nota1+nota2)/2;
	if(media > 7) {
		System.out.println("Aprovado! Sua nota final foi: " + media);
			
	}
	if (media>4) {
		System.out.println("Você realizará o exame, sua nota final foi: " + media);
	} else {
		System.out.println("Reprovado! Sua nota final foi: " + media);
	}
	}

}

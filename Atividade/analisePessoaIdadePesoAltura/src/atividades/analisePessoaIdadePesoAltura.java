package atividades;
import java.util.Scanner;
public class analisePessoaIdadePesoAltura {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int idade=0, peso=0, pessoaMais50=0, pessoa10e20=0, pessoaMenos40=0;
	float altura=0, somaAlturas=0, mediaAltura=0;

	for  (int i = 1;i<=25;i++) {
		System.out.println("Digite a idade da pessoa: " + i);
		idade = ler.nextInt();
		System.out.println("Digite a altura da pessoa: " + i);
		altura = ler.nextFloat();
		System.out.println("Digite o peso da pessoa: " + i);
		peso = ler.nextInt();
		if (idade>50) {
			pessoaMais50=pessoaMais50+1;
		}
		else if(idade >=10 && idade <=20) {
			pessoa10e20=pessoa10e20+1;
			somaAlturas= somaAlturas + altura;
		}
		if (peso<40) {
			pessoaMenos40=pessoaMenos40+1;
		}	
	}
	if (pessoa10e20>0) {
		mediaAltura = somaAlturas/ pessoa10e20;
	} else {
		mediaAltura=0;	
	}
	double porcentagemMenos40 = (pessoaMenos40*100)/25;
	
	System.out.println("A quantidade de pessoas com idade superior a 50 anos: " + pessoaMais50);
	System.out.println("A média das alturas das pessoas com idade entre 10 e 20 anos: " + mediaAltura);
	System.out.println("A percentagem de pessoas com peso inferior a 40 quilos entre todas as pessoas analisadas: " + porcentagemMenos40 + "%" );
	}

}

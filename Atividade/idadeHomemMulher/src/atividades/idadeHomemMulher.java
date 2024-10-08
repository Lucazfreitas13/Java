package atividades;
import java.util.Scanner;
public class idadeHomemMulher {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int homem1=0, homem2=0, mulher1=0, mulher2=0, homemVelho=0, homemNovo=0, mulherVelha=0, mulherNova=0, somaIdades=0, produtoIdades=0;
		System.out.println("Digite a idade do 1º homem: ");
		homem1= ler.nextInt();
		System.out.println("Digite a idade do 2° homem: ");
		homem2= ler.nextInt();
		System.out.println("Digite a idade da 1º mulher: ");
		mulher1= ler.nextInt();
		System.out.println("Digite a idade da 2º mulher: ");
		mulher2= ler.nextInt();
		if (homem1 > homem2) {
			homemVelho = homem1;
			homemNovo = homem2;		
		} else{
			homemVelho = homem2;
			homemNovo = homem1;
		}
		if(mulher1 > mulher2) {
			mulherVelha = mulher1;
			mulherNova =  mulher2;
		} else {
			mulherVelha = mulher2;
			mulherNova =  mulher1;
		}
		somaIdades = homemVelho + mulherNova;
		produtoIdades = homemNovo * mulherVelha;
		
		System.out.println("Idade do homem mais velho:  " + homemVelho + " Idade da mulher mais nova: " + mulherNova + " Totalizam: " + somaIdades);
		System.out.println("Idade do homem mais novo:  " + homemNovo + " Idade da mulher mais velha: " + mulherVelha + " O produto é: " + produtoIdades);
	}

}

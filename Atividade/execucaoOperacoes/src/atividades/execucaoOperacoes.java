package atividades;
import java.util.Scanner;
public class execucaoOperacoes {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		float resposta=0;
		float num1=0, num2=0, media=0, diferenca=0, produto=0, divisao=0; 
		System.out.println("Digite o primeiro numero: ");
		num1=ler.nextFloat();
		System.out.println("Digite o segundo numero: ");
		num2=ler.nextFloat();
		System.out.println("Informe a operação desejada: 1- Média, 2-Diferença, 3-Produto, 4- Divisão");
		resposta = ler.nextFloat();
		if(resposta==1) {
			media=(num1+num2)/2;
			System.out.println("A média entre os numeros é: " +media );
			
		}
		else if(resposta==2) {
			diferenca=(num1-num2);
			System.out.println("A diferença entre os numeros é: " +diferenca );
			
		}
		else if(resposta==3) {
			produto=(num1*num2);
			System.out.println("O produto entre os numeros é: " +produto );
			
		}
		else if(resposta==4) {
			divisao=(num1/num2);
			System.out.println("A divisão entre os numeros é: " +divisao );
			
		}else {
			System.out.println("Opção digitada inválida!");
		}
		

		
	
			
	

	}
	}


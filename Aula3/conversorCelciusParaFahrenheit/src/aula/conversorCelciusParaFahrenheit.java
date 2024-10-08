package aula;
import java.util.Scanner;
public class conversorCelciusParaFahrenheit {

	public static void main(String[] args) {
	float celcius= 0;
	float fahrenheit = 0;
	Scanner ler = new Scanner(System.in);
	System.out.println("Digite a temperatura em ºC a ser convertida: ");
	celcius = ler.nextFloat();
	fahrenheit = (celcius * 9/5)+32;
	System.out.println("A conversão de " + celcius + "ºC para Fahrenheit é " + fahrenheit + "ºF");
	System.out.println("Obrigado por utilizar meu programa =) By: Lucas de Freitas");
	}

}

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		System.out.println("Programa Calculadora");
		Scanner leitor = new Scanner(System.in);
		int valor1, valor2;
		int soma, subtracao, multiplicacao; 
		double divisao;
		
		System.out.println("Por favor, digite o primeiro valor");
		valor1 = leitor.nextInt();
		System.out.println("Por favor, digite o segundo valor");
		valor2 = leitor.nextInt();
		
		soma = valor1 + valor2;
		subtracao = valor1 - valor2;
		multiplicacao = valor1 * valor2;
		divisao = valor1 / (double)valor2;
		System.out.println("A soma dos valores � " + soma);
		System.out.println("S subtra��o dos valores � " + subtracao);
		System.out.println("A multiplicacao dos valores � " + multiplicacao);
		System.out.println("A divisao dos valores � " + divisao);
		
		leitor.close();
	}

}

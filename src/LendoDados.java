import java.util.Scanner;

public class LendoDados {

	public static void main(String[] args) {
		// As duas linhas abaixo exibem mensgens na tela
		System.out.println("Programa Educado");
		System.out.println("Por favor, digite o seu nome: ");
		//Para ler dados a linha a baixo cria um Scanner
		Scanner leitor = new Scanner(System.in);
		//Para guardar dados de texto, a linha abaixo cria uma variável
		String nome;
		// Para ler dados e guardar na variavel, usamos o Scanner criado
		nome = leitor.next();
		// A linha abaixo exibe a mensagem com o conteudo da variavel
		System.out.println("Boa noite, " + nome);
		leitor.close();
	}

}

import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler o input do usuário
        int soma = 0; // Inicializa a variável 'soma' com 0

        while (true) {
            System.out.print("Digite um número (ou um número negativo para encerrar): "); // Pede para o usuário digitar um número
            int numero = scanner.nextInt(); // Lê o número digitado pelo usuário

            if (numero < 0) {
                break; // Encerra o loop se o número for negativo
            }

            soma += numero; // Adiciona o número à soma
        }

        // Exibe o resultado da soma
        System.out.println("A soma dos números digitados é: " + soma);

        scanner.close(); // Fecha o scanner
    }
}

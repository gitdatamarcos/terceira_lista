import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler o input do usuário
        int soma = 0; // Inicializa a variável 'soma' com 0

        // Loop que vai executar 10 vezes para ler os 10 números
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": "); // Pede para o usuário digitar um número
            int numero = scanner.nextInt(); // Lê o número digitado pelo usuário
            soma += numero; // Adiciona o número à soma
        }

        // Exibe o resultado da soma
        System.out.println("A soma dos 10 números é: " + soma);

        scanner.close(); // Fecha o scanner
    }
}
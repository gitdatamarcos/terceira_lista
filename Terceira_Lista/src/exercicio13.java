import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler o input do usuário
        int contEntreZeroECem = 0; // Inicializa a variável 'contEntreZeroECem' com 0

        // Loop que vai executar 20 vezes para ler os números
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o número " + i + ": "); // Pede para o usuário digitar um número
            int numero = scanner.nextInt(); // Lê o número digitado pelo usuário

            // Verifica se o número está entre 0 e 100
            if (numero >= 0 && numero <= 100) {
                contEntreZeroECem++; // Incrementa o contador se o número estiver entre 0 e 100
            }
        }

        // Exibe o número de entradas que estão entre 0 e 100
        System.out.println("O número de valores entre 0 e 100 é: " + contEntreZeroECem);

        scanner.close(); // Fecha o scanner
    }
}

import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler o input do usuário
        int contPares = 0; // Inicializa a variável 'contPares' com 0

        // Loop que vai executar 20 vezes para ler os números
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o número " + i + ": "); // Pede para o usuário digitar um número
            int numero = scanner.nextInt(); // Lê o número digitado pelo usuário

            // Verifica se o número é par
            if (numero % 2 == 0) {
                contPares++; // Incrementa o contador se o número for par
            }
        }

        // Exibe o número de entradas que são pares
        System.out.println("O número de valores pares é: " + contPares);

        scanner.close(); // Fecha o scanner
    }
}

import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class exercicio11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler o input do usuário
        int contMaiorQueOito = 0; // Inicializa a variável 'contMaiorQueOito' com 0

        // Loop que vai executar 20 vezes para ler os números
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o número " + i + ": "); // Pede para o usuário digitar um número
            int numero = scanner.nextInt(); // Lê o número digitado pelo usuário

            // Verifica se o número é maior que 8
            if (numero > 8) {
                contMaiorQueOito++; // Incrementa o contador se o número for maior que 8
            }
        }

        // Exibe o número de entradas maiores que 8
        System.out.println("O número de valores maiores que 8 é: " + contMaiorQueOito);

        scanner.close(); // Fecha o scanner
    }
}

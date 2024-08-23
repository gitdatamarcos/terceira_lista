import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler o input do usuário
        int contMaiorIdade = 0; // Inicializa a variável 'contMaiorIdade' com 0

        // Loop que vai executar 20 vezes para ler as idades
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": "); // Pede para o usuário digitar a idade
            int idade = scanner.nextInt(); // Lê a idade digitada pelo usuário

            // Verifica se a idade é 18 ou maior
            if (idade >= 18) {
                contMaiorIdade++; // Incrementa o contador se a pessoa for maior de idade
            }
        }

        // Exibe o número de pessoas maiores de idade
        System.out.println("O número de pessoas maiores de idade é: " + contMaiorIdade);

        scanner.close(); // Fecha o scanner
    }
}
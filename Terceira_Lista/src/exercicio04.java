import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler o input do usuário

        System.out.print("Digite o seu nome: "); // Pede para o usuário digitar o nome
        String nome = scanner.nextLine(); // Lê o nome digitado e armazena na variável 'nome'

        System.out.print("Digite um número: "); // Pede para o usuário digitar um número
        int n = scanner.nextInt(); // Lê o número digitado e armazena na variável 'n'

        // Loop que vai repetir o nome do usuário 'n' vezes
        for (int i = 0; i < n; i++) {
            System.out.println(nome); // Exibe o nome do usuário
        }

        scanner.close(); // Fecha o scanner
    }
    }



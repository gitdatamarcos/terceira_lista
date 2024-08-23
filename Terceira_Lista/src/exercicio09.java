import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler o input do usuário

        String nomeMaisNovo = ""; // Variável para armazenar o nome da pessoa mais nova
        int idadeMaisNova = Integer.MAX_VALUE; // Inicializa a idade mais nova com o maior valor inteiro possível

        // Loop que vai executar 10 vezes para ler o nome e a idade de 10 pessoas
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o nome da pessoa " + i + ": "); // Pede para o usuário digitar o nome
            String nome = scanner.nextLine(); // Lê o nome digitado pelo usuário

            System.out.print("Digite a idade da pessoa " + i + ": "); // Pede para o usuário digitar a idade
            int idade = scanner.nextInt(); // Lê a idade digitada pelo usuário
            scanner.nextLine(); // Limpa o buffer do scanner após ler a idade

            // Verifica se a idade atual é menor que a idade mais nova registrada
            if (idade < idadeMaisNova) {
                idadeMaisNova = idade; // Atualiza a idade mais nova
                nomeMaisNovo = nome; // Atualiza o nome da pessoa mais nova
            }
        }

        // Exibe o nome da pessoa mais nova
        System.out.println("A pessoa mais nova é: " + nomeMaisNovo);

        scanner.close(); // Fecha o scanner
    }
}
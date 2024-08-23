import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler o input do usuário
        int somaDasIdades = 0; // Inicializa a variável 'somaDasIdades' com 0

        // Loop que vai executar 20 vezes para ler as idades
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": "); // Pede para o usuário digitar a idade
            int idade = scanner.nextInt(); // Lê a idade digitada pelo usuário
            somaDasIdades += idade; // Adiciona a idade à soma das idades
        }

        // Exibe o resultado da soma das idades
        System.out.println("A soma das idades das 20 pessoas é: " + somaDasIdades);

        scanner.close(); // Fecha o scanner
    }
}
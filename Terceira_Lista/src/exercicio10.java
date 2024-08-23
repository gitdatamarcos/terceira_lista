import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class exercicio10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler o input do usuário

        System.out.print("Digite um número: "); // Pede para o usuário digitar um número
        int numero = scanner.nextInt(); // Lê o número digitado pelo usuário

        // Loop para gerar e exibir a tabuada de multiplicação do número
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i; // Calcula o resultado da multiplicação
            System.out.println(numero + " x " + i + " = " + resultado); // Exibe o resultado
        }

        scanner.close(); // Fecha o scanner
    }
}

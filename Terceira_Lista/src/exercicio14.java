import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler o input do usuário

        // Inicializa contadores para os três intervalos
        int contEntreZeroECem = 0;
        int contEntreCemEOitocentos = 0;
        int contAcimaDeDuzentos = 0;

        // Loop que vai executar 20 vezes para ler os números
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o número " + i + ": "); // Pede para o usuário digitar um número
            int numero = scanner.nextInt(); // Lê o número digitado pelo usuário

            // Verifica em qual intervalo o número se encaixa e incrementa o contador correspondente
            if (numero >= 0 && numero <= 100) {
                contEntreZeroECem++;
            } else if (numero >= 101 && numero <= 200) {
                contEntreCemEOitocentos++;
            } else if (numero > 200) {
                contAcimaDeDuzentos++;
            }
        }

        // Exibe os resultados dos contadores
        System.out.println("Número de valores entre 0 e 100: " + contEntreZeroECem);
        System.out.println("Número de valores entre 101 e 200: " + contEntreCemEOitocentos);
        System.out.println("Número de valores maiores que 200: " + contAcimaDeDuzentos);

        scanner.close(); // Fecha o scanner
    }
}

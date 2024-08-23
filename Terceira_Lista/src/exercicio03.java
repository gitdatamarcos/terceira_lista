import javax.sound.midi.Soundbank;
import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class exercicio03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler o input do usuário

        System.out.print("Digite o seu nome: "); // Pede para o usuário digitar o nome

        String nome = scanner.nextLine(); // Lê o nome digitado e armazena na variável 'nome'

        // Loop que vai repetir o nome do usuário 10 vezes nome do usuário 10 vezes
        for (int i = 0; i < 10; i++)
        {
            System.out.println(nome); // Exibe o nome do usuário do usuário
        }

        scanner.close(); // Fecha o scanner

    }
}

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<veiculo> veiculos = new ArrayList<>();  // Lista para armazenar os veículos

        boolean continuar = true;

        while (continuar) {
            // Perguntar ao usuário que tipo de veículo ele deseja inserir
            System.out.println("Deseja inserir um [1] ônibus ou [2] caminhão? (ou digite 0 para sair)");
            int tipo = lerNumero(scanner);

            // Verificar se o usuário deseja sair
            if (tipo == 0) {
                continuar = false;
                break;
            }

            // Consumir a quebra de linha após a leitura do tipo
            scanner.nextLine(); 

            // Solicitar detalhes comuns do veículo
            System.out.print("Informe o modelo: ");
            String modelo = scanner.nextLine();

            System.out.print("Informe o ano: ");
            int ano = lerNumero(scanner); // Chamada do método para ler o ano
            scanner.nextLine(); // Consumir a quebra de linha após ler o ano

            // Diferenciar ônibus de caminhão
            if (tipo == 1) {
                System.out.print("Informe o número de assentos: ");
                int numeroDeAssentos = lerNumero(scanner);
                veiculos.add(new onibus(modelo, ano, numeroDeAssentos));
            } else if (tipo == 2) {
                System.out.print("Informe a capacidade de carga (em toneladas): ");
                double capacidadeDeCarga = lerNumeroDouble(scanner);
                veiculos.add(new caminhao(modelo, ano, capacidadeDeCarga));
            }

            // Perguntar se deseja continuar inserindo veículos
            System.out.println("Deseja inserir mais um veículo? [1] Sim / [2] Não");
            int escolha = lerNumero(scanner);

            if (escolha != 1) {
                continuar = false;
            }
        }

        // Exibir os detalhes dos veículos inseridos
        System.out.println("\nVeículos inseridos:");
        int onibusIndex = 1;
        int caminhaoIndex = 1;

        for (veiculo veiculo : veiculos) {
            if (veiculo instanceof onibus) {
                System.out.println(onibusIndex + ". Ônibus:");
                veiculo.exibirDetalhes();
                System.out.println("------------------------");
                onibusIndex++;
            } else if (veiculo instanceof caminhao) {
                System.out.println(caminhaoIndex + ". Caminhão:");
                veiculo.exibirDetalhes();
                System.out.println("------------------------");
                caminhaoIndex++;
            }
        }

        scanner.close();
    }

    // Método para ler um número inteiro com tratamento de exceções
    private static int lerNumero(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                scanner.next(); // Limpar a entrada inválida
            }
        }
    }

    // Método para ler um número double com tratamento de exceções
    private static double lerNumeroDouble(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
                scanner.next(); // Limpar a entrada inválida
            }
        }
    }
}

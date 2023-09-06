package DesafioJava;


import java.util.Scanner;  // Importa a classe Scanner do pacote java.util.

public class RegrasEKS {
    public static void main(String[] args) {
        // Definindo as regras básicas
        int podsPorNode = 10;  // Define a quantidade máxima de pods por node.
        int podsPorServidor = 4;  // Define a quantidade máxima de pods por servidor.

        // Criando um objeto Scanner para receber as entradas do usuário
        Scanner scanner = new Scanner(System.in);  // Cria um objeto Scanner para leitura de entrada do teclado.

        // Recebendo as informações do usuário
        int numeroTotalPods = scanner.nextInt();  // Lê um número inteiro fornecido pelo usuário.

        //TODO: Calcule o número mínimo de nodes necessários
        int numeroMinimoNodes = (numeroTotalPods + podsPorNode - 1) / podsPorNode;  // Calcula o número mínimo de nodes.

        //TODO: Calcule o número mínimo de servidores necessários
        int numeroMinimoServidores = (numeroTotalPods + podsPorServidor - 1) / podsPorServidor;  // Calcula o número mínimo de servidores.

        //TODO: Exiba o resultado com as recomendações de quantidades de servidores e nodes.
        if (numeroMinimoNodes <= 1) {  // Verifica se o número mínimo de nodes é menor ou igual a 1.
            System.out.println("1.Recomendamos usar um unico node");  // Exibe uma recomendação para usar um único node.
        } else {
            System.out.println("1.Numero minimo de nodes:" + numeroMinimoNodes);  // Exibe o número mínimo de nodes calculado.
        }
        
        System.out.println("2.Numero minimo de servidores:" + numeroMinimoServidores);  // Exibe o número mínimo de servidores calculado.

        // Fechando o Scanner
        scanner.close();  // Fecha o objeto Scanner para liberar recursos.
    }
}

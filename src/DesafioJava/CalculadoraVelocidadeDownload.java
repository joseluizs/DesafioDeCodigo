package DesafioJava;

import java.util.Scanner;

public class CalculadoraVelocidadeDownload {

    public static void main(String[] args) {
        // Inicializa o Scanner para leitura de entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar a entrada do usuário para a distância física e a velocidade do plano de internet
        System.out.print("Digite a distância física (km): ");
        double distanciaServidores = scanner.nextDouble();

        System.out.print("Digite a velocidade do plano de internet (Mbps): ");
        double velocidadePlano = scanner.nextDouble();

        // Calcular a velocidade de download estimada
        double velocidadeDownloadEstimada = calcularVelocidadeDownload(distanciaServidores, velocidadePlano);

        // Apresentar o resultado
        System.out.println("\nVelocidade de Download Estimada: " + String.format("%.2f", velocidadeDownloadEstimada) + " Mbps");

        // Fechar o scanner para evitar vazamento de recursos
        scanner.close();
    }

    public static double calcularVelocidadeDownload(double distanciaServidores, double velocidadePlano) {
        // Fórmula para calcular a velocidade de download estimada
        double velocidadeDownloadEstimada = velocidadePlano / (1 + (distanciaServidores / 100));

        // Verifica se a velocidade de download estimada não excede a velocidade do plano
        if (velocidadeDownloadEstimada > velocidadePlano) {
            velocidadeDownloadEstimada = velocidadePlano;
        }

        // Retorna a velocidade de download estimada
        return velocidadeDownloadEstimada;
    }
}


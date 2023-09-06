package DesafioJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MonitoramentoLogsAWS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeLogs = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Map<String, Long> eventosPorServico = new HashMap<>();
        for (int i = 0; i < quantidadeLogs; i++) {
            String[] parts = scanner.nextLine().split(",");
            String servico = parts[1];
            
            // Utilize o mapa para registrar/incrementar o serviço em questão.
            eventosPorServico.put(servico, eventosPorServico.getOrDefault(servico, 0L) + 1);
        }

        // Identifique no mapa os serviços com maior e menor quantidade de logs.
        // Usando Java Streams, você pode fazer isso da seguinte maneira:

        // Encontre o serviço com a maior quantidade de eventos
        Map.Entry<String, Long> maiorServico = eventosPorServico.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);

        // Encontre o serviço com a menor quantidade de eventos
        Map.Entry<String, Long> menorServico = eventosPorServico.entrySet().stream()
                .min(Map.Entry.comparingByValue())
                .orElse(null);

        // Imprima a saída no padrão definido no enunciado
        System.out.println("Eventos por servico:");
        eventosPorServico.forEach((servico, quantidade) ->
            System.out.println(servico + ":" + quantidade)
        );

        System.out.println("Maior:" + maiorServico.getKey());
        System.out.println("Menor:" + menorServico.getKey());
    }
}

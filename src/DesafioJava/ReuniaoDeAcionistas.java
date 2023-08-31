package DesafioJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ReuniaoDeAcionistas {

	public static void main(String[] args) throws ParseException {
		// Lê os dados de Entrada conforme descrito neste Desafio.
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a data inicial");
		String dataInicial = scanner.nextLine();
		System.out.println("Digite a final");
		String dataFinal = scanner.nextLine();

		SistemaAcionistas sistemaAcionistas = new SistemaAcionistas();
		List<String> analises = sistemaAcionistas.obterAnalisesDesempenhos(dataInicial, dataFinal);

		for (String analise : analises) {
			System.out.println(analise);
		}
		scanner.close();
	}
}

class SistemaAcionistas {
	public List<String> obterAnalisesDesempenhos(String dataInicialStr, String dataFinalStr) throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date dataInicial = df.parse(dataInicialStr);
		Date dataFinal = df.parse(dataFinalStr);

		// Simula uma base da dados em uma lista de análises:
	    List <obterAnalisesDesempenhos> analises = new ArrayList < > ();
	    analises.add(new obterAnalisesDesempenhos(df.parse("01/01/2023"), "Analise de Desempenho Financeiro"));
	    analises.add(new obterAnalisesDesempenhos(df.parse("15/02/2023"), "Analise de Riscos e Exposicoes"));
	    analises.add(new obterAnalisesDesempenhos(df.parse("31/03/2023"), "Analises Corporativas"));
	    analises.add(new obterAnalisesDesempenhos(df.parse("01/04/2023"), "Analise de Politicas e Regulamentacoes"));
	    analises.add(new obterAnalisesDesempenhos(df.parse("15/05/2023"), "Analise de Ativos"));
	    analises.add(new obterAnalisesDesempenhos(df.parse("30/06/2023"), "Analise de Inovacao e Tecnologia"));

		// TODO: Implemente o filtro das análises dentro do período especificado. Dica:
		// Crie uma lista para armazenar as análises filtradas e use um loop for para
		// filtrar as análises.
		List<String> analisesFiltradas = new ArrayList<>();

		// Filtra as análises dentro do período especificado
		for (obterAnalisesDesempenhos analise : analises) {
			if (analise.data.compareTo(dataInicial) >= 0 && analise.data.compareTo(dataFinal) <= 0) {
				analisesFiltradas.add(analise.descricao);
			}
		}

		// TODO: Retorne a lista de análises filtradas.
		return analisesFiltradas;
	}

	class obterAnalisesDesempenhos {
		Date data;
		String descricao;

		public obterAnalisesDesempenhos(Date data, String descricao) {
			this.data = data;
			this.descricao = descricao;
		}
	}
}
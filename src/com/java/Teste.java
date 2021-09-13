package com.java;

/**
 * Classe que testa
 * @author grupo Jarvis
 * @version 1.0
 */

public class Teste {
	
	public static void main(String[] args) {
		
		/**
		 * Cria uma variável corrida que extende a classe Corrida
		 */
		Corrida corrida = new Corrida();
		
		/**
		 * estabelece a data da corrida
		 */
		corrida.setData("09/09/21");
		
		/**
		 * estabelece a duração da corrida em minutos
		 */
		corrida.setDuracao(30.0);
		
		/**
		 * estabelece a quantidade de calorias gastas na corrida
		 */
		corrida.setCaloriasGastas(310);
		
		/**
		 * estabelece a intensidade da corrida
		 */
		corrida.setIntensidade("Media");
		
		/**
		 * estabelece a distancia percorrida
		 */
		corrida.setDistancia(5);
		
		/**
		 * estabelece o tipo de pista da corrida
		 */
		corrida.setTipoDePista("Rua asfaltada");
		
		/**
		 * Cria uma variável natacao que extende a classe Natacao
		 */
		Natacao natacao = new Natacao();
		
		/**
		 * estabelece a quantidade de calorias gastas na natacao
		 */
		natacao.setCaloriasGastas(100);
		
		/**
		 * estabelece a data da natacao
		 */
		natacao.setData("10/09/21");
		
		/**
		 * estabelece a duração da natacao em minutos
		 */
		natacao.setDuracao(13.0);
		
		/**
		 * estabelece o estilo de nado praticado
		 */
		natacao.setEstiloNado("Crawl");
		
		/**
		 * estabelece a intensidade da natacao
		 */
		natacao.setIntensidade("Fraca");
		
		/**
		 * estabelece a quantidade de voltas nadadas
		 */
		natacao.setQuantidadeVoltas(10);
		
		/**
		 * estabelece o tamanho da piscina em metros
		 */
		natacao.setTamanhoPiscina(25);
		
		
		/**
		 * Cria uma variavel alimento que extende a Classe HistAlimento
		 */
		Alimento alimento = new Alimento();
		
		/**
		 * estabelece a data do registro do alimento"
		 */
		alimento.setData("10/09/21");
		/**
		 * estabelece o horario do registro do alimento
		 */
		alimento.setHorario("19:43");
		/*
		 * estabelece a kcal do alimento
		 */
		alimento.setKcal(600);
		/*
		 * estabelece o tipo do alimento
		 */
		alimento.setTipoDeAlimento("Frutas");
		/*
		 * estabelece a unidade de medida do alimento
		 */
		alimento.setUnidadeDeMedida("50");
		/*
		 * estabelece o nome do alimento
		 */
		alimento.setNmAlimento("Maca");
	
		
		
		
		
		
		
		/**
		 * Imprime as informacoes sobre a corrida
		 */
		System.out.println("INFORMACAO S DA CORRIDA");
		System.out.println("===================================");
		System.out.println("Data do registro: " + corrida.getData());
		System.out.println("Tempo de corrida: " +corrida.getDuracao() + " min");
		System.out.println("Calorias gastas: " +corrida.getCaloriasGastas() + " kcal");
		System.out.println("Intensidade da corrida: " +corrida.getIntensidade());
		System.out.println("Distancia percorrida: " +corrida.getDistancia() + " km");
		System.out.println("Tipo de pista: " +corrida.getTipoDePista());
		System.out.println("Pace: " +corrida.getPace() +" min/km");
		
		
		/**
		 * Imprime as informacoes da natacao
		 */
		System.out.println("");
		System.out.println("INFORMACOES DA NATACAO");
		System.out.println("===================================");
		System.out.println("Data do registro: " +natacao.getData());
		System.out.println("Tempo de natacao: " +natacao.getDuracao() + " min");
		System.out.println("Calorias gastas: " +natacao.getCaloriasGastas() + " kcal");
		System.out.println("Intensidade do nado: " +natacao.getIntensidade());
		System.out.println("Estilo do nado: " +natacao.getEstiloNado());
		System.out.println("Tamanho da piscina: " +natacao.getTamanhoPiscina() + " metros");
		System.out.println("Quantidade de voltas: " +natacao.getQuantidadeVoltas());
		System.out.println("Tempo médio por volta: " +natacao.getTempoMedio() + " min");
		
		
		/**
		 * Imprime as informa��es do Alimento
		 */
		
		System.out.println("");
		System.out.println("INFORMACOES DO ALIMENTO");
		System.out.println("===================================");
		System.out.println("Data do registro: "+alimento.getData());
		System.out.println("Horario do registro: "+alimento.getHorario());
		System.out.println("Nome: "+alimento.getNmAlimento());
		System.out.println("Calorias: " +alimento.getKcal());
		System.out.println("Tipo de Alimento: "+alimento.getTipoDeAlimento());
		System.out.println("Peso :" +alimento.getUnidadeDeMedida()+ "gramas");

		
		
		
	}
}

		
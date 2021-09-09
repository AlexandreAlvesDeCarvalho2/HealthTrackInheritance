package com.java;

public class Teste {
	
	public static void main(String[] args) {
		
		Corrida corrida = new Corrida();
		corrida.setData("09/09/21");
		corrida.setDuracao(30);
		corrida.setCaloriasGastas(310);
		corrida.setIntensidade("Média");
		corrida.setDistancia(5);
		corrida.setTipoDePista("Rua asfaltada");
	
		System.out.println("INFORMAÇÕES DA CORRIDA");
		System.out.println("===================================");
		System.out.println("Data do registro: " + corrida.getData());
		System.out.println("Tempo de corrida: " +corrida.getDuracao() + " min");
		System.out.println("Calorias gastas: " +corrida.getCaloriasGastas() + " kcal");
		System.out.println("Intensidade da corrida: " +corrida.getIntensidade());
		System.out.println("Distância percorrida: " +corrida.getDistancia() + " km");
		System.out.println("Tipo de pista: " +corrida.getTipoDePista());
		System.out.println("Pace: " +corrida.getPace() +" min/km");
		
	}
}

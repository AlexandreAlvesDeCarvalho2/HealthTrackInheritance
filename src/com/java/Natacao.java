package com.java;

/**
 * Classe que abstrai natacao
 * @author grupo Jarvis
 * @version 1.0
 */

public class Natacao extends AtividadeFisica {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * Tamanho da piscina em metros
	 */
	private int tamanhoPiscina;
	
	/**
	 * Quantidade de voltas realizadas
	 */
	private int quantidadeVoltas;
	
	/**
	 * Estilo do nado praticado
	 */
	private String estiloNado;
	
	/**
	 * Tempo medio por volta
	 */
	private double tempoMedio;
	
	/**
	 * Construtor padrao
	 */
	public Natacao() {
		
	}
	
	/**
	 * Construtor Natacao
	 * @param tamanhoPiscina
	 * @param quantidadeVoltas
	 * @param estiloNado
	 * @param tempoMedio
	 */
	public Natacao(int tamanhoPiscina, int quantidadeVoltas, String estiloNado, double tempoMedio) {
		this.tamanhoPiscina = tamanhoPiscina;
		this.quantidadeVoltas = quantidadeVoltas;
		this.estiloNado = estiloNado;
		this.tempoMedio = tempoMedio;
	}
	
	
	/**
	 * Verifica o tamanho da piscina
	 * @return tamanhoPiscina
	 */
	public int getTamanhoPiscina() {
		return tamanhoPiscina;
	}
	
	/**
	 * Altera o tamanho da piscina
	 * @param tamanhoPiscina
	 */
	public void setTamanhoPiscina(int tamanhoPiscina) {
		this.tamanhoPiscina = tamanhoPiscina;
	}
	
	/**
	 * Verifica a quantidade de voltas realizadas
	 * @return quantidadeVoltas
	 */
	public int getQuantidadeVoltas() {
		return quantidadeVoltas;
	}
	
	/**
	 * Altera a quantidade de voltas realizadas
	 * @param quantidadeVoltas
	 */
	public void setQuantidadeVoltas(int quantidadeVoltas) {
		this.quantidadeVoltas = quantidadeVoltas;
	}
	
	/**
	 * Verifica o estilo do nado
	 * @return estiloNado
	 */
	public String getEstiloNado() {
		return estiloNado;
	}
	
	/**
	 * Altera o estilo do nado
	 * @param estiloNado
	 */
	public void setEstiloNado(String estiloNado) {
		this.estiloNado = estiloNado;
	}
	
	/**
	 * Verifica o tempo medio de cada volta
	 * @return tempoMedio
	 */
	public double getTempoMedio() {
		return super.getDuracao()/ quantidadeVoltas;
	}
	
	/**
	 * Altera o tempo medio de cada volta
	 * @param tempoMedio
	 */
	public void setTempoMedio(double tempoMedio) {
		this.tempoMedio = tempoMedio;
	}

}

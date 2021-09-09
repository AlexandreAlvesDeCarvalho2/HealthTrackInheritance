package com.java;

import java.io.Serializable;

/**
 * Super Classe que abstrai uma atividade fisica
 * @author grupo Jarvis
 * @version 1.0
 */

public class AtividadeFisica implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Tempo gasto ao fazer a atividade fisica
	 */
	private String duracao;
	
	/**
	 * Intensidade da atividade fisica
	 */
	private String intensidade;
	
	/**
	 * Quantidade de calorias gastas durante a atividade fisica
	 */
	private int caloriasGastas;
	
	/**
	 * Construtor padrao
	 */
	public AtividadeFisica(){
		
	}
	
	/**
	 * Constructor Atividade Fisica
	 * @param duracao
	 * @param intensidade
	 * @param caloriasGastas
	 */
	public AtividadeFisica(String duracao, String intensidade, int caloriasGastas) {
		this.duracao = duracao;
		this.intensidade = intensidade;
		this.caloriasGastas = caloriasGastas;
	}
	
	/**
	 * Verifica a duracao da atividade fisica
	 * @return duracao
	 */
	public String getDuracao() {
		return duracao;
	}
	
	/**
	 * Altera a duracao da atividade fisica
	 * @param duracao
	 */
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	
	/**
	 * Verifica a intensidade da atividade fisica
	 * @return intensidade
	 */
	public String getIntensidade() {
		return intensidade;
	}
	
	/**
	 * Altera a intensidade da atividade fisica
	 * @param intensidade
	 */
	public void setIntensidade(String intensidade) {
		this.intensidade = intensidade;
	}
	
	/**
	 * Verifica as calorias gastas durante a atividade fisica
	 * @return caloriasGastas
	 */
	public int getCaloriasGastas() {
		return caloriasGastas;
	}
	
	/**
	 * Altera as calorias gastas durante a atividade fisica
	 * @param caloriasGastas
	 */
	public void setCaloriasGastas(int caloriasGastas) {
		this.caloriasGastas = caloriasGastas;
	}
	
	

}

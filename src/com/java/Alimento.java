package com.java;

/**
 * Classe que abstrai um Alimento
 * @author grupo Jarvis
 * @version 1.0
 */

public class Alimento extends HistAlimento{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Tipo de Alimento
	 */
	private String tipoDeAlimento;
	/**
	 * unidade de medida do alimento
	 */
	private String unidadeDeMedida;
	/*
	 * calorias do alimento
	 */
	private int kcal;
	
	/*
	 * construtor padrao
	 */
	Alimento(){}
	
	/**
	 * construtor do Alimento
	 * @param tipoDeAlimento
	 * @param unidadeDeMedida
	 * @param kcal
	 */
	
	public Alimento(String tipoDeAlimento, String unidadeDeMedida, int kcal){
		this.tipoDeAlimento = tipoDeAlimento;
		this.unidadeDeMedida = unidadeDeMedida;
		this.kcal = kcal;
		
		
	}
	
	/**
	 * verifica o tipo de alimento
	 * @return
	 */

	public String getTipoDeAlimento() {
		return tipoDeAlimento;
	}
	/**
	 * altera o tipo de alimento
	 * @param tipoDeAlimento
	 */

	public void setTipoDeAlimento(String tipoDeAlimento) {
		this.tipoDeAlimento = tipoDeAlimento;
	}
	/**
	 * verifica a unidade de medida
	 * @return
	 */

	public String getUnidadeDeMedida() {
		return unidadeDeMedida;
	}

	/**
	 * altera a unidade de medida
	 * @param unidadeDeMedida
	 */
	public void setUnidadeDeMedida(String unidadeDeMedida) {
		this.unidadeDeMedida = unidadeDeMedida;
	}

	/**
	 * veririca as qquilocalorias 
	 * @return
	 */
	public int getKcal() {
		return kcal;
	}
	
	/**
	 * altera as quilocalorias 
	 * @param kcal
	 */
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	

}

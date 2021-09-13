package com.java;

import java.io.Serializable;
/**
 * Super Classe que abstrai um Alimento
 * @author grupo Jarvis
 *
 */

public class HistAlimento implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Data em que foi registrado o Alimento
	 */
	private String data;
	
	/**
	 * Horario em que foi registrado o Alimento 
	 */
	private String horario;
	
	
	private String nmAlimento;
	
	/**
	 * construtor padrao
	 */
	public HistAlimento() {
		
	}
	
	/**
	 * Construtor Alimento
	 * @param data
	 * @param horario
	 */
	public HistAlimento(String data, String horario, String nmAlimento) {
		this.data = data;
		this.horario = horario;
		this.nmAlimento= nmAlimento;
		
	}
	/**
	 * verifica a data do alimento
	 * @return
	 */

	public String getData() {
		return data;
	}

	/**
	 * altera a data do alimento
	 * @param data
	 */
	public void setData(String data) {
		this.data = data;
	}
	/**
	 * verifica o horario do alimento
	 * @return
	 */
	public String getHorario() {
		return horario;
	}

	/** altera horario do alimento
	 * @param horario
	 */
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	/**
	 * verifica o nome do Alimento
	 * @return
	 */
	public String getNmAlimento() {
		return nmAlimento;
	}
	
	/*
	 * altera o nome do Alimento 
	 */

	public void setNmAlimento(String nmAlimento) {
		this.nmAlimento = nmAlimento;
	}
	
	
}

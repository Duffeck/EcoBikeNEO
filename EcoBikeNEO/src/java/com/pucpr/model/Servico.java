package com.pucpr.model;

import java.util.ArrayList;
import java.util.List;

public class Servico {
	private int id;
	private Empresa contratante;
	private List<Carga> cargas;
	private Double valorExtra;
	private Double valorTotal;
	private String obs;
	private Endereco origem;
	private Endereco destino;
	
	
	public Servico() {
		cargas = new ArrayList<>();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Empresa getContratante() {
		return contratante;
	}


	public void setContratante(Empresa contratante) {
		this.contratante = contratante;
	}




	public List<Carga> getCargas() {
		return cargas;
	}


	public void setCargas(List<Carga> cargas) {
		this.cargas = cargas;
	}


	public Double getValorExtra() {
		return valorExtra;
	}


	public void setValorExtra(Double valorExtra) {
		this.valorExtra = valorExtra;
	}


	public Double getValorTotal() {
		return valorTotal;
	}


	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}


	public String getObs() {
		return obs;
	}


	public void setObs(String obs) {
		this.obs = obs;
	}


	public Endereco getOrigem() {
		return origem;
	}


	public void setOrigem(Endereco origem) {
		this.origem = origem;
	}


	public Endereco getDestino() {
		return destino;
	}


	public void setDestino(Endereco destino) {
		this.destino = destino;
	}
	
	public void addCarga(Carga carga){
		cargas.add(carga);
	}
	
	
}

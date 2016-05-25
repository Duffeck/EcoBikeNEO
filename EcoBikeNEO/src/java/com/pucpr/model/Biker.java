package com.pucpr.model;

import java.util.ArrayList;
import java.util.List;

public class Biker {
        private Integer id;
	private String nome;
	private Double cpf;
	private Double rg;
	private List<Servico> servicos;
	private List<Bike> bikes;
	private List<Conta> contas;
	
	public Biker(){
		servicos = new ArrayList<>();
		bikes = new ArrayList<>();
		contas = new ArrayList<>();
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getCpf() {
		return cpf;
	}
	public void setCpf(Double cpf) {
		this.cpf = cpf;
	}
	public Double getRg() {
		return rg;
	}
	public void setRg(Double rg) {
		this.rg = rg;
	}
	public List<Servico> getServicos() {
		return servicos;
	}
	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}
	public List<Bike> getBikes() {
		return bikes;
	}
	public void setBikes(List<Bike> bikes) {
		this.bikes = bikes;
	}
	public List<Conta> getContas() {
		return contas;
	}
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	public void addServico(Servico servico){
		servicos.add(servico);
	}
	public void addBike(Bike bike){
		bikes.add(bike);
	}
	public void addConta(Conta conta){
		contas.add(conta);
	}
	
	
	
	

}

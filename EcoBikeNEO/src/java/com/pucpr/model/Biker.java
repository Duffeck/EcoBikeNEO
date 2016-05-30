package com.pucpr.model;

import java.io.Serializable;
import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "BIKERS")
public class Biker implements Serializable{
	@Id
	@GeneratedValue
        private Integer id;
	private String nome;
	private Integer cpf;
	private Integer rg;
	
	@OneToMany(mappedBy="biker")
	private List<Servico> servicos;
	
	@OneToMany(mappedBy="biker")
	private List<Bike> bikes;
	
	@OneToMany(mappedBy="biker")
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
	public Integer getCpf() {
		return cpf;
	}
	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
	public Integer getRg() {
		return rg;
	}
	public void setRg(Integer rg) {
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
package com.pucpr.model;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name = "CARGAS")
public class Carga implements Serializable{
	
	@Id
	@GeneratedValue
	private Integer id;
	private Double peso;
	private Double dimensao;
	private String tipo;
	
	@ManyToOne
	@JoinColumn(name = "servico_id")
	private Servico servico;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getDimensao() {
		return dimensao;
	}
	public void setDimensao(Double dimensao) {
		this.dimensao = dimensao;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Servico getServico() {
		return servico;
	}
	public void setServico(Servico servico) {
		this.servico = servico;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
}
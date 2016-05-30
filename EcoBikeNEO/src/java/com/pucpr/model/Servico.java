package com.pucpr.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "SERVICOS")
public class Servico implements Serializable{
	@Id
	@GeneratedValue
    private Integer id;
	@ManyToOne
	@JoinColumn(name = "empresa_id")
	private Empresa contratante;
	@ManyToOne
	@JoinColumn(name = "biker_id")
	private Bike biker;
	
	@OneToMany(mappedBy="servico")
	private List<Carga> cargas;
	
	private Double valorExtra;
	private Double valorTotal;
	private String obs;
	
	@OneToOne
	@JoinColumn(name = "origem")
	private Endereco origem;
	
	@OneToOne
	@JoinColumn(name = "destino")
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


	public Bike getBiker() {
		return biker;
	}


	public void setBiker(Bike biker) {
		this.biker = biker;
	}


	public void setId(Integer id) {
		this.id = id;
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
package com.pucpr.model;

import java.io.Serializable;
import javax.persistence.*;



@Entity
@Table(name = "BIKE")
public class Bike implements Serializable{
    @Id
    @GeneratedValue
    private Integer id;
	private Integer capacidade;
	private String numeroSerie;
	@ManyToOne
	@JoinColumn(name = "biker_id")
	private Biker biker;
	
	
	public Integer getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}
	public String getNumeroSerie() {
		return numeroSerie;
	}
	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Biker getBiker() {
		return biker;
	}
	public void setBiker(Biker biker) {
		this.biker = biker;
	}
	
	
	

}
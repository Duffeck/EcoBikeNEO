package com.pucpr.model;

import javax.persistence.*;
import org.hibernate.annotations.Table;



@Entity
@Table(appliesTo = "BIKE")
public class Bike {
        @Id @GeneratedValue
        @Column(name = "id")
        private Integer id;
	private Integer capacidade;
	private String numeroSerie;
	
	
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
	
	
	

}

package com.pucpr.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "CONTAS")
public class Conta implements Serializable{
        
    @Id
	@GeneratedValue
	private Integer id;
	private Integer agencia;
	private Integer conta;
	@ManyToOne
	@JoinColumn(name = "biker_id")
	private Biker biker;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Integer getAgencia() {
		return agencia;
	}
	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}
	public Integer getConta() {
		return conta;
	}
	public void setConta(Integer conta) {
		this.conta = conta;
	}
	public Biker getBiker() {
		return biker;
	}
	public void setBiker(Biker biker) {
		this.biker = biker;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	

}
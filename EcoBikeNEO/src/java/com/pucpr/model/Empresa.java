package com.pucpr.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
@Entity
@Table(name = "EMPRESAS")
public class Empresa implements Serializable{
	@Id
	@GeneratedValue
	private Integer id;
	
	private Integer cnpj;
	private String nome;
	private String telefone;
	private String email;
        @OneToOne
	private Endereco endereco;
	
	@OneToMany(mappedBy="contratante")
	private List<Servico> servicos;
	
	
	public Empresa() {
		servicos = new ArrayList<>();
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Integer getCnpj() {
		return cnpj;
	}
	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
        
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public List<Servico> getServicos() {
		for(Servico s : servicos)
		{
			s.setContratante(this);;		

		}
		return servicos;
	}
	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
		
	}
	
	public void addServico(Servico servico){
		servicos.add(servico);
	}
	
	
	

}
package com.trabalho.crm.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
public class Cliente {
   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
	
	@Column(nullable = false )
	public String nome;
	
	@Column(nullable = false )
	public String cpf;
	
	@Column(nullable = false )
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	public Date data_nascimento;
	
	@Column(nullable = false )
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	public int fone;
	 
	@Column(nullable = false )
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	public BigDecimal limite_credito;
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public Date getData_nascimento() {
		return data_nascimento;
	}


	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}


	public int getFone() {
		return fone;
	}


	public void setFone(int fone) {
		this.fone = fone;
	}


	public BigDecimal getLimite_credito() {
		return limite_credito;
	}


	public void setLimite_credito(BigDecimal limite_credito) {
		this.limite_credito = limite_credito;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getId() {
		return id;
	}

}

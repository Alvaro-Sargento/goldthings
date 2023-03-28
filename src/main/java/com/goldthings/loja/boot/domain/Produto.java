package com.goldthings.loja.boot.domain;

import java.time.LocalDate;

import jakarta.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name="PRODUTO")
public class Produto extends AbstractEntity<Long> {
	
	@Column(name="nome", nullable =false)
	private String nome;
	
	@Column(nullable =false)
	private String descricao;
	
	@Column(nullable =false)
	private int quantidade;
	
	@Column(nullable =false, columnDefinition="DOUBLE DEFAULT 0.00")
	private Double preco;
	
	@Column(name="data_exp", nullable =false, columnDefinition="DATE")
	private LocalDate data_exp;
	

}
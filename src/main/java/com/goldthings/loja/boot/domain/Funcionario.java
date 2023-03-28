package com.goldthings.loja.boot.domain;

import java.math.BigDecimal;


import jakarta.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name="FUNCIONARIO")
public class Funcionario extends AbstractEntity<Long> {

	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String apelido;
	
	@Column(nullable = false)
	private String cidade;
	
	@Column(nullable = false)
	private String bairro;
	
	@Column(nullable = false)
	private String quarteirao;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false, name="nr_telefone")
	private int nr_telefone;
	
	
	@Column(nullable = false, name="nr_casa")
	private int nr_casa;
	
	@Column(nullable = false, columnDefinition="DECIMAL(7,2) DEFAULT 0.00")
	private BigDecimal salario;
	
	@ManyToOne
	@JoinColumn(name = "id_user_fk")
	private Usuario user;
	
	
}
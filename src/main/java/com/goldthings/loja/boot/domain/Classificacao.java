package com.goldthings.loja.boot.domain;

import jakarta.persistence.*;
@SuppressWarnings("serial")
@Entity
@Table(name="CLASSIFICACAO")
public class Classificacao extends AbstractEntity<Long> {

	@Column(nullable=false)
	private String descricao;
	
	@OneToOne
	@JoinColumn(name="id_cliente_fk")
	private Cliente cliente;
	
	@OneToOne
	@JoinColumn(name="id_produto_fk")
	private Produto produto;
	

}
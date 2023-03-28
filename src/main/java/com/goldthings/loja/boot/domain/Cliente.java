package com.goldthings.loja.boot.domain;

import jakarta.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name="CLIENTE")
public class Cliente extends AbstractEntity<Long> {

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

}
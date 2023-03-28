package com.goldthings.loja.boot.domain;

import jakarta.persistence.*;

@SuppressWarnings("serial")
@Entity
public class Usuario extends AbstractEntity<Long>{
	
	@Column(nullable = false, unique = true)
	private String username;
	
	@Column(nullable = false, unique = true)
	private String password;
	
	@Column(nullable = false)
	private String perfil;
}
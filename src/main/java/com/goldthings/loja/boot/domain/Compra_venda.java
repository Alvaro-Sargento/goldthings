package com.goldthings.loja.boot.domain;

import jakarta.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name="COMPRA_VENDA")
public class Compra_venda extends AbstractEntity<Long> {

	@OneToMany
	@JoinColumn(name="id_cliente_fk")
	private Cliente cliente;

	@OneToMany
	@JoinColumn(name="id_produto_fk")
	private Produto produto;
	
	@Column(name="valor_compra", nullable=false, columnDefinition="DOUBLE DEFAULT 0.00")
	private Double valor_compra;

}
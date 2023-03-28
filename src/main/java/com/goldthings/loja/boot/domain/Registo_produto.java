package com.goldthings.loja.boot.domain;

import java.time.LocalDate;

import jakarta.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name="REGISTO_PRODUTO")
public class Registo_produto extends AbstractEntity<Long> {

@OneToMany
@JoinColumn(name="id_funcionario_fk")
private Funcionario funcionario;

@OneToMany
@JoinColumn(name="id_produto_fk")
private Produto produto;

@Column(nullable=false, name="data_registo", columnDefinition="DATE DEFAULT CURRENT_TIMESTAMP")
private LocalDate data;
}
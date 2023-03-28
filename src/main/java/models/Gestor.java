package models;

import jakarta.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name="GESTOR_SISTEMA")
public  class Gestor extends AbstractEntity<Long> {
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String apelido;
	
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false, name="nr_telefone")
	private int nr_telefone;
	
	@ManyToOne
	@JoinColumn(name = "id_user_fk")
	private Usuario user;
	
	
}

package models;

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
	
	@Column (nullable = false, unique = true)
	private String bi;
	
	@Column(nullable = false)
	private String cidade;
	
	@Column(nullable = false)
	private String bairro;
	
	@Column(nullable = false)
	private String quarteirao;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false, name="nr_telefone")
	private Integer nr_telefone;
	
	@Column(nullable = false, name="nr_casa")
	private Integer nr_casa;
	
	@Column(nullable = false, columnDefinition="DECIMAL(7,2) DEFAULT 0.00")
	private BigDecimal salario;
	
	@ManyToOne
	@JoinColumn(name = "id_user_fk")
	private Usuario user;

	public String getNome() {
		return nome;
	}
	
	

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getQuarteirao() {
		return quarteirao;
	}

	public void setQuarteirao(String quarteirao) {
		this.quarteirao = quarteirao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getNr_telefone() {
		return nr_telefone;
	}

	public void setNr_telefone(Integer nr_telefone) {
		this.nr_telefone = nr_telefone;
	}

	public Integer getNr_casa() {
		return nr_casa;
	}

	public void setNr_casa(Integer nr_casa) {
		this.nr_casa = nr_casa;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}
	
	
	
}

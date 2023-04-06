package goldthings.models;

import jakarta.persistence.*;

import java.util.ArrayList;

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

	@Column (nullable = false, unique = true)
	private String bi;

	@Column(nullable = false)
	private String email;

	@Column(nullable = false, name="nr_telefone")
	private Integer nr_telefone;

	@Column(nullable = false, name="nr_casa")
	private Integer nr_casa;

	@ManyToOne
	@JoinColumn(name = "id_user_fk")
	private Usuario user;

//	@OneToMany(mappedBy="cliente", cascade = CascadeType.ALL, orphanRemoval = true)
//	private ArrayList<Registo_produto> registo_produto = new ArrayList<>();
//
//	public ArrayList<Registo_produto> getRegisto_produto() {
//		return registo_produto;
//	}
//
//	public void setRegisto_produto(ArrayList<Registo_produto> registo_produto) {
//		this.registo_produto = registo_produto;
//	}

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

	public void setBi(String bi) {
		this.bi = bi;
	}

	public String getBi() {
		return bi;
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

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}



}

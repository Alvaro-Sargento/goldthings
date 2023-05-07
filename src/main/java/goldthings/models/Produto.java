package goldthings.models;

import java.time.LocalDate;
import java.util.ArrayList;

import jakarta.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name="PRODUTO")
public class Produto extends AbstractEntity<Long> {
	@Column(name="nome", nullable = false)
	private String nome;

	@Column(nullable = false)
	private String descricao;

	@Column(nullable = false)
	private Integer quantidade;

	@Column(nullable =false, columnDefinition="DOUBLE DEFAULT 0.00")
	private Double preco;

	@Column(name="data_exp", nullable =false, columnDefinition="DATE")
	private LocalDate data_exp;

	@Column(nullable = false)
	private String imagem;

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public LocalDate getData_exp() {
		return data_exp;
	}

	public void setData_exp(LocalDate data_exp) {
		this.data_exp = data_exp;
	}



}

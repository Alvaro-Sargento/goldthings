package demo.gold_things.domain;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
	

}

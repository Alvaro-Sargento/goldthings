package models;

import java.time.LocalDate;

import jakarta.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name="REGISTO_PRODUTO")
public class Registo_produto extends AbstractEntity<Long> {

@EmbeddedId
private RegistoProdutoId mix;

@Column(nullable=false, name="data_registo", columnDefinition="DATE DEFAULT CURRENT_TIMESTAMP")
private LocalDate data;

@ManyToOne
@MapsId("cliente_id")
private Cliente cliente;

@ManyToOne
@MapsId("produto_id")
private Produto produto;
}

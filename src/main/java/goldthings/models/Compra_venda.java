package goldthings.models;

import jakarta.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name="COMPRA_VENDA")
public class Compra_venda extends AbstractEntity<Long> {
	@Column(name="valor_compra", nullable=false, columnDefinition="DOUBLE DEFAULT 0.00")
	private Double valor_compra;

}

package models;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.*;

@Embeddable
public class RegistoProdutoId implements Serializable {

@Column(nullable = false, name="cliente_id_fk")	
private Integer cliente_id;

@Column(nullable = false, name="produto_id_fk")	
private Integer produto_id;


}

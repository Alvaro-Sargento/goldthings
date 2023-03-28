package demo.gold_things.domain;

import java.time.LocalDate;

import jakarta.persistence.*;

@Embeddale
public class Registo_produto extends AbstractEntity<Long> {

@Column(nullable = false, name="cliente_id_fk")	
private Integer cliente_id;

@Column(nullable = false, name="produto_id_fk")	
private Integer produto_id;


}

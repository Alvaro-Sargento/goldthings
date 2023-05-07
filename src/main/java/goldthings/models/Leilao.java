package goldthings.models;

import jakarta.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name="LEILAO")
public class Leilao extends AbstractEntity<Long> {
    @Column(nullable = false)
    private String produto;

    @Column(nullable = false)
    private String imagem;

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    private LocalTime inicio;

    private LocalTime fim;

    @Column(nullable = false)
    private Double valor_inicial;

    @Column(nullable = true)
    private String valor_final;

    @Column(nullable = false)
    private String estado = "pendente";


    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public LocalTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalTime inicio) {
        this.inicio = inicio;
    }

    public LocalTime getFim() {
        return fim;
    }

    public void setFim(LocalTime fim) {
        this.fim = fim;
    }

    public Double getValor_inicial() {
        return valor_inicial;
    }

    public void setValor_inicial(Double valor_inicial) {
        this.valor_inicial = valor_inicial;
    }

    public String getValor_final() {
        return valor_final;
    }

    public void setValor_final(String valor_final) {
        this.valor_final = valor_final;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
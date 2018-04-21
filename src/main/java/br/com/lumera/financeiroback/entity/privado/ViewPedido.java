package br.com.lumera.financeiroback.entity.privado;

import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "view_pedido")
public class ViewPedido {
    @Id
    private Long id;
    private LocalDateTime criado;
    private String identificacao;
    private String apresentante;
    @Column(name = "apresentante_documento")
    private String apresentanteDocumento;
    private BigDecimal valor;
    @Column(name = "pago_anteriormente")
    private BigDecimal pagoAnteriormente;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCriado() {
        return criado;
    }

    public void setCriado(LocalDateTime criado) {
        this.criado = criado;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getApresentante() {
        return apresentante;
    }

    public void setApresentante(String apresentante) {
        this.apresentante = apresentante;
    }

    public String getApresentanteDocumento() {
        return apresentanteDocumento;
    }

    public void setApresentanteDocumento(String apresentanteDocumento) {
        this.apresentanteDocumento = apresentanteDocumento;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getPagoAnteriormente() {
        return pagoAnteriormente;
    }

    public void setPagoAnteriormente(BigDecimal pagoAnteriormente) {
        this.pagoAnteriormente = pagoAnteriormente;
    }
}

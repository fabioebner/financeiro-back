package br.com.lumera.financeiroback.entity.privado;

import br.com.lumera.financeiroback.entity.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_protocolo_deposito_previo")
public class ProtocoloDepositoPrevio extends AbstractEntity {

    @Column(name = "protocolo_id")
    @NotEmpty
    private String protocolo;
    @Column(name = "movimentacao_id")
    @NotNull
    private Long movimentacao;
    private LocalDateTime dia;
    private BigDecimal valor;

    public ProtocoloDepositoPrevio(@NotEmpty String protocolo, @NotNull Long movimentacao, LocalDateTime dia, BigDecimal valor) {
        this.protocolo = protocolo;
        this.movimentacao = movimentacao;
        this.dia = dia;
        this.valor = valor;
    }

    public ProtocoloDepositoPrevio() {
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public Long getMovimentacao() {
        return movimentacao;
    }

    public void setMovimentacao(Long movimentacao) {
        this.movimentacao = movimentacao;
    }

    public LocalDateTime getDia() {
        return dia;
    }

    public void setDia(LocalDateTime dia) {
        this.dia = dia;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}

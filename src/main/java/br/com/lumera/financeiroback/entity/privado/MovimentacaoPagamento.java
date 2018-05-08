package br.com.lumera.financeiroback.entity.privado;

import br.com.lumera.financeiroback.entity.AbstractEntity;
import br.com.lumera.financeiroback.entity.FormaPagamento;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "tb_movimentacao_pagamento")
public class MovimentacaoPagamento extends AbstractEntity {
    private BigDecimal valor;
    @OneToOne
    @NotNull
    @JoinColumn(name="forma_pagamento_id", nullable=false)
    private FormaPagamento formaPagamento;

    public MovimentacaoPagamento(FormaPagamento formaPagamento, BigDecimal valorInformado) {
        this.formaPagamento=formaPagamento;
        this.valor = valorInformado;
    }

    public MovimentacaoPagamento() {
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}

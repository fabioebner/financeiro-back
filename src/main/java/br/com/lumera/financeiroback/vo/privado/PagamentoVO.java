package br.com.lumera.financeiroback.vo.privado;

import java.math.BigDecimal;

public class PagamentoVO {
    private Long id;
    private String nome;
    //http://www.baeldung.com/java-money-and-currency
    private BigDecimal valorInformado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValorInformado() {
        return valorInformado;
    }

    public void setValorInformado(BigDecimal valorInformado) {
        this.valorInformado = valorInformado;
    }
}

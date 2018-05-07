package br.com.lumera.financeiroback.vo.privado;

import java.math.BigDecimal;

public class PagamentoVO {
    private Integer id;
    private String nome;
    //http://www.baeldung.com/java-money-and-currency
    private BigDecimal valorInformado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

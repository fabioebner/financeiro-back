package br.com.lumera.financeiroback.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CalcularServico {
    Long idServico; 
    BigDecimal valorInformado;
    Integer quantidade;
    Integer divisorId;
    Integer quantidadeDivisor;
    @JsonFormat(pattern = "dd/MM/yyyy")
    LocalDate dataTabela;

    public Long getIdServico() {
        return idServico;
    }

    public void setIdServico(Long idServico) {
        this.idServico = idServico;
    }

    public BigDecimal getValorInformado() {
        return valorInformado;
    }

    public void setValorInformado(BigDecimal valorInformado) {
        this.valorInformado = valorInformado;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getDivisorId() {
        return divisorId;
    }

    public void setDivisorId(Integer divisorId) {
        this.divisorId = divisorId;
    }

    public Integer getQuantidadeDivisor() {
        return quantidadeDivisor;
    }

    public void setQuantidadeDivisor(Integer quantidadeDivisor) {
        this.quantidadeDivisor = quantidadeDivisor;
    }

    public LocalDate getDataTabela() {
        return dataTabela;
    }

    public void setDataTabela(LocalDate dataTabela) {
        this.dataTabela = dataTabela;
    }
}

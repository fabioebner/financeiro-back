package br.com.lumera.financeiroback.entity.privado;

import br.com.lumera.financeiroback.entity.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "tb_movimentacao_protocolo_servico_custas")
public class MovimentacaoProtocoloServicoCustas extends AbstractEntity {
    @NotNull
    @Column(name = "valor_Base")
    private BigDecimal valorBase;
    @NotEmpty
    @Column(name = "tabela_custa")
    private String tabelaCusta;
    @NotNull
    private Long quantidade;
    private BigDecimal custas1;
    private BigDecimal custas2;
    private BigDecimal custas3;
    private BigDecimal custas4;
    private BigDecimal custas5;
    private BigDecimal custas6;
    private BigDecimal custas7;
    private BigDecimal custas8;
    private BigDecimal custas9;
    private BigDecimal custas10;



    public BigDecimal getValorBase() {
        return valorBase;
    }

    public void setValorBase(BigDecimal valorBase) {
        this.valorBase = valorBase;
    }

    public String getTabelaCusta() {
        return tabelaCusta;
    }

    public void setTabelaCusta(String tabelaCusta) {
        this.tabelaCusta = tabelaCusta;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getCustas1() {
        return custas1;
    }

    public void setCustas1(BigDecimal custas1) {
        this.custas1 = custas1;
    }

    public BigDecimal getCustas2() {
        return custas2;
    }

    public void setCustas2(BigDecimal custas2) {
        this.custas2 = custas2;
    }

    public BigDecimal getCustas3() {
        return custas3;
    }

    public void setCustas3(BigDecimal custas3) {
        this.custas3 = custas3;
    }

    public BigDecimal getCustas4() {
        return custas4;
    }

    public void setCustas4(BigDecimal custas4) {
        this.custas4 = custas4;
    }

    public BigDecimal getCustas5() {
        return custas5;
    }

    public void setCustas5(BigDecimal custas5) {
        this.custas5 = custas5;
    }

    public BigDecimal getCustas6() {
        return custas6;
    }

    public void setCustas6(BigDecimal custas6) {
        this.custas6 = custas6;
    }

    public BigDecimal getCustas7() {
        return custas7;
    }

    public void setCustas7(BigDecimal custas7) {
        this.custas7 = custas7;
    }

    public BigDecimal getCustas8() {
        return custas8;
    }

    public void setCustas8(BigDecimal custas8) {
        this.custas8 = custas8;
    }

    public BigDecimal getCustas9() {
        return custas9;
    }

    public void setCustas9(BigDecimal custas9) {
        this.custas9 = custas9;
    }

    public BigDecimal getCustas10() {
        return custas10;
    }

    public void setCustas10(BigDecimal custas10) {
        this.custas10 = custas10;
    }

    public static MovimentacaoProtocoloServicoCustas cloneFromPrototocoloServicoCustas(ProtocoloServicoCustas servicoCustas) {
        MovimentacaoProtocoloServicoCustas retorno = new MovimentacaoProtocoloServicoCustas();
        retorno.setValorBase(servicoCustas.getValorBase());
        retorno.setTabelaCusta(servicoCustas.getTabelaCusta());
        retorno.setQuantidade(servicoCustas.getQuantidade());
        retorno.setCustas1(servicoCustas.getCustas1());
        retorno.setCustas2(servicoCustas.getCustas2());
        retorno.setCustas3(servicoCustas.getCustas3());
        retorno.setCustas4(servicoCustas.getCustas4());
        retorno.setCustas5(servicoCustas.getCustas5());
        retorno.setCustas6(servicoCustas.getCustas6());
        retorno.setCustas7(servicoCustas.getCustas7());
        retorno.setCustas8(servicoCustas.getCustas8());
        retorno.setCustas9(servicoCustas.getCustas9());
        retorno.setCustas10(servicoCustas.getCustas10());

        return retorno;
    }
}

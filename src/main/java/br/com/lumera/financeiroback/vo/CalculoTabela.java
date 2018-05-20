package br.com.lumera.financeiroback.vo;

import br.com.lumera.financeiroback.util.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public class CalculoTabela {
    private String nmTabela;
    private String divisor;
    private Integer codigo;
    private BigDecimal vlBase;
    private Long qtd;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate data;
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

    public CalculoTabela()
    {
    }

    public CalculoTabela(String nmTabela, String divisor, Long qtd, BigDecimal custas1, BigDecimal custas2, BigDecimal custas3, BigDecimal custas4, BigDecimal custas5, BigDecimal custas6, BigDecimal custas7, BigDecimal custas8, BigDecimal custas9, BigDecimal custas10, LocalDate data, Integer codigo, BigDecimal vlBase)
    {
        this.nmTabela = nmTabela;
        this.divisor = divisor;
        this.codigo = codigo;
        this.qtd = qtd;
        this.custas1 = custas1;
        this.custas2 = custas2;
        this.custas3 = custas3;
        this.custas4 = custas4;
        this.custas5 = custas5;
        this.custas6 = custas6;
        this.custas7 = custas7;
        this.custas8 = custas8;
        this.custas9 = custas9;
        this.custas10 = custas10;
        this.data = data;
        this.vlBase = vlBase;
    }

    public String getNmTabela() {
        return this.nmTabela;
    }

    public void setNmTabela(String nmTabela) {
        this.nmTabela = nmTabela;
    }

    public String getDivisor() {
        return this.divisor;
    }

    public void setDivisor(String divisor) {
        this.divisor = divisor;
    }

    public BigDecimal getCustas1() {
        return this.custas1.setScale(2, Utils.getRoundModePadrao());
    }

    public void setCustas1(BigDecimal custas1) {
        this.custas1 = custas1;
    }

    public BigDecimal getCustas2() {
        return this.custas2.setScale(2, Utils.getRoundModePadrao());
    }

    public void setCustas2(BigDecimal custas2) {
        this.custas2 = custas2;
    }

    public BigDecimal getCustas3() {
        return this.custas3.setScale(2, Utils.getRoundModePadrao());
    }

    public void setCustas3(BigDecimal custas3) {
        this.custas3 = custas3;
    }

    public BigDecimal getCustas4() {
        try {
            return this.custas4.setScale(2, Utils.getRoundModePadrao());
        }catch (Exception e){
            return BigDecimal.ZERO;
        }
    }

    public void setCustas4(BigDecimal custas4) {
        this.custas4 = custas4;
    }

    public BigDecimal getCustas5() {
        try{
            return this.custas5.setScale(2, Utils.getRoundModePadrao());
        }catch (Exception e){
            return BigDecimal.ZERO;
        }
    }

    public void setCustas5(BigDecimal custas5) {
        this.custas5 = custas5;
    }

    public BigDecimal getCustas6() {
        try{
            return this.custas6.setScale(2, Utils.getRoundModePadrao());
        }catch (Exception e){
            return BigDecimal.ZERO;
        }
    }

    public void setCustas6(BigDecimal custas6) {
        this.custas6 = custas6;
    }

    public BigDecimal getCustas7() {
        try{
            return this.custas7.setScale(2, Utils.getRoundModePadrao());
        }catch (Exception e){
            return BigDecimal.ZERO;
        }
    }

    public void setCustas7(BigDecimal custas7) {
        this.custas7 = custas7;
    }

    public BigDecimal getCustas8() {
        try{
            return this.custas8.setScale(2, Utils.getRoundModePadrao());
        }catch (Exception e){
            return BigDecimal.ZERO;
        }
    }

    public void setCustas8(BigDecimal custas8) {
        this.custas8 = custas8;
    }

    public BigDecimal getCustas9() {
        try{
            return this.custas9.setScale(2, Utils.getRoundModePadrao());
        }catch (Exception e){
            return BigDecimal.ZERO;
        }
    }

    public void setCustas9(BigDecimal custas9) {
        this.custas9 = custas9;
    }

    public BigDecimal getCustas10() {
        try{
            return this.custas10.setScale(2, Utils.getRoundModePadrao());
        }catch (Exception e){
            return BigDecimal.ZERO;
        }
    }

    public void setCustas10(BigDecimal custas10) {
        this.custas10 = custas10;
    }

    public void setQtd(Long qtd) {
        this.qtd = qtd;
    }

    public Long getQtd() {
        return this.qtd;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDate getData() {
        return this.data;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public BigDecimal getVlBase() {
        return vlBase.setScale(2, Utils.getRoundModePadrao());
    }

    public void setVlBase(BigDecimal vlBase) {
        this.vlBase = vlBase;
    }
}

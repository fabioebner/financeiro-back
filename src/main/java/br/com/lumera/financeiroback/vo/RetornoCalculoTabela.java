package br.com.lumera.financeiroback.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class RetornoCalculoTabela {
    private String nmCustas1;
    private String nmCustas2;
    private String nmCustas3;
    private String nmCustas4;
    private String nmCustas5;
    private String nmCustas6;
    private String nmCustas7;
    private String nmCustas8;
    private String nmCustas9;
    private String nmCustas10;
    private BigDecimal vlDesconto;
    private BigDecimal valor;
    private Integer qtd;
    @JsonIgnore
    private BigDecimal vlTotal;
    private List<CalculoTabela> calculoTabela;
    private long cdFormaCalculo;

    public String getNmCustas1() {
        return this.nmCustas1;
    }

    public void setNmCustas1(String nmCustas1) {
        this.nmCustas1 = nmCustas1;
    }

    public String getNmCustas2() {
        return this.nmCustas2;
    }

    public void setNmCustas2(String nmCustas2) {
        this.nmCustas2 = nmCustas2;
    }

    public String getNmCustas3() {
        return this.nmCustas3;
    }

    public void setNmCustas3(String nmCustas3) {
        this.nmCustas3 = nmCustas3;
    }

    public String getNmCustas4() {
        return this.nmCustas4;
    }

    public void setNmCustas4(String nmCustas4) {
        this.nmCustas4 = nmCustas4;
    }

    public String getNmCustas5() {
        return this.nmCustas5;
    }

    public void setNmCustas5(String nmCustas5) {
        this.nmCustas5 = nmCustas5;
    }

    public String getNmCustas6() {
        return this.nmCustas6;
    }

    public void setNmCustas6(String nmCustas6) {
        this.nmCustas6 = nmCustas6;
    }

    public String getNmCustas7() {
        return this.nmCustas7;
    }

    public void setNmCustas7(String nmCustas7) {
        this.nmCustas7 = nmCustas7;
    }

    public String getNmCustas8() {
        return this.nmCustas8;
    }

    public void setNmCustas8(String nmCustas8) {
        this.nmCustas8 = nmCustas8;
    }

    public String getNmCustas9() {
        return this.nmCustas9;
    }

    public void setNmCustas9(String nmCustas9) {
        this.nmCustas9 = nmCustas9;
    }

    public String getNmCustas10() {
        return this.nmCustas10;
    }

    public void setNmCustas10(String nmCustas10) {
        this.nmCustas10 = nmCustas10;
    }

    public List<CalculoTabela> getCalculoTabela() {
        if (this.calculoTabela == null) {
            this.calculoTabela = new ArrayList();
        }
        return this.calculoTabela;
    }

    public void setCalculoTabela(List<CalculoTabela> caluloTabela) {
        this.calculoTabela = caluloTabela;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return this.valor;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    public Integer getQtd() {
        if (this.qtd == null) {
            return 1;
        }
        return this.qtd;
    }


    public BigDecimal getVlTotalCustas1() {
        BigDecimal retorno = new BigDecimal(BigInteger.ZERO);
        for (CalculoTabela calculoTabela : this.calculoTabela) {
            retorno = retorno.add(calculoTabela.getCustas1());
        }
        return retorno.setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal getVlTotalCustas2() {
        BigDecimal retorno = new BigDecimal(BigInteger.ZERO);
        for (CalculoTabela calculoTabela : this.calculoTabela) {
            retorno = retorno.add(calculoTabela.getCustas2());
        }
        return retorno.setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal getVlTotalCustas3() {
        BigDecimal retorno = new BigDecimal(BigInteger.ZERO);
        try {
            for (CalculoTabela calculoTabela : this.calculoTabela) {
                retorno = retorno.add(calculoTabela.getCustas3());
            }
        } catch (NullPointerException e) {
        }
        return retorno.setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal getVlTotalCustas4() {
        BigDecimal retorno = new BigDecimal(BigInteger.ZERO);
        try {
            for (CalculoTabela calculoTabela : this.calculoTabela) {
                retorno = retorno.add(calculoTabela.getCustas4());
            }
        } catch (NullPointerException e) {
        }
        return retorno.setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal getVlTotalCustas5() {
        BigDecimal retorno = new BigDecimal(BigInteger.ZERO);
        try {
            for (CalculoTabela calculoTabela : this.calculoTabela) {
                retorno = retorno.add(calculoTabela.getCustas5());
            }
        } catch (NullPointerException e) {
        }
        return retorno.setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal getVlTotalCustas6() {
        BigDecimal retorno = new BigDecimal(BigInteger.ZERO);
        try {
            for (CalculoTabela calculoTabela : this.calculoTabela) {
                retorno = retorno.add(calculoTabela.getCustas6());
            }
        } catch (NullPointerException e) {
        }
        return retorno.setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal getVlTotalCustas7() {
        BigDecimal retorno = new BigDecimal(BigInteger.ZERO);
        try {
            for (CalculoTabela calculoTabela : this.calculoTabela) {
                retorno = retorno.add(calculoTabela.getCustas7());
            }
        } catch (NullPointerException e) {
        }
        return retorno.setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal getVlTotalCustas8() {
        BigDecimal retorno = new BigDecimal(BigInteger.ZERO);
        try {
            for (CalculoTabela calculoTabela : this.calculoTabela) {
                retorno = retorno.add(calculoTabela.getCustas8());
            }
        } catch (NullPointerException e) {
        }
        return retorno.setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal getVlTotalCustas9() {
        BigDecimal retorno = new BigDecimal(BigInteger.ZERO);
        try {
            for (CalculoTabela calculoTabela : this.calculoTabela) {
                retorno = retorno.add(calculoTabela.getCustas9());
            }
        } catch (NullPointerException e) {
        }
        return retorno.setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal getVlTotalCustas10() {
        BigDecimal retorno = new BigDecimal(BigInteger.ZERO);
        try {
            for (CalculoTabela calculoTabela : this.calculoTabela) {
                retorno = retorno.add(calculoTabela.getCustas10());
            }
        } catch (NullPointerException e) {
        }
        return retorno.setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal getVlTotal() {
        return getVlTotalCustas1().add(getVlTotalCustas2()).add(getVlTotalCustas3()).add(getVlTotalCustas4()).add(getVlTotalCustas5()).add(getVlTotalCustas6()).add(getVlTotalCustas7()).add(getVlTotalCustas8()).add(getVlTotalCustas9()).subtract(getVlDesconto());
    }

    public BigDecimal getVlDesconto() {
        if (vlDesconto == null) {
            return BigDecimal.ZERO;
        }
        return vlDesconto;
    }

    public void setVlDesconto(BigDecimal vlDesconto) {
        this.vlDesconto = vlDesconto;
    }

    public void setVlTotal(BigDecimal vlTotal) {
        this.vlTotal = vlTotal;
    }

    public long getCdFormaCalculo() {
        return cdFormaCalculo;
    }

    public void setCdFormaCalculo(long cdFormaCalculo) {
        this.cdFormaCalculo = cdFormaCalculo;
    }

    public String getTabelaCustas() {
        return this.calculoTabela.get(0).getNmTabela();
    }
}
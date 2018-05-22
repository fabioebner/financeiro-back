package br.com.lumera.financeiroback.entity.privado;

import br.com.lumera.financeiroback.entity.AbstractEntity;
import br.com.lumera.financeiroback.entity.Servico;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tb_movimentacao_protocolo_servico")
public class MovimentacaoProtocoloServico extends AbstractEntity {
    @OneToOne
    @NotNull
    private Servico servico;
    @OneToOne
    @NotNull
    private Protocolo protocolo;
    @Column(name = "valor_base")
    @NotNull
    private BigDecimal vlBase;
    @Column(name = "forma_calculo_id")
    @NotNull
    private Long formaCalculo;

    @OneToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name="movimentacao_protocolo_servico_id", nullable = false)
    private Set<MovimentacaoProtocoloServicoCustas> custas;

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public Protocolo getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(Protocolo protocolo) {
        this.protocolo = protocolo;
    }

    public BigDecimal getVlBase() {
        return vlBase;
    }

    public void setVlBase(BigDecimal vlBase) {
        this.vlBase = vlBase;
    }

    public Long getFormaCalculo() {
        return formaCalculo;
    }

    public void setFormaCalculo(Long formaCalculo) {
        this.formaCalculo = formaCalculo;
    }

    public Set<MovimentacaoProtocoloServicoCustas> getCustas() {
        return custas;
    }

    public void setCustas(Set<MovimentacaoProtocoloServicoCustas> custas) {
        this.custas = custas;
    }

    public static MovimentacaoProtocoloServico cloneFromProtocoloServico(ProtocoloServico protocoloServico, Set<MovimentacaoProtocoloServicoCustas> movimentacaoProtocoloServicoCustas, String protocoloId) {
        MovimentacaoProtocoloServico retorno = new MovimentacaoProtocoloServico();

        retorno.setFormaCalculo(protocoloServico.getFormaCalculo());
        retorno.setServico(protocoloServico.getServico());
        retorno.setVlBase(protocoloServico.getValorBase());
        retorno.setProtocolo(new Protocolo(protocoloId));

        retorno.setCustas(movimentacaoProtocoloServicoCustas);

        return  retorno;
    }


    public BigDecimal getVlTotalCustas1(){
        BigDecimal retorno = BigDecimal.ZERO;
        for(MovimentacaoProtocoloServicoCustas custa : custas){
            retorno = retorno.add(custa.getCustas1());
        }
        return retorno;
    }
    public BigDecimal getVlTotalCustas2(){
        BigDecimal retorno = BigDecimal.ZERO;
        for(MovimentacaoProtocoloServicoCustas custa : custas){
            retorno = retorno.add(custa.getCustas2());
        }
        return retorno;
    }
    public BigDecimal getVlTotalCustas3(){
        BigDecimal retorno = BigDecimal.ZERO;
        for(MovimentacaoProtocoloServicoCustas custa : custas){
            retorno = retorno.add(custa.getCustas3());
        }
        return retorno;
    }
    public BigDecimal getVlTotalCustas4(){
        BigDecimal retorno = BigDecimal.ZERO;
        for(MovimentacaoProtocoloServicoCustas custa : custas){
            retorno = retorno.add(custa.getCustas4());
        }
        return retorno;
    }
    public BigDecimal getVlTotalCustas5(){
        BigDecimal retorno = BigDecimal.ZERO;
        for(MovimentacaoProtocoloServicoCustas custa : custas){
            retorno = retorno.add(custa.getCustas5());
        }
        return retorno;
    }
    public BigDecimal getVlTotalCustas6(){
        BigDecimal retorno = BigDecimal.ZERO;
        for(MovimentacaoProtocoloServicoCustas custa : custas){
            retorno = retorno.add(custa.getCustas6());
        }
        return retorno;
    }
    public BigDecimal getVlTotalCustas7(){
        BigDecimal retorno = BigDecimal.ZERO;
        for(MovimentacaoProtocoloServicoCustas custa : custas){
            retorno = retorno.add(custa.getCustas7());
        }
        return retorno;
    }
    public BigDecimal getVlTotalCustas8(){
        BigDecimal retorno = BigDecimal.ZERO;
        for(MovimentacaoProtocoloServicoCustas custa : custas){
            retorno = retorno.add(custa.getCustas8());
        }
        return retorno;
    }
    public BigDecimal getVlTotalCustas9(){
        BigDecimal retorno = BigDecimal.ZERO;
        for(MovimentacaoProtocoloServicoCustas custa : custas){
            retorno = retorno.add(custa.getCustas9());
        }
        return retorno;
    }
    public BigDecimal getVlTotalCustas10(){
        BigDecimal retorno = BigDecimal.ZERO;
        for(MovimentacaoProtocoloServicoCustas custa : custas){
            retorno = retorno.add(custa.getCustas10());
        }
        return retorno;
    }
    public BigDecimal getTotalCustasServico(){
        BigDecimal retorno = BigDecimal.ZERO;
        retorno = retorno.add(getVlTotalCustas1());
        retorno = retorno.add(getVlTotalCustas2());
        retorno = retorno.add(getVlTotalCustas3());
        retorno = retorno.add(getVlTotalCustas4());
        retorno = retorno.add(getVlTotalCustas5());
        retorno = retorno.add(getVlTotalCustas6());
        retorno = retorno.add(getVlTotalCustas7());
        retorno = retorno.add(getVlTotalCustas8());
        retorno = retorno.add(getVlTotalCustas9());
        retorno = retorno.add(getVlTotalCustas10());
        return retorno;
    }
}

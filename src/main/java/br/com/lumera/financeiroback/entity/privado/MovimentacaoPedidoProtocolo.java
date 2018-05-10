package br.com.lumera.financeiroback.entity.privado;

import br.com.lumera.financeiroback.entity.AbstractEntity;
import br.com.lumera.financeiroback.entity.Servico;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tb_movimentacao_pedido_protocolo")
public class MovimentacaoPedidoProtocolo extends AbstractEntity {

    @OneToOne
    @NotNull
    private Pedido pedido;
    @OneToOne
    @NotNull
    private Protocolo protocolo;
    @OneToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name="movimentacao_pedido_protocolo_id", nullable = false)
    private Set<MovimentacaoProtocoloServico> servicos;
    @Column(name = "vl_devolucao_custa1")
    private BigDecimal vlDevolucaoCustas1;
    @Column(name = "vl_devolucao_custa2")
    private BigDecimal vlDevolucaoCusta2;
    @Column(name = "vl_devolucao_custa3")
    private BigDecimal vlDevolucaoCusta3;
    @Column(name = "vl_devolucao_custa4")
    private BigDecimal vlDevolucaoCusta4;
    @Column(name = "vl_devolucao_custa5")
    private BigDecimal vlDevolucaoCusta5;
    @Column(name = "vl_devolucao_custa6")
    private BigDecimal vlDevolucaoCusta6;
    @Column(name = "vl_devolucao_custa7")
    private BigDecimal vlDevolucaoCusta7;
    @Column(name = "vl_devolucao_custa8")
    private BigDecimal vlDevolucaoCusta8;
    @Column(name = "vl_devolucao_custa9")
    private BigDecimal vlDevolucaoCusta9;
    @Column(name = "vl_devolucao_custa10")
    private BigDecimal vlDevolucaoCusta10;


    public MovimentacaoPedidoProtocolo(Pedido pedido, Protocolo protocolo, Set<MovimentacaoProtocoloServico> servicos, BigDecimal vlDevolucaoCustas1, BigDecimal vlDevolucaoCusta2, BigDecimal vlDevolucaoCusta3, BigDecimal vlDevolucaoCusta4, BigDecimal vlDevolucaoCusta5, BigDecimal vlDevolucaoCusta6, BigDecimal vlDevolucaoCusta7, BigDecimal vlDevolucaoCusta8, BigDecimal vlDevolucaoCusta9, BigDecimal vlDevolucaoCusta10) {
        this.pedido = pedido;
        this.protocolo = protocolo;
        this.servicos = servicos;
        this.vlDevolucaoCustas1 = vlDevolucaoCustas1;
        this.vlDevolucaoCusta2 = vlDevolucaoCusta2;
        this.vlDevolucaoCusta3 = vlDevolucaoCusta3;
        this.vlDevolucaoCusta4 = vlDevolucaoCusta4;
        this.vlDevolucaoCusta5 = vlDevolucaoCusta5;
        this.vlDevolucaoCusta6 = vlDevolucaoCusta6;
        this.vlDevolucaoCusta7 = vlDevolucaoCusta7;
        this.vlDevolucaoCusta8 = vlDevolucaoCusta8;
        this.vlDevolucaoCusta9 = vlDevolucaoCusta9;
        this.vlDevolucaoCusta10 = vlDevolucaoCusta10;
    }

    public MovimentacaoPedidoProtocolo() {
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Protocolo getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(Protocolo protocolo) {
        this.protocolo = protocolo;
    }

    public Set<MovimentacaoProtocoloServico> getServicos() {
        return servicos;
    }

    public void setServicos(Set<MovimentacaoProtocoloServico> servicos) {
        this.servicos = servicos;
    }

    public BigDecimal getVlDevolucaoCustas1() {
        return vlDevolucaoCustas1;
    }

    public void setVlDevolucaoCustas1(BigDecimal vlDevolucaoCustas1) {
        this.vlDevolucaoCustas1 = vlDevolucaoCustas1;
    }

    public BigDecimal getVlDevolucaoCusta2() {
        return vlDevolucaoCusta2;
    }

    public void setVlDevolucaoCusta2(BigDecimal vlDevolucaoCusta2) {
        this.vlDevolucaoCusta2 = vlDevolucaoCusta2;
    }

    public BigDecimal getVlDevolucaoCusta3() {
        return vlDevolucaoCusta3;
    }

    public void setVlDevolucaoCusta3(BigDecimal vlDevolucaoCusta3) {
        this.vlDevolucaoCusta3 = vlDevolucaoCusta3;
    }

    public BigDecimal getVlDevolucaoCusta4() {
        return vlDevolucaoCusta4;
    }

    public void setVlDevolucaoCusta4(BigDecimal vlDevolucaoCusta4) {
        this.vlDevolucaoCusta4 = vlDevolucaoCusta4;
    }

    public BigDecimal getVlDevolucaoCusta5() {
        return vlDevolucaoCusta5;
    }

    public void setVlDevolucaoCusta5(BigDecimal vlDevolucaoCusta5) {
        this.vlDevolucaoCusta5 = vlDevolucaoCusta5;
    }

    public BigDecimal getVlDevolucaoCusta6() {
        return vlDevolucaoCusta6;
    }

    public void setVlDevolucaoCusta6(BigDecimal vlDevolucaoCusta6) {
        this.vlDevolucaoCusta6 = vlDevolucaoCusta6;
    }

    public BigDecimal getVlDevolucaoCusta7() {
        return vlDevolucaoCusta7;
    }

    public void setVlDevolucaoCusta7(BigDecimal vlDevolucaoCusta7) {
        this.vlDevolucaoCusta7 = vlDevolucaoCusta7;
    }

    public BigDecimal getVlDevolucaoCusta8() {
        return vlDevolucaoCusta8;
    }

    public void setVlDevolucaoCusta8(BigDecimal vlDevolucaoCusta8) {
        this.vlDevolucaoCusta8 = vlDevolucaoCusta8;
    }

    public BigDecimal getVlDevolucaoCusta9() {
        return vlDevolucaoCusta9;
    }

    public void setVlDevolucaoCusta9(BigDecimal vlDevolucaoCusta9) {
        this.vlDevolucaoCusta9 = vlDevolucaoCusta9;
    }

    public BigDecimal getVlDevolucaoCusta10() {
        return vlDevolucaoCusta10;
    }

    public void setVlDevolucaoCusta10(BigDecimal vlDevolucaoCusta10) {
        this.vlDevolucaoCusta10 = vlDevolucaoCusta10;
    }
}

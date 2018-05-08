package br.com.lumera.financeiroback.entity.privado;

import br.com.lumera.financeiroback.entity.AbstractEntity;
import br.com.lumera.financeiroback.entity.FormaPagamento;
import br.com.lumera.financeiroback.entity.Usuario;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tb_movimentacao")
public class Movimentacao extends AbstractEntity {
    @NotNull
    private LocalDateTime criado;
    private String apresentante;
    @Column(name = "apresentante_documento")
    private String apresentanteDocumento;
    @Column(name = "vl_troco")
    private BigDecimal vlTroco;
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
    @Column(name = "vl_desconto_custa1")
    private BigDecimal vlDescontoCusta1;
    @Column(name = "vl_desconto_custa2")
    private BigDecimal vlDescontoCusta2;
    @Column(name = "vl_desconto_custa3")
    private BigDecimal vlDescontoCusta3;
    @Column(name = "vl_desconto_custa4")
    private BigDecimal vlDescontoCusta4;
    @Column(name = "vl_desconto_custa5")
    private BigDecimal vlDescontoCusta5;
    @Column(name = "vl_desconto_custa6")
    private BigDecimal vlDescontoCusta6;
    @Column(name = "vl_desconto_custa7")
    private BigDecimal vlDescontoCusta7;
    @Column(name = "vl_desconto_custa8")
    private BigDecimal vlDescontoCusta8;
    @Column(name = "vl_desconto_custa9")
    private BigDecimal vlDescontoCusta9;
    @Column(name = "vl_desconto_custa10")
    private BigDecimal vlDescontoCusta10;
    @OneToOne
    private Usuario usuario;
    @OneToOne
    private Cliente cliente;

    @OneToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name="movimentacao_id", nullable = false)
    @NotNull
    private Set<MovimentacaoPedidoProtocolo> pedidoProtocolo;
    @OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name="movimentacao_id", nullable = false)
    @NotNull
    private Set<MovimentacaoPagamento> pagamentos;


    public Movimentacao(@NotNull LocalDateTime criado, Cliente cliente, String apresentante, String apresentanteDocumento, BigDecimal vlTroco, BigDecimal vlDevolucaoCustas1, BigDecimal vlDevolucaoCusta2, BigDecimal vlDevolucaoCusta3, BigDecimal vlDevolucaoCusta4, BigDecimal vlDevolucaoCusta5, BigDecimal vlDevolucaoCusta6, BigDecimal vlDevolucaoCusta7, BigDecimal vlDevolucaoCusta8, BigDecimal vlDevolucaoCusta9, BigDecimal vlDevolucaoCusta10, BigDecimal vlDescontoCusta1, BigDecimal vlDescontoCusta2, BigDecimal vlDescontoCusta3, BigDecimal vlDescontoCusta4, BigDecimal vlDescontoCusta5, BigDecimal vlDescontoCusta6, BigDecimal vlDescontoCusta7, BigDecimal vlDescontoCusta8, BigDecimal vlDescontoCusta9, BigDecimal vlDescontoCusta10, @NotNull Usuario usuario, Set<MovimentacaoPedidoProtocolo> pedidoProtocolo, Set<MovimentacaoPagamento> pagamentos ) {
        this.criado = criado;
        this.apresentante = apresentante;
        this.cliente = cliente;
        this.apresentanteDocumento = apresentanteDocumento;
        this.vlTroco = vlTroco;
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
        this.vlDescontoCusta1 = vlDescontoCusta1;
        this.vlDescontoCusta2 = vlDescontoCusta2;
        this.vlDescontoCusta3 = vlDescontoCusta3;
        this.vlDescontoCusta4 = vlDescontoCusta4;
        this.vlDescontoCusta5 = vlDescontoCusta5;
        this.vlDescontoCusta6 = vlDescontoCusta6;
        this.vlDescontoCusta7 = vlDescontoCusta7;
        this.vlDescontoCusta8 = vlDescontoCusta8;
        this.vlDescontoCusta9 = vlDescontoCusta9;
        this.vlDescontoCusta10 = vlDescontoCusta10;
        this.usuario = usuario;
        this.pedidoProtocolo = pedidoProtocolo;
        this.pagamentos = pagamentos;
    }

    public Movimentacao() {
    }

    public LocalDateTime getCriado() {
        return criado;
    }

    public void setCriado(LocalDateTime criado) {
        this.criado = criado;
    }

    public String getApresentante() {
        return apresentante;
    }

    public void setApresentante(String apresentante) {
        this.apresentante = apresentante;
    }

    public String getApresentanteDocumento() {
        return apresentanteDocumento;
    }

    public void setApresentanteDocumento(String apresentanteDocumento) {
        this.apresentanteDocumento = apresentanteDocumento;
    }

    public BigDecimal getVlTroco() {
        return vlTroco;
    }

    public void setVlTroco(BigDecimal vlTroco) {
        this.vlTroco = vlTroco;
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

    public BigDecimal getVlDescontoCusta1() {
        return vlDescontoCusta1;
    }

    public void setVlDescontoCusta1(BigDecimal vlDescontoCusta1) {
        this.vlDescontoCusta1 = vlDescontoCusta1;
    }

    public BigDecimal getVlDescontoCusta2() {
        return vlDescontoCusta2;
    }

    public void setVlDescontoCusta2(BigDecimal vlDescontoCusta2) {
        this.vlDescontoCusta2 = vlDescontoCusta2;
    }

    public BigDecimal getVlDescontoCusta3() {
        return vlDescontoCusta3;
    }

    public void setVlDescontoCusta3(BigDecimal vlDescontoCusta3) {
        this.vlDescontoCusta3 = vlDescontoCusta3;
    }

    public BigDecimal getVlDescontoCusta4() {
        return vlDescontoCusta4;
    }

    public void setVlDescontoCusta4(BigDecimal vlDescontoCusta4) {
        this.vlDescontoCusta4 = vlDescontoCusta4;
    }

    public BigDecimal getVlDescontoCusta5() {
        return vlDescontoCusta5;
    }

    public void setVlDescontoCusta5(BigDecimal vlDescontoCusta5) {
        this.vlDescontoCusta5 = vlDescontoCusta5;
    }

    public BigDecimal getVlDescontoCusta6() {
        return vlDescontoCusta6;
    }

    public void setVlDescontoCusta6(BigDecimal vlDescontoCusta6) {
        this.vlDescontoCusta6 = vlDescontoCusta6;
    }

    public BigDecimal getVlDescontoCusta7() {
        return vlDescontoCusta7;
    }

    public void setVlDescontoCusta7(BigDecimal vlDescontoCusta7) {
        this.vlDescontoCusta7 = vlDescontoCusta7;
    }

    public BigDecimal getVlDescontoCusta8() {
        return vlDescontoCusta8;
    }

    public void setVlDescontoCusta8(BigDecimal vlDescontoCusta8) {
        this.vlDescontoCusta8 = vlDescontoCusta8;
    }

    public BigDecimal getVlDescontoCusta9() {
        return vlDescontoCusta9;
    }

    public void setVlDescontoCusta9(BigDecimal vlDescontoCusta9) {
        this.vlDescontoCusta9 = vlDescontoCusta9;
    }

    public BigDecimal getVlDescontoCusta10() {
        return vlDescontoCusta10;
    }

    public void setVlDescontoCusta10(BigDecimal vlDescontoCusta10) {
        this.vlDescontoCusta10 = vlDescontoCusta10;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Set<MovimentacaoPedidoProtocolo> getPedidoProtocolo() {
        if(this.pedidoProtocolo == null)
            pedidoProtocolo = new HashSet<>();
        return pedidoProtocolo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Set<MovimentacaoPagamento> getPagamentos() {
        if(this.pagamentos == null)
            pagamentos = new HashSet<>();
        return pagamentos;
    }
}

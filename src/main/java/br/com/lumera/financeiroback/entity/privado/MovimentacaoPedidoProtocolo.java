package br.com.lumera.financeiroback.entity.privado;

import br.com.lumera.financeiroback.entity.AbstractEntity;
import br.com.lumera.financeiroback.entity.Servico;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
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

    public MovimentacaoPedidoProtocolo(@NotNull Pedido pedido, @NotNull Protocolo protocolo, Set<MovimentacaoProtocoloServico> servicos) {
        this.pedido = pedido;
        this.protocolo = protocolo;
        this.servicos = servicos;
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
}

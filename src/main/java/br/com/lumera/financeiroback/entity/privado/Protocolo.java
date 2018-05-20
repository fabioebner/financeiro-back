package br.com.lumera.financeiroback.entity.privado;

import br.com.lumera.financeiroback.entity.AbstractEntity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "tb_protocolo")
public class Protocolo {
    @Id
    @NotEmpty
    private String id;
    @NotEmpty
    private String natureza;
    @NotNull
    private Long codigo;
    @NotNull
    private LocalDateTime criado;
    private LocalDateTime concluido;
    private LocalDateTime devolvido;
    private LocalDateTime finalizado;
    @Column(name = "valor_finalizado")
    private BigDecimal valorFinalizado;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="protocolo_id")
    private Set<ProtocoloServico> servicos;

    public Protocolo(String id) {
        this.id = id;
    }


    public Protocolo(@NotEmpty String id, @NotEmpty String natureza, @NotNull Long codigo, Set<ProtocoloServico> servicos) {
        this.id = id;
        this.natureza = natureza;
        this.codigo = codigo;
        this.criado = LocalDateTime.now();
        this.servicos = servicos;
    }

    public Protocolo() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNatureza() {
        return natureza;
    }

    public void setNatureza(String natureza) {
        this.natureza = natureza;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public LocalDateTime getCriado() {
        return criado;
    }

    public void setCriado(LocalDateTime criado) {
        this.criado = criado;
    }

    public LocalDateTime getConcluido() {
        return concluido;
    }

    public void setConcluido(LocalDateTime concluido) {
        this.concluido = concluido;
    }

    public LocalDateTime getDevolvido() {
        return devolvido;
    }

    public void setDevolvido(LocalDateTime devolvido) {
        this.devolvido = devolvido;
    }

    public LocalDateTime getFinalizado() {
        return finalizado;
    }

    public void setFinalizado(LocalDateTime finalizado) {
        this.finalizado = finalizado;
    }

    public BigDecimal getValorFinalizado() {
        return valorFinalizado;
    }

    public void setValorFinalizado(BigDecimal valorFinalizado) {
        this.valorFinalizado = valorFinalizado;
    }

    public Set<ProtocoloServico> getServicos() {
        return servicos;
    }

    public void setServicos(Set<ProtocoloServico> servicos) {
        this.servicos = servicos;
    }
}

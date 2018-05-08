package br.com.lumera.financeiroback.entity.privado;

import br.com.lumera.financeiroback.entity.AbstractEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "tb_pedido")
public class Pedido extends AbstractEntity {
    private LocalDateTime criado;
    @Column(name = "usuario_id")
    private Long usuario;
    private String identificacao;
    private String apresentante;
    @Column(name = "apresentante_documento")
    private String apresentanteDocumento;
    @OneToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name="pedido_id")
    private Set<Protocolo> protocolos;
    @OneToOne
    private Cliente cliente;

    public LocalDateTime getCriado() {
        return criado;
    }

    public void setCriado(LocalDateTime criado) {
        this.criado = criado;
    }

    public Long getUsuario() {
        return usuario;
    }

    public void setUsuario(Long usuario) {
        this.usuario = usuario;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
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

    public Set<Protocolo> getProtocolos() {
        return protocolos;
    }

    public void setProtocolos(Set<Protocolo> protocolos) {
        this.protocolos = protocolos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}

/*
SET SEARCH_PATH TO db_1;
SELECT ped.*,
(SELECT sum(coalesce(custas1,0)+
	coalesce(custas2,0)+
	coalesce(custas3,0)+
	coalesce(custas4,0)+
	coalesce(custas5,0)+
	coalesce(custas6,0)+
	coalesce(custas7,0)+
	coalesce(custas8,0)+
	coalesce(custas9,0)+
	coalesce(custas10,0)) FROM tb_protocolo_servico ps
JOIN tb_protocolo_servico_custas psc ON psc.protocolo_servico_id = ps.id
WHERE protocolo_id = prot.id
) as valor
 FROM tb_pedido ped
JOIN tb_protocolo prot ON prot.pedido_id = ped.id;

 */
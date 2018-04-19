package br.com.lumera.financeiroback.entity.privado;

import br.com.lumera.financeiroback.entity.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_pedido")
public class Pedido extends AbstractEntity {
    private LocalDateTime criacao;
    @Column(name = "instituicao_id")
    private Long instituicao;
    @Column(name = "usuario_id")
    private Long usuario;

    public LocalDateTime getCriacao() {
        return criacao;
    }

    public void setCriacao(LocalDateTime criacao) {
        this.criacao = criacao;
    }

    public Long getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(Long instituicao) {
        this.instituicao = instituicao;
    }

    public Long getUsuario() {
        return usuario;
    }

    public void setUsuario(Long usuario) {
        this.usuario = usuario;
    }
}

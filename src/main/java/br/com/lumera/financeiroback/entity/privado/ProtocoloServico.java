package br.com.lumera.financeiroback.entity.privado;

import br.com.lumera.financeiroback.entity.AbstractEntity;
import br.com.lumera.financeiroback.entity.Servico;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "tb_protocolo_servico")
public class ProtocoloServico extends AbstractEntity {

    @NotNull
    @Column(name = "valor_base")
    private BigDecimal valorBase;
    @NotNull
    @Column(name = "forma_calculo_id")
    private Long formaCalculo;
    @OneToOne
    @NotNull
    private Servico servico;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="protocolo_servico_id")
    private Set<ProtocoloServicoCustas> custas;

    public BigDecimal getValorBase() {
        return valorBase;
    }

    public void setValorBase(BigDecimal valorBase) {
        this.valorBase = valorBase;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public Set<ProtocoloServicoCustas> getCustas() {
        return custas;
    }

    public void setCustas(Set<ProtocoloServicoCustas> custas) {
        this.custas = custas;
    }

    public Long getFormaCalculo() {
        return formaCalculo;
    }

    public void setFormaCalculo(Long formaCalculo) {
        this.formaCalculo = formaCalculo;
    }
}

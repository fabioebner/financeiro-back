package br.com.lumera.financeiroback.vo;

import javax.validation.constraints.Size;
import java.util.List;

public class PedidoVO {
    private Long clienteId;
    private String apresentante;
    private String apresentanteDocumento;
    private String identificador;

    @Size(min = 1)
    List<RetornoCalculoTabela> servicos;

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
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

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public List<RetornoCalculoTabela> getServicos() {
        return servicos;
    }

    public void setServicos(List<RetornoCalculoTabela> servicos) {
        this.servicos = servicos;
    }
}

package br.com.lumera.financeiroback.vo.privado;

import java.util.List;

public class MovimentacaoVo {
    private ReciboVo recibo;
    private List<Long> pedidos;
    private List<PagamentoVO> pagamentos;

    public ReciboVo getRecibo() {
        return recibo;
    }

    public void setRecibo(ReciboVo recibo) {
        this.recibo = recibo;
    }

    public List<Long> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Long> pedidos) {
        this.pedidos = pedidos;
    }

    public List<PagamentoVO> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(List<PagamentoVO> pagamentos) {
        this.pagamentos = pagamentos;
    }
}

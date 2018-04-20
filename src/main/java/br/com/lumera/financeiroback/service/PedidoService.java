package br.com.lumera.financeiroback.service;

import br.com.lumera.financeiroback.entity.privado.Pedido;
import br.com.lumera.financeiroback.repository.PedidoRepository;
import br.com.lumera.financeiroback.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> findAll(){
        return pedidoRepository.findAll();
    }
}

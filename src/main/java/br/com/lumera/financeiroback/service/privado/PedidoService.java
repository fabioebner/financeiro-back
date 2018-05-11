package br.com.lumera.financeiroback.service.privado;

import br.com.lumera.financeiroback.controller.exceptions.NotFoundException;
import br.com.lumera.financeiroback.entity.privado.Pedido;
import br.com.lumera.financeiroback.entity.privado.ViewPedido;
import br.com.lumera.financeiroback.repository.privado.PedidoRepository;
import br.com.lumera.financeiroback.repository.ViewPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private ViewPedidoRepository viewPedidoRepository;

    public List<ViewPedido> findAll(){
        return viewPedidoRepository.findAll();
    }

    public Pedido findById(Long id) {
        Optional<Pedido> retorno = pedidoRepository.findById(id);
        if (retorno.isPresent()) {
            return retorno.get();
        } else{
            throw new NotFoundException("Pedido não encontrado: " + id);
        }

    }
}

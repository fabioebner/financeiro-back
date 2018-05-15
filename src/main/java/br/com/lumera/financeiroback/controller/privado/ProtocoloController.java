package br.com.lumera.financeiroback.controller.privado;

import br.com.lumera.financeiroback.entity.Servico;
import br.com.lumera.financeiroback.entity.privado.ProtocoloServico;
import br.com.lumera.financeiroback.enuns.Natureza;
import br.com.lumera.financeiroback.service.ServicoService;
import br.com.lumera.financeiroback.service.privado.ProtocoloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/protocolo")
public class ProtocoloController {

    @Autowired private ProtocoloService protocoloService;
    @Autowired private ServicoService servicoService;

    @GetMapping("/{servicoId}/{numeroProtocolo}/")
    public boolean verificaProtocolo(@PathVariable  Long servicoId, @PathVariable Long numeroProtocolo){
        Servico servico = servicoService.findById(servicoId);
        String protocolo = protocoloService.gerarProtocolo(Natureza.recuperaNome(servico.getCartorioNatureza().intValue()), numeroProtocolo, servico.isCertidao());
        return protocoloService.existsById(protocolo);
    }
}

package br.com.lumera.financeiroback.service.privado;


import br.com.lumera.financeiroback.entity.privado.ProtocoloDepositoPrevio;
import br.com.lumera.financeiroback.repository.privado.ProtocoloDepositoPrevioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Service
public class ProtocoloDepositoPrevioService {
    @Autowired private ProtocoloDepositoPrevioRepository protocoloDepositoPrevioRepository;

    public ProtocoloDepositoPrevio addDepositoPrevio(String protocoloId, BigDecimal valor, Long movimentacaoId) {
        ProtocoloDepositoPrevio depositoPrevio = new ProtocoloDepositoPrevio(protocoloId, movimentacaoId, LocalDateTime.now(), valor);
        return this.protocoloDepositoPrevioRepository.save(depositoPrevio);
    }
}

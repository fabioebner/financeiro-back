package br.com.lumera.financeiroback.service.privado;

import br.com.lumera.financeiroback.enuns.Natureza;
import br.com.lumera.financeiroback.repository.privado.ProtocoloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class ProtocoloService {
    @Autowired
    private ProtocoloRepository protocoloRepository;

    public String gerarProtocolo(Natureza natureza, Long protocolo, boolean icCertidao){
        if(protocolo == null){
            protocolo = Calendar.getInstance().getTimeInMillis();
        }
        if(natureza.equals(Natureza.FIRMAS)){
            return "FI-" + protocolo;
        }else if(natureza.equals(Natureza.NOTAS)){
            return "TN-" + protocolo;
        }else if(natureza.equals(Natureza.PROTESTO)){
            return "PT-" + protocolo;
        }else if(natureza.equals(Natureza.REGISTRO_IMOVEIS)){
            if(icCertidao){
                return "PC-"+protocolo;
            }
            return "PP-" + protocolo;
        }else if(natureza.equals(Natureza.REGISTRO_CIVIL)){
            return "RC-" + protocolo;
        }else if(natureza.equals(Natureza.REGISTRO_CIVIL_PJ)){
            return "PJ-" + protocolo;
        }else if (natureza.equals(Natureza.TITULOS_DOCUMENTO_PJ)){
            return "TD-" + protocolo;
        }
        return null;
    }

    public boolean existsById(String protocolo) {
        return protocoloRepository.existsById(protocolo);
    }

}

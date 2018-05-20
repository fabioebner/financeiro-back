package br.com.lumera.financeiroback.service;

import br.com.lumera.financeiroback.controller.exceptions.NotFoundException;
import br.com.lumera.financeiroback.util.Utils;
import br.com.lumera.financeiroback.vo.FormaCalculo;
import br.com.lumera.financeiroback.vo.RetornoCalculoTabela;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Service
public class TabelaCustaService {
    @Autowired
    private RestTemplate restTemplate;
    @Value("${urlTabelaCustas}")
    private String urlTabelaCustas;

    public List<FormaCalculo> getFormaCalculo() throws Exception {
        try {
            ResponseEntity<FormaCalculo[]> responseEntity = restTemplate.getForEntity(this.urlTabelaCustas+"/divisores/", FormaCalculo[].class);
            return Arrays.asList(responseEntity.getBody());
        } catch (HttpClientErrorException e) {
            throw new Exception("Não foi possível se conectar com o servidor: " + urlTabelaCustas);
        }
    }


    public RetornoCalculoTabela calcularServico(String estado, String natureza, String tabela, BigDecimal valor, Integer quantidade, Integer cdDivisor, Integer qtdDivisor, LocalDate dtTabela, String nomeServico, Long servicoId, boolean certidao) throws NotFoundException {
        try {
            String urlTabela = null;
            if(dtTabela == null){
                dtTabela = LocalDate.now();
            }
            RetornoCalculoTabela retorno = null;
            urlTabela = this.urlTabelaCustas+"/tabelacustas/descritiva?uf="+estado+"&natureza="+natureza+"&tabela="+tabela+"&valor="+valor+"&qtd="+quantidade+"&cdDivisor="+cdDivisor+"&qtdDivisor="+qtdDivisor+"&data="+Utils.formataDataTabelaCustas(dtTabela);
            retorno = restTemplate.getForObject(urlTabela, RetornoCalculoTabela.class);

            retorno.setNatureza(natureza);
            retorno.setNomeServico(nomeServico);
            retorno.setCertidao(certidao);
            retorno.setServicoId(servicoId);
            return retorno;
        } catch (HttpClientErrorException e) {
            throw  new NotFoundException("Erro ao calcular Tabela de custas: Natureza: " + natureza + " , tabela: " + tabela + " , data: "+Utils.formataDataTabelaCustas(dtTabela) + " ,  valor: " + valor);
        }catch (HttpServerErrorException ex){
            throw  new NotFoundException("Erro ao calcular Tabela de custas: Natureza: " + natureza + " , tabela: " + tabela + " , data: "+Utils.formataDataTabelaCustas(dtTabela) + " ,  valor: " + valor);
        }
    }
}

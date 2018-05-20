package br.com.lumera.financeiroback.controller;

import br.com.lumera.financeiroback.entity.Instituicao;
import br.com.lumera.financeiroback.entity.Servico;
import br.com.lumera.financeiroback.enuns.Natureza;
import br.com.lumera.financeiroback.service.InstituicaoService;
import br.com.lumera.financeiroback.service.ServicoService;
import br.com.lumera.financeiroback.service.TabelaCustaService;
import br.com.lumera.financeiroback.util.TokenUtil;
import br.com.lumera.financeiroback.vo.CalcularServico;
import br.com.lumera.financeiroback.vo.RetornoCalculoTabela;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/servico")
public class ServicoController {
    @Autowired private ServicoService servicoService;
    @Autowired private TabelaCustaService tabelaCustaService;
    @Autowired private InstituicaoService instituicaoService;
    @Autowired
    TokenUtil tokenUtil;

    @PutMapping("/")
    public Servico save(@RequestBody @Valid  Servico servico){
        return servicoService.save(servico);
    }

    @GetMapping("/{cartorioNatureza}/")
    public Page<Servico> findByCartorioNatureza(@PathVariable Long cartorioNatureza, @PageableDefault(sort = { "nome"}, direction = Sort.Direction.ASC) Pageable page){
        return servicoService.findByCartorioNatureza(cartorioNatureza, page);
    }

    @PostMapping("/calcular/")
    public RetornoCalculoTabela calcularServico(@RequestBody  CalcularServico calcularServico){
        Long instituicaoId =  new Long((Integer) tokenUtil.recuperarVariavelToken("instituicaoId"));
        Servico servico = servicoService.findById(calcularServico.getIdServico());
        Instituicao instituicao = instituicaoService.findById(instituicaoId);
        return tabelaCustaService.calcularServico(instituicao.getEstado(),
                Natureza.findByCodigo(servico.getCartorioNatureza().intValue()).getNome(),
                servico.getTabelaCusta(),
                calcularServico.getValorInformado(),
                calcularServico.getQuantidade(),
                calcularServico.getDivisorId(),
                calcularServico.getQuantidadeDivisor(),
                calcularServico.getDataTabela(),
                servico.getNome(),
                servico.getId(),
                servico.isCertidao()
        );
    }

}

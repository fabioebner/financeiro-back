package br.com.lumera.financeiroback.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_servico")
public class Servico extends AbstractEntity{
    @NotEmpty
    private String nome;
    @NotEmpty
    private String tabelaCusta;
    @NotNull
    private boolean depositoPrevio;
    @NotNull
    private boolean certidao;
    @NotEmpty
    private String categoria;
    @Column(name = "cd_cartorio_natureza")
    @NotNull
    private Long cartorioNatureza;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTabelaCusta() {
        return tabelaCusta;
    }

    public void setTabelaCusta(String tabelaCusta) {
        this.tabelaCusta = tabelaCusta;
    }

    public boolean isDepositoPrevio() {
        return depositoPrevio;
    }

    public void setDepositoPrevio(boolean depositoPrevio) {
        this.depositoPrevio = depositoPrevio;
    }

    public boolean isCertidao() {
        return certidao;
    }

    public void setCertidao(boolean certidao) {
        this.certidao = certidao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Long getCartorioNatureza() {
        return cartorioNatureza;
    }

    public void setCartorioNatureza(Long cartorioNatureza) {
        this.cartorioNatureza = cartorioNatureza;
    }
}

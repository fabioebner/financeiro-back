package br.com.lumera.financeiroback.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "tb_forma_pagamento")
public class FormaPagamento extends  AbstractEntity{
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}

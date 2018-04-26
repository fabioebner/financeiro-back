package br.com.lumera.financeiroback.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "tb_forma_pagamento")
public class FormaPagamento extends  AbstractEntity{
    private String nome;
    private boolean credito;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isCredito() {
        return credito;
    }

    public void setCredito(boolean credito) {
        this.credito = credito;
    }
}

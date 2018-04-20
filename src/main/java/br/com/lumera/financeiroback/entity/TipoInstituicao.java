package br.com.lumera.financeiroback.entity;

import br.com.lumera.financeiroback.view.View;
import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_tipo_instituicao", schema = "public")
public class TipoInstituicao extends AbstractEntity{
    @JsonView(View.Bootstrap.class)
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
package br.com.lumera.financeiroback.entity;

import br.com.lumera.financeiroback.view.View;
import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_instituicao", schema = "public")
public class Instituicao extends  AbstractEntity{
    @JsonView(View.Bootstrap.class)
    private String nome;
    private LocalDateTime cadastro;
    @NotEmpty
    @Column(name = "nome_schema")
    private String nomeSchema;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getCadastro() {
        return cadastro;
    }

    public void setCadastro(LocalDateTime cadastro) {
        this.cadastro = cadastro;
    }

    public String getNomeSchema() {
        return nomeSchema;
    }

    public void setNomeSchema(String nomeSchema) {
        this.nomeSchema = nomeSchema;
    }
}

package com.estelamaria.orange.regist.addr.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "endereco")
@JsonPropertyOrder ({"id", "cep", "logradouro", "numero", "complemento", "bairro", "cidade", "estado"})
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @JsonProperty("cep")
    @NotNull
    @NotEmpty(message = "Campo CEP não pode ser vazio.")
    private String cep;

    @JsonProperty("logradouro")
    @NotNull
    @NotEmpty(message = "Campo logradouro não pode ser vazio.")
    private String logradouro;

    @JsonProperty("numero")
    @NotNull
    @NotEmpty(message = "Campo número não pode ser vazio.")
    private Integer numero;

    @JsonProperty("complemento")
    private String complemento;

    @JsonProperty("bairro")
    @NotNull
    @NotEmpty(message = "Campo bairro não pode ser vazio.")
    private String bairro;

    @JsonProperty("cidade")
    @NotNull
    @NotEmpty(message = "Campo cidade não pode ser vazio.")
    private String cidade;

    @JsonProperty("estado")
    @NotNull
    @NotEmpty(message = "Campo estado não pode ser vazio.")
    private String estado;

    @ManyToOne
    @JsonIgnore
    private Usuario usuario;

    //Getters e Setters
    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}

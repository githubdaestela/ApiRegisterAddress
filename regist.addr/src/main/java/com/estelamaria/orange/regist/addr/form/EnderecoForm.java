package com.estelamaria.orange.regist.addr.form;

import com.estelamaria.orange.regist.addr.model.Endereco;
import com.estelamaria.orange.regist.addr.repository.EnderecoRepository;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class EnderecoForm {

    //Atributos
    @JsonIgnoreProperties("cep")
    @NotNull
    private String cep;

    @NotNull
    private Integer numero;

    private String complemento;

    //Métodos
    public void cadastrar(Endereco endereco, EnderecoForm form, EnderecoRepository repository) {
        if(form.getComplemento() != null) {
            endereco.setComplemento(complemento);
        }
        endereco.setNumero(numero);
        repository.save(endereco);
    }

    //Getters e Setters
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
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
}

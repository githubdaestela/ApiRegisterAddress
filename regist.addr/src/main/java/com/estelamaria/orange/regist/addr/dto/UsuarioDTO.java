package com.estelamaria.orange.regist.addr.dto;

import com.estelamaria.orange.regist.addr.model.Endereco;
import com.estelamaria.orange.regist.addr.model.Usuario;

import java.time.LocalDate;
import java.util.List;

public class UsuarioDTO {

    //Atributos
    private String nomeUsuario;
    private String emailUsuario;
    private String cpfUsuario;
    private LocalDate dataNascimentoUsuario;
    private List<Endereco> endereco;

    //Métodos
    public UsuarioDTO(String nomeUsuario, String emailUsuario, String cpfUsuario, LocalDate dataNascimentoUsuario, List<Endereco> endereco) {
        this.nomeUsuario = nomeUsuario;
        this.emailUsuario = emailUsuario;
        this.cpfUsuario = cpfUsuario;
        this.dataNascimentoUsuario = dataNascimentoUsuario;
        this.endereco = endereco;
    }

    public UsuarioDTO(Usuario usuario) {
    }

    //Getters e Setters
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getCpfUsuario() {
        return cpfUsuario;
    }

    public void setCpfUsuario(String cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }

    public LocalDate getDataNascimentoUsuario() {
        return dataNascimentoUsuario;
    }

    public void setDataNascimentoUsuario(LocalDate dataNascimentoUsuario) {
        this.dataNascimentoUsuario = dataNascimentoUsuario;
    }

    public List<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }
}
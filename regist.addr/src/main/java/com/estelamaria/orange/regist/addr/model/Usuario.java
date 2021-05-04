package com.estelamaria.orange.regist.addr.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name = "usuario")
public class Usuario {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String nomeUsuario;

    @Column(unique = true)
    @NotNull
    @Email
    private String emailUsuario;

    @Column(unique = true)
    @NotNull
    private String cpfUsuario;

    @Column(unique = true)
    @NotNull
    @JsonFormat(pattern = "dd-mm-yyyy")
    private LocalDate dataNascimentoUsuario;

    @OneToMany(mappedBy = "usuario")
    @JsonIgnoreProperties("usuario")
    private List<Endereco> endereco;

    //Getters e Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

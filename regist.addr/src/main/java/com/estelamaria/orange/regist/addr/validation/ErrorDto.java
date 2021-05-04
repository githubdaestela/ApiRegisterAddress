package com.estelamaria.orange.regist.addr.validation;

public class ErrorDto {

    //Atributos
    private String campo;
    private String mensagem;

    //Método
    public ErrorDto(String field, String mensagem) {
        super();
        this.campo = campo;
        this.mensagem = mensagem;
    }

    //Getters e Setters
    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}

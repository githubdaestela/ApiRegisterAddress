package com.estelamaria.orange.regist.addr.service;

import com.estelamaria.orange.regist.addr.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(url="https://viacep.com.br/ws/", name= "viacep")
public interface ViaCepService {

        @GetMapping("{cep}/json")
        Endereco getEndereco(@PathVariable("cep")String cep);
}

package com.estelamaria.orange.regist.addr.service;

import com.estelamaria.orange.regist.addr.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@RestController
@FeignClient(url="https://viacep.com.br", name="viacep")
public class ViaCepService implements Serializable {


        @GetMapping("{cep}/json")
        public ResponseEntity<Endereco> getEndereco(@PathVariable("cep") String cep) {
        RestTemplate restTemplate = new RestTemplate();
        String uri = "http://viacep.com.br/ws/{cep}/json/";
        Map<String, String> params = new HashMap<String, String>();
        params.put("cep", cep);
        Endereco endereco = restTemplate.getForObject(uri, Endereco.class, params);
        return new ResponseEntity<Endereco>(endereco, HttpStatus.OK);
    }

}

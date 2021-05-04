package com.estelamaria.orange.regist.addr.controller;

import com.estelamaria.orange.regist.addr.dto.UsuarioDTO;
import com.estelamaria.orange.regist.addr.form.EnderecoForm;
import com.estelamaria.orange.regist.addr.model.Endereco;
import com.estelamaria.orange.regist.addr.model.Usuario;
import com.estelamaria.orange.regist.addr.repository.EnderecoRepository;
import com.estelamaria.orange.regist.addr.repository.UsuarioRepository;
import com.estelamaria.orange.regist.addr.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import javax.validation.Valid;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@EnableFeignClients(basePackages = {"com.estelamaria.orange.regist.addr.service","com.estelamaria.orange.regist.addr.controller"})
public class EnderecoController {

    @Autowired
    EnderecoRepository enderecoRepository;

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    ViaCepService viacep;

    @PostMapping("/endereco/{id}")
    public ResponseEntity<UsuarioDTO> cadastrar(@RequestBody @Valid EnderecoForm form, @PathVariable Long id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        if(usuario.isPresent()) {
            Endereco endereco = viacep.getEndereco(form.getCep());
            endereco.setUsuario(usuario.get());
            endereco.setNumero(form.getNumero());
            System.out.print(endereco);
            form.cadastrar(endereco, form, enderecoRepository);
            return ResponseEntity.status(HttpStatus.CREATED).body(new UsuarioDTO(usuario.get()));
        } return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
}

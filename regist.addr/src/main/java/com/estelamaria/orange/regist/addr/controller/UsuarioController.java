package com.estelamaria.orange.regist.addr.controller;

import com.estelamaria.orange.regist.addr.dto.UsuarioDTO;
import com.estelamaria.orange.regist.addr.model.Usuario;
import com.estelamaria.orange.regist.addr.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import javax.validation.Valid;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
//@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioRepository repository;

    @PostMapping("/cadastrar")
    public ResponseEntity<UsuarioDTO> cadastrar(@RequestBody @Valid Usuario usuario){
        repository.save(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(new UsuarioDTO(usuario));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioDTO> consultar(@PathVariable Long id) {
        Optional<Usuario> usuario = repository.findById(id);
        if (usuario.isPresent()) {
            return ResponseEntity.ok(new UsuarioDTO(usuario.get()));
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Verifique o ID do usuário!");
    }
}
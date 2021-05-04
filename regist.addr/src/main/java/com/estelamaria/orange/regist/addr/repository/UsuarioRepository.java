package com.estelamaria.orange.regist.addr.repository;

import com.estelamaria.orange.regist.addr.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}

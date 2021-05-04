package com.estelamaria.orange.regist.addr.repository;

import com.estelamaria.orange.regist.addr.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}






package br.com.cadastroclientes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.cadastroclientes.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, String>{
	
}


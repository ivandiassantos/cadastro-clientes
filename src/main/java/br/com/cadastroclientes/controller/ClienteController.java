package br.com.cadastroclientes.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.cadastroclientes.model.Cliente;
import br.com.cadastroclientes.service.ClienteService;

@RestController
@RequestMapping(value = "/v1/cliente", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class ClienteController {
	@Autowired
	private ClienteService clienteService;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Cliente> cadastrar(@RequestBody Cliente cliente){
		clienteService.salvar(cliente);
		return new ResponseEntity<Cliente>(cliente, HttpStatus.CREATED);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Cliente> listar(){
		return clienteService.listar();
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "{cpf}")
	public ResponseEntity<Cliente> obterPor(@PathVariable String cpf){
		Optional<Cliente> cliente = clienteService.obterPor(cpf);
		if(cliente.isPresent()) {			
			return ResponseEntity.ok(cliente.get());
		}
		return new ResponseEntity<Cliente>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<Cliente> atualizar(Cliente cliente){
		clienteService.atualizar(cliente);
		return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
	}
}

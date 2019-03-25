package br.com.cadastroclientes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.cadastroclientes.model.Cliente;
import br.com.cadastroclientes.service.ClienteService;

@RestController
@RequestMapping("/v1/cliente")
public class ClienteController {
	@Autowired
	private ClienteService clienteService;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Cliente> cadastrar(Cliente cliente){
		clienteService.salvar(cliente);
		return new ResponseEntity<Cliente>(cliente, HttpStatus.CREATED);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Cliente>> listar(){
		return new ResponseEntity<List<Cliente>>(clienteService.listar(), HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<Cliente> atualizar(Cliente cliente){
		clienteService.atualizar(cliente);
		return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
	}
}
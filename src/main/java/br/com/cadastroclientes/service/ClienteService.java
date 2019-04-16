package br.com.cadastroclientes.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.cadastroclientes.model.Cliente;
import br.com.cadastroclientes.model.Telefone;
import br.com.cadastroclientes.repository.ClienteRepository;
import br.com.cadastroclientes.repository.TelefoneRepository;

@Service("clienteService")
@Transactional
public class ClienteService {
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private TelefoneRepository telefoneRepository;
	
	public void salvar(Cliente cliente) {
		clienteRepository.save(cliente);
		//salvarTelefones(cliente.getTelefones(), cliente);
	}

	public void salvarTelefones(List<Telefone> telefones, Cliente cliente) {
		telefones.forEach((telefone) -> telefone.setCliente(cliente));
		telefoneRepository.saveAll(telefones);
	}


	public List<Cliente> listar() {
		List<Cliente> clientes = new ArrayList<>();
		clienteRepository.findAll().forEach(clientes::add);
		return clientes;
	}

	public void atualizar(Cliente cliente) {
		clienteRepository.save(cliente);
	}
}

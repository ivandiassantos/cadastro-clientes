package br.com.cadastroclientes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.cadastroclientes.model.Cliente;
import br.com.cadastroclientes.repository.ClienteRepository;
import br.com.cadastroclientes.repository.EnderecoRepository;
import br.com.cadastroclientes.repository.TelefoneRepository;

@Service("clienteService")
@Transactional
public class ClienteService {
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;
	@Autowired
	private TelefoneRepository telefoneRepository;
	
	public void salvar(Cliente cliente) {
		clienteRepository.save(cliente);
		enderecoRepository.save(cliente.getEndereco());
		telefoneRepository.saveAll(cliente.getTelefones());
	}

	public List<Cliente> listar() {
		return (List<Cliente>) clienteRepository.findAll();
	}

	public void atualizar(Cliente cliente) {
		clienteRepository.save(cliente);
	}
}

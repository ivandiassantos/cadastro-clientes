package br.com.cadastroclientes.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable{
	
	private static final long serialVersionUID = -1790865967379554123L;
	
	@Id
	@Column(name = "cpf")
	private String cpf;
	@Column(name = "nome")
	private String nome;
	@OneToOne(fetch = FetchType.LAZY)
	private Endereco endereco;
	@OneToMany(fetch = FetchType.LAZY)
	private List<Telefone> telefones;
	
	public String getCpf() {
		return cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public List<Telefone> getTelefones() {
		return telefones;
	}
}

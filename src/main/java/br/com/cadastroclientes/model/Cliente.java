package br.com.cadastroclientes.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

	private static final long serialVersionUID = -1790865967379554123L;

	@Id
	@Column(name = "cpf")
	private String cpf;
	@Column(name = "nome")
	private String nome;
	@Column(name = "cep")
	private String cep;
	@Column(name = "logradouro")
	private String logradouro;
	@Column(name = "complemento")
	private String complemento;
	@Column(name = "numero")
	private String numero;
	@Column(name = "bairro")
	private String bairro;
	@Column(name = "cidade")
	private String cidade;
	@Column(name = "uf")
	private String uf;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
	private List<Telefone> telefones;

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public String getCep() {
		return cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public String getNumero() {
		return numero;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getUf() {
		return uf;
	}

}

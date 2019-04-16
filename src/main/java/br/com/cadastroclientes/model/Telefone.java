package br.com.cadastroclientes.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "telefone_cliente")
public class Telefone implements Serializable{
	
	private static final long serialVersionUID = 6004271213771611743L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_telefone")
	private Long idTelefone;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cpf")
	private Cliente cliente;
	@Column(name = "numero")
	private String numero;
	@Column(name = "tipo_telefone")
	private Integer tipoTelefone;

	public Long getIdTelefone() {
		return idTelefone;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public String getNumero() {
		return numero;
	}

	public Integer getTipoTelefone() {
		return tipoTelefone;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}

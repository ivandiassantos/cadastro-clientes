package br.com.cadastroclientes.model;

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
@Table(name = "telefone")
public class Telefone {
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
	
	
}

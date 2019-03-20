package br.com.cadastroclientes.enums;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum TipoTelefone {

    RESIDENCIAL(1, "Residencial"),
    CELULAR(2, "Celular"),
    COMERCIAL(3, "Comercial");
    
    private Integer id;
    private String descricao;

    private TipoTelefone(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
    
    public Integer getId() {
        return id;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
}

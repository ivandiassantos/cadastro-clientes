package br.com.cadastroclientes.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.cadastroclientes.enums.TipoTelefone;

@RestController
@RequestMapping("/v1/tipoTelefone")
public class TipoTelefoneController {
    
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<TipoTelefone> obterTiposTelefone() {
        return Arrays.asList(TipoTelefone.values());
    }
    
}

package br.com.cadastroclientes.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.cadastroclientes.enums.UF;

@RestController
@RequestMapping("/v1/uf")
public class UFController {
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<UF> obterUfs() {
        return Arrays.asList(UF.values());
    }
}

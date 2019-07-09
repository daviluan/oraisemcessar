package br.com.dlc.oraisemcessar.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    @GetMapping("/quemOuve")
    public String getQuemOuveOsPedidos() {
        return "O nosso grande Deus e Pai, por meio de Seu Filho Jesus Cristo.";
    }
}

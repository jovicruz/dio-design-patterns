package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.FactoryPagamento;
import com.example.demo.Pagamento;

@RestController
public class PagamentoController {
    @Autowired
    private FactoryPagamento factoryPagamento;

    @GetMapping("/pagar/{tipo}")
    public String processarPagamento(@PathVariable String tipo) {
        //Cria a instancia de pagamento conforme o tipo digitado
        Pagamento pagamento = factoryPagamento.criarPagamento(tipo);
        return pagamento.processar();
    }
}

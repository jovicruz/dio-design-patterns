package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class FactoryPagamento {
    public Pagamento criarPagamento(String tipo) {
        switch (tipo.toUpperCase()) {
            case "CARTAO":
                return new PagamentoCartaoCredito();
            case "PIX":
                return new PagamentoPix();
            case "BOLETO":
                return new PagamentoBoleto();
            default:
                throw new IllegalArgumentException("Digite um tipo válido!");
        }
    }
}

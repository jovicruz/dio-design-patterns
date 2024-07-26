package com.example.demo;

public class PagamentoCartaoCredito implements Pagamento {
    @Override
    public String processar() {
        return "Pagamento realizado com cartão de crédito.";
    }
}
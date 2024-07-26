package com.example.demo;

public class PagamentoBoleto implements Pagamento {
    @Override
    public String processar() {
        return "Pagamento realizado com boleto.";
    }
}

package com.example.demo;

public class PagamentoPix implements Pagamento {
    @Override
    public String processar() {
        return "Pagamento realizado com Pix.";
    }
}

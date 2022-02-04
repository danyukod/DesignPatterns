package br.com.patterns.chainofresponsability;

public class DescontoPorVendaCasada implements Desconto{

    private Desconto proximo;

    @Override
    public double desconta(Orcamento orcamento) {
        if (orcamento.contemItemDeNome("LAPIS") && orcamento.contemItemDeNome("CANETA"))
            return orcamento.getValor() * 0.05;
        else {
            return proximo.desconta(orcamento);
        }
    }

    @Override
    public void setProximo(Desconto desconto) {
        this.proximo = desconto;
    }

}

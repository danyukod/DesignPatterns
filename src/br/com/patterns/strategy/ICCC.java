package br.com.patterns.strategy;

public class ICCC implements Imposto {

    @Override
    public double calcula(Orcamento orcamento) {
        if(orcamento.getValor() < 1000.0)
            return orcamento.getValor() * 0.05;
        else if(orcamento.getValor() <= 3000.0)
            return orcamento.getValor() * 0.07;
        else
            return (orcamento.getValor() * 0.008) + 30.0;
    }
}

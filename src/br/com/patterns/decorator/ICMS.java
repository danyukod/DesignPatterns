package br.com.patterns.decorator;

public class ICMS extends Imposto {

    public ICMS(Imposto outroImposto) {
        super(outroImposto);
    }

    public ICMS() {
    }

    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.1 + calculaDoOutroImposto(orcamento);
    }

}

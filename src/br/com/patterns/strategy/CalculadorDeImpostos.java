package br.com.patterns.strategy;

public class CalculadorDeImpostos {

    public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
        System.out.println("Imposto: "+ imposto.calcula(orcamento) + " "+ imposto.getClass().getName());
    }

}

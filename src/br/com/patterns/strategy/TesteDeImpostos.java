package br.com.patterns.strategy;

public class TesteDeImpostos {

    public static void main(String[] args) {

        Imposto iss = new ISS();
        Imposto icms = new ICMS();
        Imposto iccc = new ICCC();

        Orcamento orcamento = new Orcamento(500.0);

        CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();

        calculadorDeImpostos.realizaCalculo(orcamento, iss);
        calculadorDeImpostos.realizaCalculo(orcamento, icms);
        calculadorDeImpostos.realizaCalculo(orcamento, iccc);


    }


}

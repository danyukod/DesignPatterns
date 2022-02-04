package br.com.patterns.templatemethod;

public class TesteDeImpostos {

    public static void main(String[] args) {
        Imposto icpp = new ICPP();
        Imposto ikvc = new IKCV();
        Imposto ihit = new IHIT();

        Orcamento orcamento = new Orcamento(500.0);
        orcamento.adicionaItem(new Item("TESTE", 10.00));
        orcamento.adicionaItem(new Item("TESTE", 10.00));

        CalculadorDeImpostos calculador = new CalculadorDeImpostos();

        // Calculando o ISS
        calculador.realizaCalculo(orcamento, icpp);

        // Calculando o ICMS
        calculador.realizaCalculo(orcamento, ikvc);

        //Calculando o IHIT
        calculador.realizaCalculo(orcamento, ihit);

    }

}

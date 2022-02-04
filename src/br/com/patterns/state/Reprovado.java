package br.com.patterns.state;

public class Reprovado implements EstadoDeUmOrcamento{


    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        throw new RuntimeException("Somente orcamento em aprovação ou aprovados recebem desconto extra.");
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamentos reprovados não podem ser aprovados.");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamentos reprovados não podem ser reprovados novamente.");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        orcamento.estadoAtual = new Finalizado();
    }
}

package br.com.patterns.state;

public class Aprovado implements EstadoDeUmOrcamento {

    private boolean descontoAplicado = false;

    public void aplicaDescontoExtra(Orcamento orcamento){
        if(!descontoAplicado){
            orcamento.valor -= orcamento.valor * 0.02;
            descontoAplicado = true;
        }else{
            throw new RuntimeException("Deconto ja aplicado");
        }
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já está aprovado");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento aprovado não pode ser reprovado.");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        orcamento.estadoAtual = new Finalizado();
    }

}

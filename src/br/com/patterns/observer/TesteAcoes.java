package br.com.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class TesteAcoes {

    public static void main(String[] args) {

        List<AcaoAposGerarNota> observadores = new ArrayList<>();

        observadores.add(new EnviadorDeEmail());
        observadores.add(new NotaFiscalDao());
        observadores.add(new EnviadorDeSms());
        observadores.add(new Impressora());

        NotaFiscalBuilder builder = new NotaFiscalBuilder(observadores);

        ItemDaNotaBuilder itemDaNotaBuilder = new ItemDaNotaBuilder();

        builder.paraEmpresa("Caelum ensino e Inovação")
                .comCnpj("12.345.678/0001-12")
                .comItem(itemDaNotaBuilder.comDescricao("Item 1").comValor(200.0).constroi())
                .comItem(itemDaNotaBuilder.comDescricao("Item 2").comValor(300.0).constroi())
                .comItem(itemDaNotaBuilder.comDescricao("Item 3").comValor(400.0).constroi())
                .comObservacoes("Observacao qualquer.")
                .naDataAtual();

        NotaFiscal nf = builder.constroi();

        System.out.println(nf);

    }

}

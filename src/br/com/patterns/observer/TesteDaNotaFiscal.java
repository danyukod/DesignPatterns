package br.com.patterns.observer;

public class TesteDaNotaFiscal {

    public static void main(String[] args) {

        NotaFiscalBuilder builder = new NotaFiscalBuilder(null);
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

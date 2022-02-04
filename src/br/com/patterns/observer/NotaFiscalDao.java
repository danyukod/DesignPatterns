package br.com.patterns.observer;

public class NotaFiscalDao implements AcaoAposGerarNota{

    public void executa(NotaFiscal nf) {
        System.out.println("salva no banco");
    }

}

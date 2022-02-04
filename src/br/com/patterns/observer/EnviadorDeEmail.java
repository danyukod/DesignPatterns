package br.com.patterns.observer;

public class EnviadorDeEmail implements AcaoAposGerarNota{

    public void executa(NotaFiscal nf) {
        System.out.println("envia por email");
    }

}

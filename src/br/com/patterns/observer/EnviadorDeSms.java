package br.com.patterns.observer;

public class EnviadorDeSms implements AcaoAposGerarNota{

    public void executa(NotaFiscal nf) {
        System.out.println("envia por sms");
    }

}

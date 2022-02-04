package br.com.patterns.singleton;

public class Programa {

    public static void main(String[] args) {

        SingletonDuplaVerificacao singletonDuplaVerificacao = SingletonDuplaVerificacao.getInstance();

        System.out.println(singletonDuplaVerificacao);

        singletonDuplaVerificacao = SingletonDuplaVerificacao.getInstance();

        System.out.println(singletonDuplaVerificacao);

    }

}

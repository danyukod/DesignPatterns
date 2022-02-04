package br.com.patterns.memento;

import java.util.Calendar;

public class Programa {

    public static void main(String[] args) {

        Historico historico = new Historico();
        Contrato contrato = new Contrato(Calendar.getInstance(), "Danilo", TipoContrato.NOVO);
        historico.adiciona(contrato.getEstado());

        contrato.avanca();
        historico.adiciona(contrato.getEstado());

        contrato.avanca();
        historico.adiciona(contrato.getEstado());

        Estado estadoAnterior = historico.pega(1);

        System.out.println("Estado Atual :" + contrato.getEstado());
        System.out.println("Estado Anterior : " + estadoAnterior);

    }

}

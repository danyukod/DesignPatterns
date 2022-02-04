package br.com.patterns.memento;

import java.util.Calendar;

public class Contrato {

    private Calendar calendar;
    private String cliente;
    private TipoContrato tipo;

    public Contrato(Calendar calendar, String cliente, TipoContrato tipo) {
        this.calendar = calendar;
        this.cliente = cliente;
        this.tipo = tipo;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public String getCliente() {
        return cliente;
    }

    public TipoContrato getTipo() {
        return tipo;
    }

    public void avanca(){
        if(tipo == TipoContrato.NOVO) tipo = TipoContrato.EM_ANDAMENTO;
        else if(tipo == TipoContrato.EM_ANDAMENTO) tipo = TipoContrato.ACERTADO;
        else if(tipo == TipoContrato.ACERTADO) tipo = TipoContrato.CONCLUIDO;
    }

    public Estado getEstado(){
        return new Estado(new Contrato(this.calendar, this.cliente, this.tipo));
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "calendar=" + calendar.getTime() +
                ", cliente='" + cliente + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}

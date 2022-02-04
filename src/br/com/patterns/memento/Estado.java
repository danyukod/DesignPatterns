package br.com.patterns.memento;

public class Estado {

    private Contrato contrato;

    public Estado(Contrato contrato) {
        this.contrato = contrato;
    }

    public Contrato getEstado(){
        return contrato;
    }

    @Override
    public String toString() {
        return "Estado{" +
                "contrato=" + contrato +
                '}';
    }
}

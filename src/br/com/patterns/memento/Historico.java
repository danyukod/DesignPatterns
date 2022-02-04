package br.com.patterns.memento;

import java.util.ArrayList;
import java.util.List;

public class Historico {

    private List<Estado> estadosSalvos = new ArrayList<>();

    public Estado pega(int index){
        return estadosSalvos.get(index);
    }

    public void adiciona(Estado estado){
        estadosSalvos.add(estado);
    }

}

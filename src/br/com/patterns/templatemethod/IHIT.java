package br.com.patterns.templatemethod;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IHIT extends TemplateDeImpostoCondicional {

    @Override
    protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {

        Set<String> noOrcamento = orcamento.getItens().stream().map(Item::getNome).collect(Collectors.toSet());

        if(orcamento.getItens().size() > noOrcamento.size())
            return true;
        else
            return false;

    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.13 + 100;
    }

    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * (0.01 * orcamento.getItens().size());
    }
}

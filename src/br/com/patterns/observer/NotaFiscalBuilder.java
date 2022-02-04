package br.com.patterns.observer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {

    private String razaoSocial;
    private String cnpj;
    private List<ItemDaNota> itens = new ArrayList<>();
    private double valorBruto;
    private double impostos;
    private String observacoes;
    private Calendar data;

    private List<AcaoAposGerarNota> todasAcoesASereExecutadas;

    public NotaFiscalBuilder(List<AcaoAposGerarNota> acaoAposGerarNotas){
        this.todasAcoesASereExecutadas = acaoAposGerarNotas;
    }

    public void adicionaAcao(AcaoAposGerarNota acaoAposGerarNota){
        this.todasAcoesASereExecutadas.add(acaoAposGerarNota);
    }

    public NotaFiscalBuilder paraEmpresa(String razaoSocial){
        this.razaoSocial = razaoSocial;
        return this;
    }

    public NotaFiscalBuilder comCnpj(String cnpj){
        this.cnpj = cnpj;
        return this;
    }

    public NotaFiscalBuilder comItem(ItemDaNota itemDaNota){
        itens.add(itemDaNota);
        valorBruto += itemDaNota.getValor();
        impostos += itemDaNota.getValor() * 0.05;
        return this;
    }

    public NotaFiscalBuilder comObservacoes(String observacoes){
        this.observacoes = observacoes;
        return this;
    }

    public NotaFiscalBuilder naDataAtual(){
        this.data = Calendar.getInstance();
        return this;
    }

    public NotaFiscal constroi(){
        NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, itens, observacoes);

        if(todasAcoesASereExecutadas == null)
            return nf;

        todasAcoesASereExecutadas.forEach(
                acaoAposGerarNota -> acaoAposGerarNota.executa(nf)
        );
        return nf;
    }





}

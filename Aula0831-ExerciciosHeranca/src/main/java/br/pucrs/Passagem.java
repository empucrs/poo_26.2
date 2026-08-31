package br.pucrs;

public class Passagem{

    private String cpf, nome, assento;
    private double custoPassagem;

    public Passagem(String _cpf, String _nome, String _assento, double _custoPassagem){
        this.cpf=_cpf;
        this.nome=_nome;
        this.assento=_assento;
        this.custoPassagem=_custoPassagem;
    }

    public double custoBagagem(int qtdade, int [] pesos){
        double custo = 0;
        for(int i=0; i<qtdade; i++)
            custo += pesos[i]*0.5;
        return custo;
    }

    public double defineAssento(String _assento){
        this.assento=_assento;
        return 5.0;
    }

    public double getCustoPassagem(){
        return this.custoPassagem;
    }

}
package br.pucrs;

public abstract class Cliente{
    private String nome;

    public Cliente(String _nome){
        this.nome=_nome;
    }

    public String getNome(){
        return this.nome;
    }

    public abstract double getMensalidade();

}
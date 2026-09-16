package br.pucrs;

public class Pessoa implements Mensuravel{
    private String nome;
    private double altura;

    public Pessoa(String n, double a){
        this.nome=n;
        this.altura=a;
    }

    public String getNome(){
        return this.nome;
    }

    public double getAltura(){
        return this.altura;
    }

    @Override
    public double getValor(){
        return this.getAltura();
    }
}
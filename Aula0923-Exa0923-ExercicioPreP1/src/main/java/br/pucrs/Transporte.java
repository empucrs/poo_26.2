package br.pucrs;

public abstract class Transporte{
    private String identificacao;
    private int capacidade;
    private double precoBase;

    public Transporte(String id, int capacidade, double preco){
        this.identificacao=id;
        this.capacidade=capacidade;
        this.precoBase=preco;
    }

    public String getIdentificacao(){
        return this.identificacao;
    }
    public int getCapacidade(){
        return this.capacidade;
    }
    public double getPrecoBase(){
        return this.precoBase;
    }

    public abstract double calcularValor(int passageiros);
    public void exibirDados(){
        System.out.println(this.getClass().getName());
        System.out.println("  Identificacao:" + this.identificacao);
        System.out.println("  Capacidade:   " + this.capacidade);
        System.out.println("  Preço Base:   " + this.precoBase);
    }
}
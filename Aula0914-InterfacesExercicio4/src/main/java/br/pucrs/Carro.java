package br.pucrs;

public class Carro implements Mensuravel{
    private double comprimento;

    public Carro(double c){
        this.comprimento = c;
    }

    public double getComprimento(){
        return this.comprimento;
    }

    public double getValor(){
        return this.comprimento;
    }

}
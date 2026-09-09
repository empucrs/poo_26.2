package br.pucrs;
public class Quadrado extends Retangulo{
    public Quadrado(int lado, int centroX, int centroY){
        super(lado, lado, centroX, centroY);
    }

    public int getLado(){
        return this.getAltura();
    }
}
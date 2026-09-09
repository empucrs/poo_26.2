package br.pucrs;

public class Retangulo extends FiguraBidimensional{
    private int largura, altura;
    public Retangulo(int _largura, int _altura, int centroX, int centroY){
        super(centroX, centroY);
        this.largura=_largura;
        this.altura=_altura;
    }
    public int getLargura(){
        return this.largura;
    }
    public int getAltura(){
        return this.altura;
    }

    @Override
    public double area() {
        return this.altura*this.largura;
    }
    
}
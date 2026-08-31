package br.pucrs;

public class Economy extends Passagem{

    public Economy(String _c, String _n, String _a, double _p){
        super(_c, _n, _a, _p);        
    }

    public double custoBagagem(int _qtdade, int [] _pesos){
        double custoBasico = super.custoBagagem(_qtdade, _pesos);
        double custoAdicional = _qtdade*10.0;
        return custoBasico+custoAdicional;
    }

}
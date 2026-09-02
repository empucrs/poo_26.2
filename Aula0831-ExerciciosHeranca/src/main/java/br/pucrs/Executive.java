package br.pucrs;

public class Executive extends Passagem{
    public Executive(String _c, String _n, String _a, double _p){
        super(_c, _n, _a, _p);
    }

    public double custoBagagem(int qtdade, int [] pesos){
        double custo=0;
        for(int i=2; i<qtdade; i++)
            custo=pesos[i]*0.5;
        return custo;
    }

    public double getMilhas(){
        return (int) (this.getCustoPassagem()*0.1);
    }

    @Override
    public String toString() {
        return "Imprimindo do objeto Executive";
    }


}
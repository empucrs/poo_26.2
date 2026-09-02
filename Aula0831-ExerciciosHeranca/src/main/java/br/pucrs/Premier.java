package br.pucrs;

public class Premier extends Executive{
    public Premier(String c, String n, String a, double p){
        super(c, n, a, p);
    }

    @Override
    public double defineAssento(String _assento){
        super.defineAssento(_assento);
        return 0;
    }

    @Override
    public double custoBagagem(int qtde, int [] pesos){
        double valorExecutive = super.custoBagagem(qtde, pesos);
        return valorExecutive/2.0;
    }

    @Override
    public double getMilhas(){
        return 2*super.getMilhas();
    }  

    @Override
    public String toString() {
        return "Imprimindo do objeto Premier";
    }

}
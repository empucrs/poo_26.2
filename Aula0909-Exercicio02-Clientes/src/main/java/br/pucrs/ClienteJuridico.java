package br.pucrs;

public class ClienteJuridico extends Cliente{
    private double mensalidade;

    public ClienteJuridico(double _mensalidade, String _nome) {
        super(_nome);
        this.mensalidade=_mensalidade;
    }

    public void setMensalidade(double _mensalidade){
        this.mensalidade=_mensalidade;
    }

    public double getMensalidade(){
        return this.mensalidade;
    }
    
}
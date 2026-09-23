package br.pucrs;

public class Onibus extends Transporte implements Reservavel{
    private double taxaEmbarque;
    public Onibus(String id, int capacidade, double preco, double taxa){
        super(id, capacidade, preco);
        this.taxaEmbarque=taxa;
    }
    public double getTaxaEmbarque(){
        return taxaEmbarque;
    }

    @Override
    public double calcularValor(int passageiros) {
        return getPrecoBase()*passageiros+taxaEmbarque;
    }

    @Override
    public void reservar(int passageiros) throws ReservaInvalidaException {
        if(!((passageiros>0) && (passageiros<=getCapacidade()))){
            ReservaInvalidaException e = new ReservaInvalidaException("nro passageiros está irregular");
            throw e;
        }
    }
}
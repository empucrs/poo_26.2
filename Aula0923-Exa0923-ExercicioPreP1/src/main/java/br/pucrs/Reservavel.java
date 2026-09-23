package br.pucrs;

public interface Reservavel {
    public void reservar(int passageiros) throws ReservaInvalidaException;
}
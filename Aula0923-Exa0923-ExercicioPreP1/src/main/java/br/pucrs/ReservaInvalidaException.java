package br.pucrs;

public class ReservaInvalidaException extends Exception {
    public ReservaInvalidaException(String mensagem) {
        super(mensagem);
    }
}
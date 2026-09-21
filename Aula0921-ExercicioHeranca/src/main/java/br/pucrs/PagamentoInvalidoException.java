package br.pucrs;

public class PagamentoInvalidoException extends Exception{
    public PagamentoInvalidoException(){
        super();
    }

    public PagamentoInvalidoException(String mensagem){
        super(mensagem);
    }

    public PagamentoInvalidoException(Throwable lancante){
        super(lancante);
    }

    public PagamentoInvalidoException(String mensagem, Throwable lancante){
        super(mensagem, lancante);
    }
}

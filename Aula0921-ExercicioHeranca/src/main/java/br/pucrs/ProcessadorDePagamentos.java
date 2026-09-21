package br.pucrs;

public class ProcessadorDePagamentos{
    public void processar(Pagamento pagamento) throws PagamentoInvalidoException{
        if(pagamento instanceof Autenticavel){
            boolean ehAutentico =((Autenticavel) pagamento).autenticar();
            if(!ehAutentico){
                PagamentoInvalidoException pie = new PagamentoInvalidoException("O documento não é autêntico");
                throw pie;
            }
            pagamento.exibirResumo();
        }
        else{
            PagamentoInvalidoException pie = new PagamentoInvalidoException("Não é um objeto autenticável");
            throw pie;
        }
    }
}
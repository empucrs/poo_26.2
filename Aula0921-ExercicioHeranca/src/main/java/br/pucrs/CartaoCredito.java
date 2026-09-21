package br.pucrs;

public class CartaoCredito extends Pagamento implements Autenticavel{

    private String nroCartao;
    private int nroParcelas;

    public CartaoCredito(String titular, double valor, String nroCartao, int nroParcelas){
        super(titular, valor);
        this.nroCartao=nroCartao;
        this.nroParcelas=nroParcelas;
    }

    public String getNroCartao(){
        return this.nroCartao;
    } 

    public int getNroParcelas(){
        return this.nroParcelas;
    }

    @Override
    public double calcularTaxa(){
        double taxaBase = getValor()* 0.02;
        double taxaAdicional = 0;
        if(this.nroParcelas>1){
            double valorDeCalculo=getValor()-(getValor()/nroParcelas);
            taxaAdicional=valorDeCalculo*0.01;
        }
        return taxaBase+taxaAdicional;

    }

    @Override
    public boolean autenticar(){
        return ((this.nroCartao!=null)&&(this.nroCartao.length()==16));
    }


}


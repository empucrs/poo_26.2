package br.pucrs;

public class Pix extends Pagamento implements Autenticavel{
    private String chave;

    public Pix(String titular, double valor, String chave){
        super(titular, valor);  
        this.chave=chave;
    }

    public String getChave(){
        return this.chave;
    }

    public double calcularTaxa(){
        return 0;
    }

    public boolean autenticar(){
        return ((this.chave!=null) && (!this.chave.isEmpty()));
    }

}
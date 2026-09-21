package br.pucrs;

public abstract class Pagamento{

    private String titular;
    private double valor;    

    public Pagamento(String titular, double valor){
        this.titular=titular;
        this.valor=valor;
    }

    public String getTitular(){
        return this.titular;        
    }
    public double getValor(){
        return this.valor;
    }
    public abstract double calcularTaxa();
    public double calcularTotal(){
        return this.valor+calcularTaxa();
    }
    public void exibirResumo(){
        StringBuilder sb = new StringBuilder();
        
        sb.append(this.getClass().getName());
        sb.append("{");
        sb.append("  Titular:"+this.getTitular()+";");
        sb.append("  Valor:"+this.getValor()+";");
        sb.append("  Taxa:"+this.calcularTaxa()+";");
        sb.append("  Total:"+this.calcularTotal()+";");
        sb.append("}");

        System.out.println(sb.toString());

    }

}
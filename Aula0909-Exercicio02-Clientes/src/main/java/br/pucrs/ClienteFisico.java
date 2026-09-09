package br.pucrs;

public class ClienteFisico extends Cliente{
    private int idade;
    private double salario;

    public ClienteFisico(int _idade, double _salario, String _nome){
        super(_nome);
        this.idade=_idade;
        this.salario=_salario;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int _idade){
        this.idade=_idade;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double _salario){
        this.salario=_salario;
    }

    public double getMensalidade(){
        if(idade<60) return 0.1*getSalario();
        else return 0.15*getSalario();        
    }

}
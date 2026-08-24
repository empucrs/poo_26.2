package br.pucrs;
public class Funcionario{
    public static final double LIM_ISENCAO_IR = 2000;
    private String matricula;
    private String nome;
    private double salarioBruto;
    private String categoria; // NORMAL; RISCO; PESQUISADOR
    private int especializacao;
    
    public Funcionario(String matricula, String nome, double salarioBruto, String categoria, int especializacao){
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.categoria = categoria.toUpperCase();
        this.especializacao = especializacao;
    }

	public String getMatricula() {
		return matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSalarioBruto() {
		return salarioBruto;
	}
    
	public String getCategoria() {
		return this.categoria;
	}

    public int getEspecializacao(){
        return especializacao;
    }
    
    public double getINSS(){
        return salarioBruto*0.1;
    }

    public double getImpRenda(){

        double salarioCategoria;

        if(this.categoria.equals("RISCO"))
            salarioCategoria=this.salarioBruto+(this.salarioBruto-getINSS())*0.25;
        else
            salarioCategoria=this.salarioBruto;

        
        if (salarioCategoria <= LIM_ISENCAO_IR){
            return 0.0;
        }else{
            double aux = salarioCategoria - LIM_ISENCAO_IR;
            double ir = aux * 0.2;
            return ir;
        }
    }

    public double getSalarioLiquido(){
        if(this.categoria.equals("NORMAL"))
            return salarioBruto - getINSS() - getImpRenda();
        else if (this.categoria.equals("RISCO")){
            double adicional = (salarioBruto - getINSS())*0.25;
            return salarioBruto - getINSS() - getImpRenda() + adicional;
        }
        else
            return salarioBruto - getINSS() - getImpRenda() + adicionalPesquisador();

    }

    public double adicionalPesquisador(){
        double adicional;
        switch (this.especializacao) {
            case 1:  adicional=salarioBruto*0.05; break;
            case 2:  adicional=salarioBruto*0.1;  break;
            case 3:  adicional=salarioBruto*0.2;  break;
            default: adicional=0;
        }
        return adicional;
    } 

    public String toString() {
        String aux = "";
        aux += "Categoria: "+this.getClass().getName()+ " " + this.categoria;
        if(categoria.equals("PESQUISADOR")) aux += " "+ this.especializacao;
        aux += "\n";

        aux += "Matricula: "+this.getMatricula()+"\n";
        aux += "Nome: "+this.getNome()+"\n";
        aux += "Salario bruto: "+this.getSalarioBruto()+"\n";
        aux += "(-) INSS: "+this.getINSS()+"\n";
        aux += "(-) IR: "+this.getImpRenda()+"\n";
        if(this.categoria.equals("RISCO"))
            aux += "(+) Adicional insalubridade: "+((salarioBruto - getINSS())*0.25)+"\n";
        if(this.categoria.equals("PESQUISADOR"))
            aux += "(+) Adicional pesquisador: "+adicionalPesquisador()+"\n";        
        aux += "Salario liquido: "+this.getSalarioLiquido()+"\n";
        aux += "----------";
        return aux;    
    }
}
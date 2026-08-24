package br.pucrs;
import java.util.ArrayList;

public class CadastroFuncionarios{
    private ArrayList<Funcionario> funcionarios;

    private void carregaFuncionarios(){
        funcionarios.add(new Funcionario("A3212","Huguinho Pato",1890.0, "NORMAL",0));
        funcionarios.add(new Funcionario("A3312","Zezinho Pato",3720.0, "NORMAL",0));
        funcionarios.add(new Funcionario("A3412","Luizinho Pato",8940.0, "NORMAL",0));
        funcionarios.add(new Funcionario("B9931","Lala Pata",4220.0, "NORMAL",0));
        funcionarios.add(new Funcionario("B9932","Lele Pata",1283.0, "NORMAL",0));
        funcionarios.add(new Funcionario("B9933","Lili Pata",12438.0, "NORMAL",0));

        funcionarios.add(new Funcionario("R0001", "John Wick", 20000.1,     "RISCO",0));
        funcionarios.add(new Funcionario("R0002", "Homer Simpson", 10000.1, "RISCO",0));
        funcionarios.add(new Funcionario("R0007", "James Bond", 50000.1,    "RISCO",0));

        funcionarios.add(new Funcionario("P0001", "Alan Turing",    20000.1, "PESQUISADOR",1));
        funcionarios.add(new Funcionario("P0002", "Albert Einsten", 50000.1, "PESQUISADOR",2));
        funcionarios.add(new Funcionario("P0003", "Dr Evil",        30000.1, "PESQUISADOR",3));
    }

    public CadastroFuncionarios(){
        funcionarios = new ArrayList<>();
        carregaFuncionarios();
    }

    public void cadastraFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public Funcionario recuperaPorMatricula(String matricula){
        for(Funcionario func:funcionarios){
            if (func.getMatricula().equals(matricula)){
                return func;
            }
        }
        return null;
    }
}
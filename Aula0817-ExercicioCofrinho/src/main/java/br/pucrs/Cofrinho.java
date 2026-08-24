package br.pucrs;

public class Cofrinho{
    private Moeda[] porquinho;
    private final int capacidade;
    private int nroMoedas;

    public Cofrinho(){
        this.capacidade=10;
        this.porquinho=new Moeda[capacidade];
        this.nroMoedas=0;
    }

    /*Insere uma moeda no cofrinho. 
      Como um “cofrinho” tem capacidade limitada, 
        deve retornar true se conseguiu inserir a 
        moeda e false caso contrário.*/
    public boolean insere(Moeda moeda){
        if(nroMoedas==capacidade)
            return false;
        porquinho[nroMoedas]=moeda;
        nroMoedas++;
        return true;
    }

    /*Retira do cofrinho a última moeda inserida 
      (se esta operação for chamada várias vezes 
      deve ir retirando todas as moedas na ordem 
      inversa em que foram inseridas). 
    Deve retornar a moeda retirada ou “null” caso
      o cofrinho esteja vazio*/
    public Moeda retira(){
        if(nroMoedas==0)
            return null;
        Moeda aMoedaASerRetornada = porquinho[nroMoedas-1];
        nroMoedas--; 
        return aMoedaASerRetornada;

        /*
        ALTERNATIVA B
        nroMoedas--;
        return porquinho[nroMoedas];

        ALTERNATIVAS C
        return porquinho[--nroMoedas];
         */
    }
    
    /*Informa quantas moedas estão guardadas o 
        cofrinho */
    public int getQtdadeMoedas(){
        return nroMoedas;
    }

    /*Informa quantas moedas de um certo tipo 
        estão guardadas no cofrinho */
    public int getQtdadeMoedasTipo(NomeMoeda nomeMoeda){
        int contador=0;
        for(int i=0; i<nroMoedas; i++)
            if(porquinho[i].getNomeMoeda()==nomeMoeda)
                contador++;
        return contador;
    }
    
    /*Informa o valor total armazenado no cofrinho 
        (em centavos)*/
    public int getValorTotalCentavos(){
        int acumulaValor=0;

        for(int i=0; i<nroMoedas; i++)
            acumulaValor+=porquinho[i].getValorCentavos();

        return acumulaValor;
    }

    /*Informa o valor total armazenado no cofrinho 
        (em reais) */
    public double getValorTotalReais(){
        double acumulaValor=0;

        for(int i=0; i<nroMoedas; i++)
            acumulaValor+=porquinho[i].getValorReais();

        return acumulaValor;
    }
}
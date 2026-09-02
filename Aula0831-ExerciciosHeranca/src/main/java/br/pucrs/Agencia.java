package br.pucrs;

public class Agencia{

    private Passagem [] lista;
    private int nroPassagens;

    public Agencia(){
        this.lista = new Passagem[10];
        this.nroPassagens=0;
    }

    public void adicionaPassagem(Passagem p){
        if(this.nroPassagens<10)
            this.lista[nroPassagens++]=p;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i< nroPassagens; i++)
            sb.append(this.lista[i] + "\n");
        return sb.toString();
    }

    public void fazCoisinha(){
        for(int i=0; i<nroPassagens; i++){

            System.out.println("Imprimindo o objeto da posição "+i);
            if(this.lista[i] instanceof Passagem)
                System.out.println(" Sou um tipo de passagem");
            if(this.lista[i] instanceof Economy)
                System.out.println(" Sou um tipo de passagem Economy");
            if(this.lista[i] instanceof Executive)
                System.out.println(" Sou um tipo de passagem Executive");
            if(this.lista[i] instanceof Premier)
                System.out.println(" Sou um tipo de passagem Premier");

        }
    }




}
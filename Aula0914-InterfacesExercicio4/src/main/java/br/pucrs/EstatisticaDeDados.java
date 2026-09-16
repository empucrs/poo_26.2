package br.pucrs;

import java.util.ArrayList;

public class EstatisticaDeDados{

    public ArrayList<Mensuravel> lista;

    public EstatisticaDeDados(){
        lista = new ArrayList<>();
    }

    public double getMedia(){
        double resultado=0;
        for(Mensuravel m: lista)
            resultado+=m.getValor();
        resultado /= lista.size();
        return resultado;
    }
    
    public double getMaior(){
        double resultado=Double.MIN_VALUE;
        for(Mensuravel m: lista)
            if(m.getValor()>resultado)
            resultado=m.getValor();
        return resultado;
    }

    public double getMenor(){
        double resultado=Double.MAX_VALUE;
        for(Mensuravel m: lista)
            if(m.getValor()<resultado)
            resultado=m.getValor();
        return resultado;
    }

    public void adicionar(Mensuravel objeto){
        if(objeto != null)
            lista.add(objeto);        
    }




}
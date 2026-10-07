package br.pucrs;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercicio01{

    public Exercicio01(){

        //a - 1∈{1,2,3}
        //=============
        //HashSet<Integer> base = new HashSet<Integer>(List.of(1,2,3));
        HashSet<Integer> base = new HashSet<Integer>();
        //base.addAll(List.of(1,2,3));
        base.add(1);
        base.add(2);
        base.add(3); //{1,2,3}        
        System.out.println("1 percente ao conjunto {1,2,3}? " + base.contains(1));

        //b - ∅ ⊂ {1,2,3}
        //===============
        Set<Integer> vazio = new HashSet<>();
        System.out.println("O conjunto Vazio está contido no conjunto "+base+"? "+base.containsAll(vazio));

        //c - {1,2}⊆{1,2,3,4}
        Set<Integer> itemC = new HashSet<>(List.of(1,2));
        base.add(4);
        System.out.println("O conjunto "+itemC+" não está contido no conjunto "+base+"? "+ !base.containsAll(itemC));
        
        //d - {1,2,3,4}−{1,2,5}={3,4}
        Set<Integer> itemD = new HashSet<>(itemC);
        itemD.add(5);
        Set<Integer> diferenca = new HashSet<>(base);
        diferenca.removeAll(itemD);
        System.out.println(" A diferença entre "+base+" e "+itemD+" eh :" +diferenca);

        //{1,2,3,4} *interseccao* {1,2,5} = {1,2}
        Set<Integer> interseccao = new HashSet<>(base);
        interseccao.retainAll(itemD);
        System.out.println(" A interseccao entre "+base+" e "+itemD+" eh :" +interseccao);
        
        //{1,2,3,4} *uniao* {1,2,5} = {1,2,3,4,5}
        Set<Integer> uniao = new HashSet<>(base);
        uniao.addAll(itemD);
        System.out.println(" A uniao entre "+base+" e "+itemD+" eh :" +uniao);

        //e - {1,2}×{3,4}={(1,3),(1,4),(2,3),(2,4)}
        //f - 2{1,2}={∅,{1},{2},{1,2}} ou seja, o conjunto de todos os subconjuntos de um conjunto    
        
    }

}
package br.pucrs;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class AppConjuntos {

	public AppConjuntos(boolean runFirstPiece) {

        if(runFirstPiece){
            Scanner sc = new Scanner(System.in);
            System.out.print("Frase:");
            String texto = sc.nextLine();
            sc.close();
            Set<String> unicos = new HashSet<String>();
            Set<String> duplic = new HashSet<String>();

            // frase; 1 3 5 7 3 5 2"
            // unicos: [ 1, 3, 5, 7, 2 ]
            // dups  : [ 3, 5 ]

            for (String a: texto.split(" "))
                //if (unicos.add(a) == false)
                if ( !unicos.add(a) )   //  if (unicos.add(a) == false)
                    // Se já tem, adiciona nos duplicados
                    duplic.add(a);

            // Remove do original os que também estão nos duplicados
            // - operação de diferença
            unicos.removeAll(duplic);
            System.out.println("Palavras não repetidas: " + unicos);
            System.out.println("Palavras repetidas: " + duplic);

            //PONTO DE PARADA DO MEU PROGRAMA
            System.exit(0);
        }

        Aeroporto a1 = new Aeroporto("POA", "Porto Alegre");
        Aeroporto a2 = new Aeroporto("GRU", "São Paulo");

        HashSet<Aeroporto> aeroportos = new HashSet<>();
        System.out.println("adicionando a1");
        aeroportos.add(a1);
        System.out.println(aeroportos);

        System.out.println("adicionando a1");
        aeroportos.add(a1);
        System.out.println(aeroportos);

        System.out.println("adicionando a2");
        aeroportos.add(a2);
        System.out.println(aeroportos);

        System.out.println("adicionando a1");
        aeroportos.add(a1);
        System.out.println(aeroportos);

        System.out.println("adicionando a2");
        aeroportos.add(a2);
        System.out.println(aeroportos);

        System.out.println("adicionando um novo aeroporto");
        aeroportos.add(new Aeroporto("POA", "Porto Alegre"));
        System.out.println(aeroportos);

        System.out.println("adicionando um novo aeroporto");
        aeroportos.add(new Aeroporto("POA", "Porto Alegre"));
        System.out.println(aeroportos);

	}

}

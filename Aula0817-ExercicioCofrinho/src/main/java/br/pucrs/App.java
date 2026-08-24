package br.pucrs;

public class App {

    /* Escreva um programa Java que cria um cofrinho e insere 10 moedas no mesmo. 
       Em seguida o programa deve imprimir:
         a. Quantas moedas foram armazenadas no cofrinho.
         b. Quantas moedas de um real estão armazenadas no cofrinho.
         c. Quantas moedas de 50 centavos estão armazenadas no cofrinho.
         d. Qual o valor total em centavos armazenado no cofrinho.
         e. Qual o valor total em reais armazenado no cofrinho.
         f. Qual o valor total em centavos armazenado no cofrinho após a retirada das duas últimas moedas inseridas.     
        */
    public static void main(String[] args) {
        Cofrinho meuCofre = new Cofrinho();

        meuCofre.insere(new Moeda(NomeMoeda.Cinco));
        meuCofre.insere(new Moeda(NomeMoeda.Um));
        meuCofre.insere(new Moeda(NomeMoeda.UmReal));
        meuCofre.insere(new Moeda(NomeMoeda.Cinquenta));
        meuCofre.insere(new Moeda(NomeMoeda.Dez));
        meuCofre.insere(new Moeda(NomeMoeda.VinteCinco));
        meuCofre.insere(new Moeda(NomeMoeda.UmReal));
        meuCofre.insere(new Moeda(NomeMoeda.Cinquenta));
        meuCofre.insere(new Moeda(NomeMoeda.VinteCinco));
        meuCofre.insere(new Moeda(NomeMoeda.Dez));
        //3.76

        //a. Quantas moedas foram armazenadas no cofrinho.
        System.out.println("O cofre possuir "+meuCofre.getQtdadeMoedas()+" moedas armazenadas");

        //b. Quantas moedas de um real estão armazenadas no cofrinho.
        System.out.println("O cofre possui "+meuCofre.getQtdadeMoedasTipo(NomeMoeda.UmReal)+" moedas de um real");

        //c. Quantas moedas de 50 centavos estão armazenadas no cofrinho.
        System.out.println("O cofre possui "+meuCofre.getQtdadeMoedasTipo(NomeMoeda.Cinquenta)+" moedas de cinquenta centavos");

        //d. Qual o valor total em centavos armazenado no cofrinho.
        System.out.println("O valor total no cofrinho em centavos é "+meuCofre.getValorTotalCentavos());

        //e. Qual o valor total em reais armazenado no cofrinho.
        System.out.println("O valor total no cofrinho em reais é "+meuCofre.getValorTotalReais());

        //f. Qual o valor total em centavos armazenado no cofrinho após a retirada das duas últimas moedas inseridas.
        Moeda m = meuCofre.retira();
        System.out.println("Retirei a moeda "+ m.getNomeMoeda());
        m=meuCofre.retira();
        System.out.println("Retirei a moeda "+ m.getNomeMoeda());
        System.out.println("O valor que restou no cofre em centavos foi "+meuCofre.getValorTotalCentavos());
    }
}

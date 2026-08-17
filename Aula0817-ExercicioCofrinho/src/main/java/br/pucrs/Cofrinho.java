package br.pucrs;

public class Cofrinho{
    private Moeda[] cofrinho;
    private final int capacidade;
    private int nroMoedas;

    public Cofrinho();
    {
        this.capacidade=10;
        this.cofrinho=new Moeda[capacidade];
    }

    public boolean insere(Moeda moeda);
    public Moeda retira();
    public int getQtdadeMoedas();
    public int getQtdadeMoedasTipo(NomeMoeda nomeMoeda);
    public int getValorTotalCentavos();
    public double getValorTotalReais();
}
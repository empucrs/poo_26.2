package br.pucrs;

public class App {
    public static void main(String[] args) {
        EstatisticaDeDados e = new EstatisticaDeDados();

        e.adicionar(new Pessoa("Edson", 1.94));
        e.adicionar(new Carro(3));

        System.out.println(e.getMaior());
        System.out.println(e.getMedia());
        System.out.println(e.getMenor());
    }
}

package br.pucrs;

public class App {
    public static void main(String[] args) {
        Agencia agc = new Agencia();

        agc.adicionaPassagem(new Passagem("123", "Edson",     "", 1230));
        agc.adicionaPassagem(new Economy("456", "Silvia",    "", 2000));
        agc.adicionaPassagem(new Executive("789", "Francisco", "", 3000));
        agc.adicionaPassagem(new Premier("012", "Antonio",   "", 4000));

        System.out.println(agc);

        agc.fazCoisinha();
    }
}

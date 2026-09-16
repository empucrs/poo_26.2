package br.pucrs;

public class App {
    public static void main(String[] args) {
        System.out.println("Lista de exercicio");
        Exercicio01 e01 = new Exercicio01();
        int valor = e01.getInt();
        System.out.println("O valor capturado foi "+valor);
    }
}

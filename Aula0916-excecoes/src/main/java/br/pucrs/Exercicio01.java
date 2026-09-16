package br.pucrs;

import java.util.Scanner;

public class Exercicio01{
    private Scanner sc;

    public Exercicio01(){
        sc = new Scanner(System.in);
    }

    public int getInt(){
        System.out.print("Informe um valor qualquer: ");
        String valor = sc.nextLine();
        int resultado;

        try{            
            resultado=Integer.parseInt(valor);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Uma exceção relacionada ao formato do número foi detectada");
            resultado=-1;
        }
/*
        catch(NumberFormatException e){
            System.out.println("Uma exceção relacionada ao formato do número foi detectada");
            resultado=-1;
        }
        catch(Exception e){
            IllegalArgumentException exc = new IllegalArgumentException("O valor informado não é um valor numérico");
            throw exc;
        }
 */
        return resultado;

    }
}
package br.pucrs;
public class App{
    public static void main(String args[]){

        System.out.println("Nro de argumentos passados por parâmetro");
        System.out.println(args.length);
        if(args.length>0)
            for(String str: args)
                System.out.println("  -> " + str);

        String codigoDaPlaca;
        double qtdeAbastecer;
        double distanciaAPercorrer;

        codigoDaPlaca=args[0];
        qtdeAbastecer=Double.parseDouble(args[1]);
        distanciaAPercorrer=Double.parseDouble(args[2]);

        System.out.println("placa     => "+ codigoDaPlaca);
        System.out.println("litragem  =>" + qtdeAbastecer);
        System.out.println("distancia => "+ distanciaAPercorrer);
        
        System.exit(1);

        Placa p1 = new Placa("Brasil","ABC1R23");
        
        Veiculo v = new Veiculo(p1);
        System.out.println("Dados do veiculo antes de abastecer:");
        System.out.println(v);
        System.out.println("----------------");

        v.abastece(65);
        System.out.println("Dados do veiculo depois de abastecer:");
        System.out.println(v);
        System.out.println("----------------");

        v.dirige(250);
        System.out.println("Dados do veiculo depois de percorrer 250Km:");
        System.out.println(v);
        System.out.println("----------------");
        }
}

import java.util.Random;

/* Desenvolva uma abstração de uma lâmpada, a qual pode ser 
     ligada e desligada. Sabe-se que a lâmpada pode queimar
     ao ser ligada com uma chance de 30%, e que uma vez 
     queimada ela não pode mais ser ligada ou desligada 
     novamente. Deve ser possível observar o estado da 
     lâmpada (se desligada, ligada ou queimada). Dica: 
     utilize o gerador de números aleatórios de Java, classe 
     Random, para sortear a chance de uma lâmpada queimar 
     quando for ligada. */

public class Lampada{

    private boolean estaLigada;
    private boolean estaQueimada;

    public Lampada(){
        estaLigada=false;
        estaQueimada=false;
    }

    public void ligar(){
        if((!estaQueimada) && (!estaLigada)){
            Random r = new Random();
            if(r.nextInt(10)<3){
                estaQueimada=true;
                estaLigada=false;
            }
            estaLigada=true;
        }
    }

    public void desligar(){
        estaLigada=false;
    }

    public int getEstado(){
        // a lampada está queimada
        if(estaQueimada) return -1;

        // a lampada está desligada
        if(!estaLigada)  return 0;

        // a lampada está ligada
        return 1;
    }



}
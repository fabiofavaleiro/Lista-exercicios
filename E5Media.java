import java.util.ArrayList;

public class E5Media {

    public E5Media(){   }
    private int[] notas = new int[3];
    private int todasNotasSomadas = 0;
    private int media;



    public void recebeNotas(int[] notas){
        this.notas = notas;
    }

    public int calculaMedia(){

        for (int i = 0 ; i < 3 ; i++ ){
            todasNotasSomadas = todasNotasSomadas + notas[i];
        }
        media = todasNotasSomadas/3;
        return media;
    }

    public boolean VerificaAprovado(){
        return media >= 7;
    }

}

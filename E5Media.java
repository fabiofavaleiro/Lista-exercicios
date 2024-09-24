public class E5Media {

    public E5Media(){   }
    private int nota1;
    private int nota2;
    private int nota3;
    private int media;



    public void recebeNotas(int nota1, int nota2, int nota3){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public int calculaMedia(){
        media = ( nota1 + nota2 + nota3 )/3;
        return media;
    }

    public boolean VerificaAprovado(){
        return media >= 7;
    }

}

public class E2Fatorar {


    public E2Fatorar(){    }
    int e2;

    public int fatorar(int e2){
        this.e2 = e2;

        for (int i = this.e2; i > 0; i -- ){
            this.e2 = this.e2 * i;


        }


        return this.e2;

    }


}

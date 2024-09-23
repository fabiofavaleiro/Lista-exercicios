public class E4Fibonacci {

    public void E4Fibonaci(){   }
    int v;

    public int calcular(int v){
        this.v = v;
        if (this.v == 0){
            return 0;
        } else if (this.v ==1) {
            return 1;
        } else {

            int v1 = 1;
            int s = 2;
            int aux;

            for (int i = 3;i < this.v; i++){
                aux = s;
                s = s + v1;
                v1 = aux;


            }
            return s;

        }


    }


}

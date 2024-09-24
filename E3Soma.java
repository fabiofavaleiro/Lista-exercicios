public class E3Soma {


    int s;
    public E3Soma(){    }


    public int somar(int n1, int n2){


        if (n1 > n2 ){

            for (int i = n1; i >= n2;i--){
                s= s + i;
            }



        } else if (n1 == n2) {

            s= n1;

        }else {

            for (int i = n2; i >= n1;i--){
                s = s + i;

            }

        }

        return s;

    }
}

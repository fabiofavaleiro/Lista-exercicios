public class E5Media {

    public E5Media(){   }
    int a,b,c,d,n;


    public int media(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;

        d = (this.a+this.b+this.b)/3;
     return d;

    }

    public boolean apr(int n){
        this.n = n;
        if (n>=7){
            return true;
        }else {
            return false;
        }
    }

}

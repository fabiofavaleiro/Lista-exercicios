import javax.swing.*;

public class E1parImpar {
    int e1 = 0;

    public E1parImpar(){    }

    public boolean verifica(int e1){
        int v = e1%2;

        if (v == 0){
            return true;
        }else{
            return false;
        }


    }



    public int getE1() {
        return e1;
    }

    public void setE1(int e1) {
        this.e1 = e1;
    }
}

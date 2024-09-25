import javax.swing.*;
import java.util.jar.JarOutputStream;

public class E6DinPar {

    public void E6DinPar(){     }

    private int par;
    private int impar;

    public void contar(int numero){

        if (numero%2 == 0){
            par++;
        }else {
            impar++;
        }

    }

    public int getImpar() {
        return impar;
    }

    public int getPar() {
        return par;
    }
}

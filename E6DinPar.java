import javax.swing.*;
import java.util.jar.JarOutputStream;

public class E6DinPar {

    public void E6DinPar(){     }

    int n, p;

    public int varificar(int n){
        this.n = n;
        for (int i = 0; i< this.n; i ++){
            int v = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para ferificar"));
            if (v%2 ==0){
                p++;
            }

        }
        return p;
    }



}

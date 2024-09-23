import java.util.ArrayList;

public class E7Invert {
public void E7Invert(){     }
int v;

    public int inverter(int v){
    this.v = v;
    String va = "" + this.v;
    String av = "";

    int i = va.length();

   while ( i > 0 ) {
        i--;
        av = (av + va.charAt(i));

    }
    return Integer.valueOf(av);
    }




}

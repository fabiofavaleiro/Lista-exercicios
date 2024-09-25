import java.util.ArrayList;

public class E7Invert {
public void E7Invert(){     }


    public int inverter(int valor){

    String valorS = "" + valor;



    int tamanho = valorS.length();
    int caracter= 0;
    int casaDecimal = 1;
    valor = 0;

   while ( caracter < tamanho ) {
       valor = valor + ((Integer.parseInt(String.valueOf(valorS.charAt(caracter))))*casaDecimal);
       casaDecimal = casaDecimal * 10;
       caracter++;
    }

    return valor;
    }

}

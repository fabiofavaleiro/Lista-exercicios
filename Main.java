import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int op = 1;

        for (int ii = 1;ii != 0; ii ++){

            op = Integer.valueOf(JOptionPane.showInputDialog("Qual exercico que ver de 1 até 7? Digite 0 para finalizar"));
            ii = op;

            if (op == 0 ){
                System.out.println("Obrigado por usar nosso software!!!");


            } else if( op == 1 ){
                E1parImpar e1 = new E1parImpar();
                boolean isPar = e1.isPar(Integer.valueOf(JOptionPane.showInputDialog("Qual valor quer saber se é par ou impar?")));

                System.out.println(isPar? "Par": "Impar");

            } else if ( op == 2 ) {
                E2Fatorar e2 = new E2Fatorar();

                int v = e2.fatorar(Integer.valueOf(JOptionPane.showInputDialog("Qual numero deseja fatorar")));

                System.out.println(v);

            } else if ( op == 3 ) {

                E3Soma soma = new E3Soma();

                int n1 = Integer.valueOf(JOptionPane.showInputDialog("digite o primeiro valor"));
                int n2 = Integer.valueOf(JOptionPane.showInputDialog("digite o segundo valor"));

                int s =  soma.somar(n1,n2);
                System.out.println("O valor da soma é "+ s );

            } else if ( op == 4  ) {
                E4Fibonacci calc = new E4Fibonacci();

                int r = calc.calcular(Integer.valueOf(JOptionPane.showInputDialog("Quer fibonacci de qual número?")));

                System.out.println("O valor é " + r);

            } else if ( op == 5 ) {
                E5Media media = new E5Media();

                int a = Integer.valueOf(JOptionPane.showInputDialog("Qual é valor da primeira nota?"));
                int b = Integer.valueOf(JOptionPane.showInputDialog("Qual é valor da segunda nota?"));
                int c = Integer.valueOf(JOptionPane.showInputDialog("Qual é valor da terceira nota?"));

                int d = media.media(a,b,c);
                boolean ap = media.apr(d);

                System.out.println("A media é: " + d);
                System.out.println(" o Aluno está " + (ap? "Apovado!":"Reprovado!"));
            } else if (op  == 6) {
                E6DinPar verifica = new E6DinPar();
                int n = Integer.valueOf(JOptionPane.showInputDialog("Quanto numeros quer digitar"));
                int p= verifica.varificar(n);
                System.out.println("São " + p + " números pares e " + (n - p) + " números impares");


            } else if (op  == 7) {
                E7Invert inverte = new E7Invert();
                int v = Integer.valueOf(JOptionPane.showInputDialog("Digite um numero inteiro com algumas casas decimais"));
                int r = inverte.inverter(v);
                System.out.println(r);

            }else {
                System.out.println("Atenção!!!");
                System.out.println("Escolha um exercicio de 1 até 7, ou 0 para sair!!!");


            }
            ii--;


        }



    }
    }

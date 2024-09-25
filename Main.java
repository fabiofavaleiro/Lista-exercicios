import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int op;

        do {

            op = Integer.valueOf(JOptionPane.showInputDialog("Qual exercício quer ver de 1 até 7? Digite 0 para finalizar"));

            switch (op){
                case 0:
                System.out.println("Obrigado por usar nosso software!!!");
                break;

                case 1:
                boolean isPar = E1ParImpar.isPar(Integer.valueOf(JOptionPane.showInputDialog("Qual valor quer saber se é par ou impar?")));
                System.out.println(isPar? "Par": "Impar");
                break;

                case 2:
                int v = E2Fatorar.fatorar(Integer.valueOf(JOptionPane.showInputDialog("Qual numero deseja fatorar")));
                System.out.println(v);
                break;

                case 3:
                E3Soma soma = new E3Soma();
                int n1 = Integer.valueOf(JOptionPane.showInputDialog("digite o primeiro valor"));
                int n2 = Integer.valueOf(JOptionPane.showInputDialog("digite o segundo valor"));
                int s =  soma.somar(n1,n2);
                System.out.println("O valor da soma é "+ s );
                break;

                case 4:
                E4Fibonacci calc = new E4Fibonacci();
                int r = calc.calcular(Integer.valueOf(JOptionPane.showInputDialog("Quer fibonacci de qual número?")));
                System.out.println("O valor é " + r);
                break;

                case 5:
                E5Media media = new E5Media();
                int[] notas = new int[3];

                    for (int i = 0; i < 3; i++) {
                       notas[i] =  Integer.valueOf(JOptionPane.showInputDialog("Qual é valor da nota " + (i+1) +" ?" ));
                    }


                media.recebeNotas(notas);
                int mediaFinal = media.calculaMedia();
                boolean aprovado = media.VerificaAprovado();
                
                System.out.println("A media do alune é: " + mediaFinal);
                System.out.println(" o Aluno está " + (aprovado? "Apovado!":"Reprovado!"));
                break;

                case 6:
                E6DinPar verifica = new E6DinPar();
                int quantidadeNumeros = Integer.valueOf(JOptionPane.showInputDialog("Quanto numeros quer digitar"));

                for (int i = 0 ; i < quantidadeNumeros; i++){
                    verifica.contar(Integer.valueOf(JOptionPane.showInputDialog("Digite um número")));
                }

                System.out.println("São " + verifica.getPar() + " números pares e " + verifica.getImpar() + " números impares");
                break;

                case 7:
                E7Invert inverte = new E7Invert();
                int valorInicial = Integer.valueOf(JOptionPane.showInputDialog("Digite um numero inteiro com algumas casas decimais"));
                int resultado = inverte.inverter(valorInicial);
                System.out.println(resultado);
                break;

                default:
                System.out.println("Atenção!!!");
                System.out.println("Escolha um exercicio de 1 até 7, ou 0 para sair!!!");
                break;
            }

        } while (op != 0);

    }

}

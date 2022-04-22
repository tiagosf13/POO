package src.Semana3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int investimento_inicial, juro, mes=1;
        boolean var=false;
        double valor_apos_juro;
        Scanner sc = new Scanner(System.in);
        while (var!=true) {
            try {
                System.out.println("Insira o valor investido:");
                investimento_inicial = sc.nextInt();
                if (investimento_inicial<1000 || investimento_inicial%1000!=0) {
                    System.out.println("Valor Incorreto! Insira um valor Positivo e múltiplo de 1000!");
                    System.exit(0);
                }
                System.out.println("Insira a percentagem de juro mensal:");
                juro = sc.nextInt();
                if (juro<0 || juro>5) {
                    System.out.println("Valor Incorreto! Insira um valor entre 9");
                    System.exit(0);
                }
                valor_apos_juro=investimento_inicial;
                for (int i=0;i<12;i++) {
                    System.out.println("Valor a pagar no mês Nº"+mes+": "+String.format("%.3f",valor_apos_juro)+"$");
                    valor_apos_juro+=(valor_apos_juro*juro)/100;
                    mes++;
                }
                var=true;
            }
            catch (InputMismatchException e) {
                System.out.println("Apenas são aceites Inteiros");
                sc.nextLine();
            }
        }
        sc.close();
    }
}
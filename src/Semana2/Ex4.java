package src.Semana2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        double montante_investido=0, juro_mensal=0, montante_inicial=0;
        boolean var=false;
        Scanner sc = new Scanner(System.in);
        while (var!=true) {
            try {
                System.out.println("Insira o montante investido:");
                montante_investido = sc.nextDouble();
                montante_inicial = montante_investido;
                System.out.println("Insira a taxa de juro mensal:");
                juro_mensal = sc.nextDouble();
                var=true;
            }
            catch (InputMismatchException e) {
                System.out.println("Erro Tente de Novo");
                sc.nextLine();
            }
        }
        sc.close();
        for (int i=1; i<=3;i++) {
            montante_investido+=montante_apos_juro(montante_investido, juro_mensal);
        }
        System.out.println("Com um investimento inicial de "+montante_inicial+"€ e com uma taxa de "+juro_mensal+"%, o montante ao fim de 3 meses será de "+montante_investido+"€");
    }
    public static double montante_apos_juro(double montante_investido, double juro_mensal) {
        double montante_adicional_juro;
        montante_adicional_juro = ((montante_investido*juro_mensal)/100);
        return (montante_adicional_juro);
    }
}

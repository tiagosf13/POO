package src.Semana2;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        double v1, d1, t1, v2, d2, t2, d_total, t_total, v_media;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira v1:");
        v1 = sc.nextDouble();
        System.out.println("Insira d1:");
        d1 = sc.nextDouble();
        t1 = d1/v1;
        System.out.println("Insira v2:");
        v2 = sc.nextDouble();
        System.out.println("Insira d2:");
        d2 = sc.nextDouble();
        sc.close();
        t2 = d2/v2;
        d_total= d1+d2;
        t_total = t1+t2;
        v_media = d_total/t_total;
        System.out.println("A velocidade média é "+v_media+" m/s");
    }
}

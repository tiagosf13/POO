package src.Semana2;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        double A,B,hipotenusa, angulo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor do cateto A:");
        A = sc.nextDouble();
        System.out.println("Insira o valor do cateto B:");
        B = sc.nextDouble();
        sc.close();
        hipotenusa = Math.sqrt(Math.pow(A, 2)+Math.pow(B, 2));
        angulo = Math.acos(A/hipotenusa);
        angulo = Math.toDegrees(angulo);
        System.out.println("O valor da hipotenusa é "+hipotenusa);
        System.out.print("O valor do ângulo entre o cateto A e a hipotenusa é "+angulo);
    }
}

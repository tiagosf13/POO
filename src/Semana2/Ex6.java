package src.Semana2;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int minutos, horas;
        int segundos, segundos_inicial;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira os segundos a serem convertidos:");
        segundos = sc.nextInt();
        sc.close();
        segundos_inicial = segundos;
        minutos = segundos/60;
        segundos = segundos%60;
        horas = minutos/60;
        minutos = minutos%60;
        System.out.println(segundos_inicial+" segundos são "+(int)horas+":"+(int)minutos+":"+(int)segundos);
    }
}

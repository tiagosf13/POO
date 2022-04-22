package src.Semana2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        double graus_celsius=0, graus_Fahrenheit;
        boolean var=false;
        Scanner sc = new Scanner(System.in);
        while (var!=true) {
            try {
                System.out.println("Insira os graus em Celsius a serem convertidos:");
                graus_celsius = sc.nextDouble();
                var = true;
            }
            catch (InputMismatchException e) {
                System.out.println("Erro Tente de Novo");
                sc.nextLine();
            }
        }
        sc.close();
        graus_Fahrenheit = 1.8*graus_celsius + 32;
        System.out.println(graus_celsius+"ºC são "+graus_Fahrenheit+" ºF" );
    }

}

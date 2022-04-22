package src.Semana3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        boolean var=false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número para fazer a sua contagem decrescente:");
        while (var!=true) {
            try {
                int numero = sc.nextInt();
                if (numero<0) {
                    main(new String[0]);
                }
                System.out.println("");
                while (numero>0) {
                    System.out.println(numero);
                    numero--;
                }
                var=true;
                sc.close();
            }
            catch (InputMismatchException e) {
                System.out.println("Só são aceites Inteiros Positivos");
                sc.nextLine();
            }
        }
    }
}
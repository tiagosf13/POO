package src.Semana2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        double km=0, milhas;
        boolean var=false;
        Scanner sc = new Scanner(System.in);
        while (var != true) {
            try {
                System.out.println("Insira a distância em Km:");
                km = sc.nextDouble();
                var = true;
            }    
            catch (InputMismatchException e) {
                System.out.println("Erro Tente de Novo");
                sc.nextLine();
            }
        }
        sc.close();
        milhas = km/1.609;
        System.out.println(km+" Km são "+String.format("%.2f", milhas)+" milhas."); 
    }
}

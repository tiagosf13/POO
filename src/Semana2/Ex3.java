package src.Semana2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        double quantidade_agua=0, temperatura_incial=0, temperatura_final=0, energia;
        boolean var=false;
        Scanner sc = new Scanner(System.in);
        while (var!=true)
            try {
                System.out.println("Insira a quantidade de água em Kg:");
                quantidade_agua = sc.nextDouble();
                System.out.println("Insira a Temperatura Inicial:");
                temperatura_incial = sc.nextDouble();
                System.out.println("Insira a Temperatura Final");
                temperatura_final = sc.nextDouble();
                var = true;
            }
            catch (InputMismatchException e) {
                System.out.println("Erro Tente de Novo");
                sc.nextLine();
            }
        sc.close();
        energia = quantidade_agua*(temperatura_final-temperatura_incial)*4184;
        System.out.println("A energia necessária para aquecer a água de "+temperatura_incial+"ºC a "+temperatura_final+"ºC é de "+energia+" Joules");
    }
}

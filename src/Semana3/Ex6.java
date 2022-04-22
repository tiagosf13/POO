package src.Semana3;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int mes,ano;    
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o mês no formato MM/AAAA:");
        input = sc.next();
        String[] input_split= input.split("/");
        mes =Integer.parseInt(input_split[0]);
        if (mes<1 || mes>12) {
            System.out.println("Apenas são aceites meses de 1 a 12!");
            System.exit(0);
        }
        else {
            ano = Integer.parseInt(input_split[1]);
            if (ano==0) { //consideramos anos negativos porque A.C existe
                System.out.println("Não existe ano 0!");
                System.exit(0);
            }
            if (ano%4==0 & mes==2) {
                if (ano%100==0 & ano%400==0) {
                    System.out.println("O mês tem 29 dias");
                    System.exit(0);
                }
                else {
                    if (ano%100==0) {
                        System.out.println("O mês tem 28 dias");
                    }
                    else {
                        System.out.println("O mês tem 29 dias");
                    }
                }
            }
            else {
                if (mes==2) {
                    System.out.println("O mês tem 28 dias");
                    System.exit(0);
                }
                else {
                    if (mes%2==0) {
                        System.out.println("O mês tem 30 dias");
                        System.exit(0);
                    }
                    else {
                        System.out.println("O mês tem 31 dias");
                    }
                }
            }
        }
        sc.close();
    }
}
package src.Semana3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        double numeros, soma_total=0, media;
        boolean var=false;
        int indice=0;

        ArrayList<Double> mynumbers = new ArrayList<Double>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira os números reais a serem lidos:");
        while (var!=true) {
            try {
                numeros=sc.nextDouble();
                if (mynumbers.size()>0) {
                    if (numeros==(double) mynumbers.get(0)) {
                        var=true;
                        break;
                    }
                }
                mynumbers.add(numeros);
            }
            catch (Exception e) {
                System.out.println("Apenas são aceites Inteiros!");
                sc.nextLine();
            }
        }
        sc.close();
        System.out.println("Valor Máximo: "+Collections.max(mynumbers)); //elemento maximo na lista
        System.out.println("Valor Minimo: "+Collections.min(mynumbers));//elemento minimo na lista
        for (int i=0;i<mynumbers.size();i++) {
            soma_total+=(Double) mynumbers.get(indice);
            indice++;
        }
        media = soma_total/mynumbers.size();
        System.out.println("Média dos valores inseridos: "+media);//media dos valores lidos
        System.out.println("Foram lidos "+mynumbers.size()+" números");//numero de valores lidos
    }
}
package src.Semana2;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        double distancia;
        double[] p1 = new double[2]; 
        double[] p2 = new double[2]; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a coordenada x do ponto p1:");
        p1[0] = sc.nextDouble();
        System.out.println("Insira a coordenada y do ponto p1:");
        p1[1] = sc.nextDouble();
        System.out.println("Insira a coordenada x do ponto p2:");
        p2[0] = sc.nextDouble();
        System.out.println("Insira a coordenada y do ponto p2:");
        p2[1] = sc.nextDouble();
        sc.close();
        distancia = Math.sqrt((Math.pow(p1[0]-p2[0], 2))+Math.pow(p1[1]-p2[1], 2));
        System.out.println("A distância entre os pontos p1("+p1[0]+","+p1[1]+")"+" e p2("+p2[0]+","+p2[1]+") é "+distancia);
    }
}

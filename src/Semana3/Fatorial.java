package src.Semana3;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        long numero;
        boolean var=false;
        Scanner sc = new Scanner(System.in);
        while (var!=true) {
            try {
                System.out.println("Insira um número para calcular o seu fatorial:");
                numero = sc.nextInt();
                sc.close();
                System.out.println("O fatorial de "+numero+" é "+ fatorial(numero));
                long resultado=1;
                while (numero>0) { //para ver se com um ciclo do while funciona
                    resultado*=numero;
                    numero-=1;
                }
                System.out.println("Fatorial while "+resultado);
                var=true;
            }
            catch (Exception e) {
                System.out.println("Só são aceites Inteiros!");
                sc.nextLine();
            }
        }
    }

    public static long fatorial(Long numero) {
        if (numero==1) {
            System.out.println("");
            return (1);
        }
        else {
            System.out.println(numero); //so para ver se funciona
            return ((numero)*fatorial(numero-1));
        }
    }
}

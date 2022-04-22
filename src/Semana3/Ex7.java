package src.Semana3;
import java.util.Random;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        int numero, contador=0, input;
        String resposta;
        boolean tentativa=false, var=false;
        Random gerador = new Random();
        numero = gerador.nextInt(100);
        Scanner sc = new Scanner(System.in);
        while (var!=true) {
            try {
                while (tentativa!=true) {
                    System.out.println("Insira a sua tentativa");
                    input = sc.nextInt();
                    if (input==numero){
                        tentativa=true;
                        System.out.println("Acertou!!!");
                        System.out.println("Tentativas Feitas: "+contador);
                        break;
                    }
                    if (input<numero) {
                        contador++;
                        System.out.println("Baixo");
                    }
                    else {
                        contador++;
                        System.out.println("Alto");
                    }
                }
                var=true;
                System.out.println("Pretende continuar?Prima (S)im");
                resposta = sc.next();
                if (resposta.equals("S")|| resposta.equals("Sim")) {
                    main(new String[0]);
                }
                else {
                    System.exit(0);
                }
            }
            catch (Exception e) {
                System.out.println("Apenas são aceites números inteiros ou string de confirmação!");
                sc.nextLine();
            }
        }
        sc.close();
    }
}
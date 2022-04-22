package src.Semana3;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int number;
        boolean var=false, dec=true;
        Scanner sc = new Scanner(System.in);
        while (var!=true) {
            try {
                System.out.println("Insira um número inteiro positivo:");
                number = sc.nextInt();
                if (number<0) {
                    main(new String[0]);
                }
                else {
                    for (int i=2;i<9;i++) {
                        if ((number%i==0) & (number!=i)) {
                            System.out.println("O número "+number+" não é primo");
                            dec=false;
                            break;
                        }
                    }
                    if (dec==true) {
                        System.out.println("O número "+number+" é primo");
                    }
                }
                var = true;
                sc.close();
            }
            catch (Exception e) {
                System.out.println("Só são aceites Inteiros!");
                sc.nextLine();
            }
        }
    }
}
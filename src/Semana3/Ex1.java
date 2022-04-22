package src.Semana3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        double notaPin, notaTin, notaP, notaT, nota_final;
        boolean var=false;
        Scanner sc = new Scanner(System.in);
        while (var!=true){
            try {
                System.out.println("Insira a nota da Componente Prática:");
                notaPin = sc.nextDouble();
                if (notaPin<0 || notaPin>20) {
                    System.out.println("Valor incorreto");
                    main(new String[0]);
                }
                else {
                    System.out.println("Insira a nota da Componente Teórica:");
                    notaTin = sc.nextDouble();
                    if (notaTin<0 || notaTin>20) {
                        System.out.println("Valor incorreto");
                        main(new String[0]);
                    }
                    else {
                        if (notaPin<7 || notaTin<7) {
                            System.out.println("Código 66");
                        }
                        else {
                            notaP = Math.round(notaPin*100.0)/100.0;
                            notaT = Math.round(notaTin*100.0)/100.0;
                            nota_final = (0.4*notaT+0.6*notaP);
                            System.out.println("Nota final: "+(int)Math.ceil(nota_final));
                        }
                    }
                }
                var=true;
            }
            catch (InputMismatchException e) {
                System.out.println("Tipo de valor inserido nao suportado!");
                sc.nextLine();
            }
        }
        sc.close();
    }
}

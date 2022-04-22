package src.Semana3;
import java.util.Random;

public class Ex8 {
    public static void main(String[] args) {
        double notaPin, notaTin, notaP, notaT, nota_final;
        int aluno=0;
        Random gerador = new Random();
        double notas[][] = new double[16][3];
        for (int i=0;i<16;i++) {
            notas[aluno][0] = gerador.nextDouble(20); //gera automaticamente nota teorica e pratica
            notas[aluno][1] = gerador.nextDouble(20);
            aluno++;
        }
        aluno=0;
        for (int i=0;i<16;i++) {
            notaPin = notas[aluno][1];
            if (notaPin<0 || notaPin>20) {
                System.out.println("Valor incorreto");
                main(new String[0]);
            }
            else {
                notaTin = notas[aluno][0];
                if (notaTin<0 || notaTin>20) {
                    System.out.println("Valor incorreto");
                    main(new String[0]);
                }
                else {
                    if (notaPin<7 || notaTin<7) {
                        notas[aluno][2]=66;
                    }
                    else {
                        notaP = Math.round(notaPin*100.0)/100.0;
                        notaT = Math.round(notaTin*100.0)/100.0;
                        nota_final = (0.4*notaT+0.6*notaP);
                        notas[aluno][2]=(int)Math.ceil(nota_final);
                    }
                }
            }
            aluno++;
        }
        aluno=0;
        System.out.format("%5s %7s %7s %n", "NotaT", "NotaP", "Pauta"); //imprimir a tabela
        for (int i=0;i<16;i++) {
            System.out.format("%5.1f %7.1f %7d %n",notas[aluno][0],notas[aluno][1],(int) notas[aluno][2]);
            aluno++;
        }
    }
}
package src.Semana4;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args){
        String frase, nova_frase="";
        Scanner sc = new Scanner(System.in);
        frase = sc.nextLine();
        String palavras [] = frase.split(" ");
        for(int i=0;i<palavras.length;i++){
            if(palavras[i].length()>=3){
                nova_frase+=palavras[i].charAt(0);
            }
        }
        sc.close();
        System.out.println("Acrónimo: "+nova_frase);
    }
}

package src.Semana4;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        String frase_inserida, texto_verde = "\u001B[32m", texto_normal = "\u001B[m";;
        boolean var=false;
        Scanner sc = new Scanner(System.in);
        while (var!=true){
            try {
                System.out.println(texto_normal+"Insira a sua frase:");
                frase_inserida = sc.nextLine();
                System.out.println("Frase em minúsculas: "+texto_verde+frase_inserida.toLowerCase());
                System.out.println(texto_normal+"Último caractere inserido: "+texto_verde+frase_inserida.charAt(frase_inserida.length()-1));
                System.out.println(texto_normal+"Três primeiros caracteres inseridos: "+texto_verde+frase_inserida.charAt(0)+","+frase_inserida.charAt(1)+","+frase_inserida.charAt(2));
                System.out.println(texto_normal+"Metade da frase inserida: "+texto_verde+frase_inserida.substring(0,frase_inserida.length()/2 ));//1
                System.out.println(texto_normal+"Frase concatonada: "+texto_verde+frase_inserida.concat(", Olá eu sou uma string concatonada!"));//2
                System.out.print(texto_normal+"Comparação com a frase \"tiago\": ");//3
                if (frase_inserida.compareTo("tiago")<0) {
                    System.out.println(texto_verde+"Diferentes"+texto_normal);
                }
                else if (frase_inserida.compareTo("tiago")==0) {
                    System.out.println(texto_verde+"Iguais"+texto_normal);
                }
                else {
                    System.out.println(texto_verde+"Presente na sua frase"+texto_normal);
                }
                var = true;
            }
            catch (Exception e) {
                System.out.println(texto_verde+"Apenas são aceites letras!!"+texto_normal);

            }
        }
        sc.close();
    }
}

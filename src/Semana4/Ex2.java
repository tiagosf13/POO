package src.Semana4;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        String frase;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a sua frase:");
        frase = sc.nextLine();
        System.out.println("Número de digitos inseridos: "+countDigits(frase));
        System.out.println("Número de espaços inseridos: "+whiteSpaces(frase));
        System.out.println("Avaliação da frase: "+onlyLower(frase));
        System.out.println("Frase apenas com um espaço: "+oneSpace(frase));
        System.out.println("Avaliação quanto a palíndromo: "+isPalindromo(frase));
        sc.close();
    }

    public static int countDigits(String frase_inserida) {
        int index=0,digits_counter=0;
        for (int i=0;i<frase_inserida.length();i++) {
            if (Character.isDigit(frase_inserida.charAt(index))) {
                digits_counter++;
            }
            index++;
        }
        return(digits_counter);
    }

    public static int whiteSpaces(String frase_inserida) {
        String frase_sem_espacos;
        int espacos;
        frase_sem_espacos = frase_inserida.replace(" ", "");
        espacos = frase_inserida.length()-frase_sem_espacos.length();
        return (espacos);
    }

    public static String onlyLower(String frase_inserida) {
        String frase_sem_espacos;
        int index=0;
        if (countDigits(frase_inserida)!=0) {
            return("A frase contem números");
        }
        frase_sem_espacos = frase_inserida.replace(" ", "");
        for (int i=0;i<frase_sem_espacos.length();i++) {
            if (!Character.isLowerCase(frase_sem_espacos.charAt(index))) {
                return("A frase contem maiúsculas");
            }
            index++;
        }
        return("A frase contem só contem minúsculas");
    }

    public static String oneSpace(String frase_inserida){
        char last;
        last = frase_inserida.charAt(0);
        String frase="";
        frase+=last;
        for(int i=1;i<frase_inserida.length();i++){
            if(!(frase_inserida.charAt(i) ==' ' && frase_inserida.charAt(i+1)==' ')) {
                frase+=frase_inserida.charAt(i);
            }
            last=frase_inserida.charAt(i);
        }
        return(frase);
    }

    public static String isPalindromo(String frase_inserida){
        String backwards_frase="";
        for (int i=frase_inserida.length()-1;i>=0;i--){
            backwards_frase+=frase_inserida.charAt(i);
        }
        if (frase_inserida.equals(backwards_frase)){
            return("É um palíndromo");
        }
        else {
            return("Não é um palíndromo");
        }
    }
}

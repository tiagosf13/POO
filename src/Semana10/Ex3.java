package src.Semana10;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args){
        String frase, caractere;

        Scanner sc = new Scanner(System.in);
        
        HashMap<String, ArrayList<Integer>> dic = new HashMap<>();

        System.out.println("Insira uma frase:");
        frase = sc.nextLine();

        for (int i = 0; i<frase.length(); i++){
            caractere = ""+frase.charAt(i);
            if (!dic.containsKey(caractere)){
                dic.put(caractere, new ArrayList<>(Arrays.asList(i)));    
            }
            else{
                dic.get(caractere).add(i);
            }
            
        }

        System.out.println(dic.toString());
        
    }
}

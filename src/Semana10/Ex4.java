package src.Semana10;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;

public class Ex4 {
    public static void main(String[] args) throws IOException{ 
        Scanner input = new Scanner(new FileReader("words.txt"));
        
        ArrayList<String> lista_nomes = new ArrayList<>();
        
        while (input.hasNext()) { 
            String word = input.next(); 
            char ultima_letra, letra;

            ultima_letra = word.charAt(word.length()-1);
            boolean palavra_tem_caractere = false;
            if (word.length()>2 && ultima_letra == 'S'){
                for (int i = 0; i<word.length(); i++){
                    letra = word.charAt(i);
                    if (Character.isAlphabetic(letra)){
                        if (word.indexOf(letra) == word.length()-1){
                            if (!palavra_tem_caractere){
                                lista_nomes.add(word);
                            }
                        }
                    }
                    else{
                        palavra_tem_caractere = true;
                    }
                }
            }
        }
        System.out.println(lista_nomes); 
    }
}
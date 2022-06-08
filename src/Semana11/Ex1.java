package src.Semana11;

import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;

public class Ex1 {
    public static void main(String[] args) throws IOException{

        String word, palavra, first_word, second_word;
        HashMap<String, HashMap<String, Integer>> dic = new HashMap<>();
        ArrayList<String> lista_palavras = new ArrayList<>();
        Scanner input = new Scanner(new FileReader("major.txt", Charset.forName("utf-8")));
        input.useDelimiter("[\\t\\n.,:'‘’;?!-*{}=+&/()\\[\\]”“\"\\' ]+");

        while (input.hasNext()){

            word = input.next();
            
            lista_palavras.add(word);
            
            for(int i = 0 ; i<lista_palavras.size() ; i++){
                palavra = lista_palavras.get(i);
                if (palavra.length()<3){
                    lista_palavras.remove(i);
                }
            }
        }
        for (int i = 0; i<lista_palavras.size()-1 ; i++){
            first_word = lista_palavras.get(i);
            second_word = lista_palavras.get(i+1);
            HashMap<String, Integer> dic2 = new HashMap<>();
            if (!dic.containsKey(first_word)){ // caso o dicionario nao contenha a primeira palavra como chave
                dic2.put(second_word, 1);
                dic.put(first_word, dic2);
            }
            else{ // caso o dicionario contenha a primeira palavra como chave
                if (dic.get(first_word).containsKey(second_word)){ // caso o dicionario2 contenha a segunda palavra, ou seja a sequencia ja existe
                    dic.get(first_word).put(second_word, dic.get(first_word).get(second_word)+1);
                }
                else{ // caso o dicionario 2 nao contenha a segunda palavra, ou seja, a sequencia nao existe
                    dic.get(first_word).put(second_word, 1);
                }
            }
        }
        for (String key : dic.keySet()){
            System.out.println(key+"="+dic.get(key));
        }
    }
}
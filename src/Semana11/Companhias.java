package src.Semana11;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Companhias {
    
    public HashMap<String, ArrayList<String>> carregar_companhias(String ficheiro) throws IOException{
        String word;
        String[] linha;
        ArrayList<String[]> lista_companhias = new ArrayList<>();
        HashMap<String, ArrayList<String>> dic = new HashMap<>();

        Scanner input = new Scanner(new FileReader(ficheiro, Charset.forName("utf-8")));
        
        while (input.hasNext()){

            word = input.nextLine();

            linha = word.split("	");
            lista_companhias.add(linha);
        }
        lista_companhias.remove(0);
        
        for (String[] sub_list : lista_companhias){
            if (sub_list.length == 3){
                dic.put(sub_list[0], new ArrayList<>(Arrays.asList(sub_list[1], sub_list[2])));
            }
            else{
                dic.put(sub_list[0], new ArrayList<>(Arrays.asList(sub_list[1])));
            }
        }
        return dic;
    }

}

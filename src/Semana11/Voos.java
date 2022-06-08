package src.Semana11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;
import java.nio.charset.Charset;

public class Voos{
    
    public HashMap<String, ArrayList<String>> carregar_voos(String ficheiro) throws IOException{

        String word;
        String[] linha;
        ArrayList<String[]> lista_voos = new ArrayList<>();
        HashMap<String, ArrayList<String>> dic = new HashMap<>();

        Scanner input = new Scanner(new FileReader(ficheiro, Charset.forName("utf-8")));

        while(input.hasNext()){
            
            word = input.nextLine();
            linha = word.split("	");
            lista_voos.add(linha);

        }

        lista_voos.remove(0);

        for (String[] sub_list : lista_voos){
            if (sub_list.length == 4){
                dic.put(sub_list[0], new ArrayList<>(Arrays.asList(sub_list[1], sub_list[2], sub_list[3])));
                //dic.put(sub_list[0], sub_list[1]+" "+sub_list[2]+" "+sub_list[3]);
            }
            else{
                dic.put(sub_list[0], new ArrayList<>(Arrays.asList(sub_list[1], sub_list[2], " ")));
                //dic.put(sub_list[0], sub_list[1]+" "+sub_list[2]);
            }
        }
        return dic;
    }
}

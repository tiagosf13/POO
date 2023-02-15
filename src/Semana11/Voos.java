package src.Semana11;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;
import java.nio.charset.Charset;

public class Voos{
    
    public ArrayList<String[]> carregar_voos(String ficheiro) throws IOException{

        String word;
        String[] linha;
        ArrayList<String[]> lista_voos = new ArrayList<>();

        Scanner input = new Scanner(new FileReader(ficheiro, Charset.forName("utf-8")));

        while(input.hasNext()){
            
            word = input.nextLine();
            linha = word.split("	");
            lista_voos.add(linha);

        }

        lista_voos.remove(0);
        return lista_voos;
    }
}

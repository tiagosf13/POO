package src.Semana11;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

public class Companhias {
    
    public ArrayList<String[]> carregar_companhias(String ficheiro) throws IOException{
        String word;
        String[] linha;
        ArrayList<String[]> lista_companhias = new ArrayList<>();

        Scanner input = new Scanner(new FileReader(ficheiro, Charset.forName("utf-8")));
        
        while (input.hasNext()){

            word = input.nextLine();

            linha = word.split("	");
            lista_companhias.add(linha);
        }
        lista_companhias.remove(0);
        return lista_companhias;
    }

}

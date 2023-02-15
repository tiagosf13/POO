package RandomTicketTester;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.Scanner;

import src.Semana9.Pessoa;

public class RandomTickets {
    
    HashMap<String, Integer> dic_bilhetes = new HashMap<>();
    ArrayList<ArrayList<String>> lista_pessoas = new ArrayList<>();

    public RandomTickets() throws IOException{
        dic_bilhetes = carregar_bilhetes();
    }

    public HashMap<String, Integer> carregar_bilhetes() throws IOException{

        String word;
        String[] linha;
        ArrayList<String[]> lista_bilhetes = new ArrayList<>();
        

        Scanner input = new Scanner(new FileReader("Lista_festivais.txt", Charset.forName("utf-8")));

        while(input.hasNext()){
            
            word = input.nextLine();
            linha = word.split("	");
            lista_bilhetes.add(linha);

        }

        lista_bilhetes.remove(0);

        for (String[] element : lista_bilhetes){
            dic_bilhetes.put(element[2], Integer.parseInt(element[element.length-1]));
        }

        return dic_bilhetes;
    }

    public int getRandomTicket(Pessoa pessoa) throws IOException{
        int numero_festivais;
        String festival = "";
        
        Random random = new Random();

        int index_festival = random.nextInt(5);
        int bilhetes_atribuir = random.nextInt(3);

        for (String element : dic_bilhetes.keySet()){
            if (index_festival == 3){
                if (dic_bilhetes.get(element) > bilhetes_atribuir){
                    dic_bilhetes.put(element, dic_bilhetes.get(element)-bilhetes_atribuir);
                    festival = element;
                }
            }
        }
        lista_Pessoas(pessoa.getName(), bilhetes_atribuir,festival);
        return (bilhetes_atribuir);
    }

    public ArrayList<ArrayList<String>> lista_Pessoas(String nome, int numero_bilhetes, String festival){
        ArrayList<String> sublista_bilhetes = new ArrayList<>();
        sublista_bilhetes.add((nome));
        sublista_bilhetes.add((festival));
        sublista_bilhetes.add(Integer.toString(numero_bilhetes));
        lista_pessoas.add(sublista_bilhetes);
        return (lista_pessoas);
    }
    
    public ArrayList<ArrayList<String>> listPessoas(){
        return (lista_pessoas);
    }
}

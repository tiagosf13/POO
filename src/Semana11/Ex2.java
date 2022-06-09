package src.Semana11;

import java.util.ArrayList;
import java.util.HashMap;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex2 {

    public static void main(String[] args) throws IOException{
        
        String voo, companhia, origem, atraso, obs, minutos_chegada_formatado, hora_chegada_formatado, tempo_medio_ecra;
        ArrayList<String[]> lista_voos, lista_companhias;
        HashMap<String, ArrayList<String>> dic_atrasos = new HashMap<>();
        HashMap<String, Integer> dic_chegadas = new HashMap<>();
        ArrayList<String[]> lista_atrasos = new ArrayList<>();
        Companhias conjunto_companhias = new Companhias(); // criar um objeto para colocar o conjunto de companhias
        Voos conjunto_voos = new Voos(); // criar um objeto com o conjunto de voos
        
        lista_companhias = conjunto_companhias.carregar_companhias("Companhias.txt"); // carregar a lista de companhias para o objeto conjunto_companhias
        lista_voos = conjunto_voos.carregar_voos("voos.txt"); // carregara lista de voos para o objeto conjunto_voos

        PrintWriter writer = new PrintWriter("Infopublico.txt", "utf-8"); // caneta do Inforpublico
        PrintWriter writer2 = new PrintWriter("cidades.txt", "utf-8"); // caneta do cidades.txt

        writer.printf("%-8s%-12s%-23s%-23s%-10s%-8s\n", "Hora", "Voo", "Companhia", "Origem", "Atraso", "Obs"); // escrita do Infopublico.txt
        writer2.printf("%-24s%-12s\n", "Origem", "Voos"); // escrita do cidades.txt

        for(String[] voo_individual : lista_voos){ // para cada linha da lista de voos, associar variaveis aos elementos da linha
            voo = voo_individual[1];
            origem = voo_individual[2];
            companhia="";
            for (String[] companhia_individual : lista_companhias){ // para cada linha da lista de voos,
                if (voo.contains(companhia_individual[0])){         //  percorrer a lista de companhias linha a linha,
                    companhia = companhia_individual[1];            // e verificar se a empresa do voo existe na lista de companhia
                    break;                                          // se existir, associar variavel companhia ao nome completo da companhia
                }
            }
            if (voo_individual.length == 4){ // se a linha na lista de voos contiver atrasos,
               atraso = voo_individual[3];   // associar variavel atraso ao elemento atraso da linha
            }
            else{
                atraso = " "; // se nao tiver atraso, criar um atraso nulo
            }
            if (!atraso.equals(" ")){  //se existir atraso na linha da lista de voos, formatar o atraso para ser impresso
                String[] new_key = voo_individual[0].split(":");
                String[] new_atraso = atraso.split(":");

                int horas_prevista = Integer.parseInt(new_key[0]);
                int minutos_prevista = Integer.parseInt(new_key[1]);
                int horas_atraso = Integer.parseInt(new_atraso[0]);
                int minutos_atraso = Integer.parseInt(new_atraso[1]);

                int minutos_chegada = minutos_prevista+minutos_atraso;
                int hora_chegada = horas_prevista+horas_atraso;
                minutos_chegada_formatado = "";
                hora_chegada_formatado = "";
                if (minutos_chegada>=60){ // se os minutos forem maiores ou iguais a 60, adicionar uma hora e ajustar minutos
                    hora_chegada += 1;
                    minutos_chegada -= 60;
                    if(minutos_chegada<10){
                        minutos_chegada_formatado = "0"+minutos_chegada;
                    }
                    else{
                        minutos_chegada_formatado = Integer.toString(minutos_chegada);
                    }
                    if(hora_chegada<10){
                        hora_chegada_formatado = "0"+hora_chegada;
                    }
                    else{
                        hora_chegada_formatado = Integer.toString(hora_chegada);
                    }
                }
                else{ // se a hora nao precisar de ser ajustada, formatar da seguinte maneira
                    minutos_chegada_formatado = Integer.toString(minutos_chegada);
                    hora_chegada_formatado = Integer.toString(hora_chegada);
                }
                obs = "Previsto: "+hora_chegada_formatado+":"+minutos_chegada_formatado; // guardar em obs o valor da coluna obs da lista Infopublico, a hora prevista
                ArrayList<String> lista = new ArrayList<>();
                if (!dic_atrasos.containsKey(companhia)){ // se a companhia que tiver atrasos na linha em questa  
                    lista.add(atraso);                    //nao estiver registada no dicionario de atrasos,
                    dic_atrasos.put(companhia, lista);    //regista-la
                }
                else{
                    dic_atrasos.get(companhia).add(atraso); // se ja estiver registada como tendo um atraso, adicionar o novo atraso(do voo da linha em questao)
                }
            }
            else{
                obs = ""; // se nao houVer atraso nenhum, a hora prevista vai ser vazia
            }
            if (!dic_chegadas.containsKey(origem)){ // se o dicionario de cidades de chegada nao contiver nenhum voo de chegada
                dic_chegadas.put(origem, 1); // adicionar a origem e o numero de voos com a mesma cidade de origem
            }
            else{
                dic_chegadas.put(origem, dic_chegadas.get(origem)+1); // caso o dicionario de cidades de chegada contenha um voo de chegada, adicionar mais um voo
            }
            writer.printf("%-8s%-12s%-23s%-23s%-10s%-8s\n", voo_individual[0], voo, companhia, origem, atraso, obs); // escrever o ficheiro Infopublico
        }

        for(String element : dic_chegadas.keySet()){  // para cada cidade de origem no dicionario de cidades de chegada, 
            writer2.printf("%-24s%-12d\n", element, dic_chegadas.get(element)); // escrever no ficheiro cidades.txt a informacao dessa cidade
        }

        System.out.printf("%-20s%-12s\n", "Companhia", "Atraso");
            for (String key : dic_atrasos.keySet()){ // por cada companhia com um voo atrasado
                int tempo_medio = 0;
                tempo_medio_ecra = "";
                for(String tempo_atraso : dic_atrasos.get(key)){ // por cada tempo de atraso na companhia com um voo atrasado
                    String[] tempo_split = tempo_atraso.split(":"); // calcular o tempo total de atraso de todos os voos
                    Integer tempo_atrasado_int = Integer.parseInt(tempo_split[1]);
                    tempo_medio += tempo_atrasado_int;  
                }
                tempo_medio = tempo_medio/dic_atrasos.get(key).size(); // calcular o tempo medio de atraso entre os voos da mesma companhia
                if (tempo_medio<10){ // formatar o tempo
                    tempo_medio_ecra  = "0"+tempo_medio;
                }
                else{ // caso ja se encontre formatado
                    tempo_medio_ecra = Integer.toString(tempo_medio);
                }
                String[] sub_list = {tempo_medio_ecra, key}; // adicionar ao arraylist, uma lista com o tempo medio de atraso a ser apresentado,
                lista_atrasos.add(sub_list); //  como tambem a companhia
            }

        for(String[] element : lista_atrasos){ // por cada lista de atrasos medios por companhia
            System.out.printf("%-20s%-12s\n", element[1], "00:"+element[0]); //imprimir a informacao do atraso e da companhia 
        }

        writer.close();
        writer2.close();
    }
}
package src.Semana11;

import java.util.ArrayList;
import java.util.HashMap;
import java.io.IOException;
import java.text.SimpleDateFormat;  

public class Ex2 {

    public static void main(String[] args) throws IOException{
        
        String voo, companhia, origem, atraso, obs, minutos_chegada_formatado, hora_chegada_formatado;
        HashMap<String, ArrayList<String>> dic_companhias, dic_voos;
        Companhias conjunto_companhias = new Companhias();
        Voos conjunto_voos = new Voos();
        
        dic_companhias = conjunto_companhias.carregar_companhias("Companhias.txt");
        dic_voos = conjunto_voos.carregar_voos("voos.txt");

        for (String key : dic_companhias.keySet()){
            System.out.println(key+"="+dic_companhias.get(key));
        }

        //for (String key : dic_voos.keySet()){
        //    System.out.println(key+"="+dic_voos.get(key));
        //}

        System.out.printf("%-12s%-12s%-23s%-23s%-12s%-12s\n", "Hora", "Voo", "Companhia", "Origem", "Atraso", "Obs");

        for(String key : dic_voos.keySet()){
            voo = dic_voos.get(key).get(0);
            origem = dic_voos.get(key).get(1);
            companhia="";
            String[] lst = voo.split(" ");
            for (String chave : dic_companhias.keySet()){
                //System.out.println("chave "+chave);
                //System.out.println("lst[0] "+lst[0]);
                //System.out.println(dic_companhias.get(chave).get(0));
                if (lst[0].strip().contains(chave.strip())){
                    //System.out.println("igual aqui em cima");
                    companhia = dic_companhias.get(chave).get(0);
                    break;
                }
            }
            atraso = dic_voos.get(key).get(2);
            if (!atraso.equals(" ")){
                String[] new_key = key.split(":");
                String[] new_atraso = atraso.split(":");

                int horas_prevista = Integer.parseInt(new_key[0]);
                int minutos_prevista = Integer.parseInt(new_key[1]);
                int horas_atraso = Integer.parseInt(new_atraso[0]);
                int minutos_atraso = Integer.parseInt(new_atraso[1]);

                int minutos_chegada = minutos_prevista+minutos_atraso;
                int hora_chegada = horas_prevista+horas_atraso;
                minutos_chegada_formatado = "";
                hora_chegada_formatado = "";
                if (minutos_chegada>=60){
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
                else{
                    minutos_chegada_formatado = Integer.toString(minutos_chegada);
                    hora_chegada_formatado = Integer.toString(hora_chegada);
                }
                obs = "Previsto: "+hora_chegada_formatado+":"+minutos_chegada_formatado;
            }
            else{
                obs = "";
            }
            System.out.printf("%-12s%-12s%-23s%-23s%-12s%-12s\n", key, voo, companhia, origem, atraso, obs);
        }
        
    }
}

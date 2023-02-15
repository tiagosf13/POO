package srcfinal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

import javax.swing.event.CaretListener;

public class EventManager {
    
    String nome, nome_cliente, localidade_cliente;

    TreeMap<String, String> dic_clientes = new TreeMap<>(); //dic clientes
    TreeMap<Client, String> dic_eventos = new TreeMap<>(); //dic eventos
    

    EventManager(String nome){
        this.nome = nome;
    }

    public Client addClient(String nome_cliente, String localidade_cliente){
        if ()
        return null;
    }

    public Event addEvent(Client cliente, LocalDate data) {
        if (dic_eventos.containsKey(cliente)){
            if (cliente.getClient(this.nome) == false){
                if()
            }
        }
        return null;
    }
}

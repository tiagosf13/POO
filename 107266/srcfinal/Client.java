package srcfinal;

import java.util.TreeMap;

public class Client {
    
    String nome, localidade;
    TreeMap<String, String> dic_clientes = new TreeMap<>(); //dic clientes

    Client(String nome, String localidade){
        this.nome = nome;
        this.localidade = localidade;
    }

    public void setClient(String nome){
        if (dic_clientes.containsKey(nome)){
            if(!dic_clientes.get(nome).equals(localidade)){
                dic_clientes.put(nome, this.localidade);
            }
        }
        else{
            dic_clientes.put(nome, this.localidade);
        }
        
    }

    public boolean getClient(String nome){
        if (dic_clientes.containsKey(nome)){
            return true;
        }
        else{
            return false;
        }
    }
}

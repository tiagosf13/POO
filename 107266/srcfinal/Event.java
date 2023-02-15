package srcfinal;

import java.time.LocalDate;
import java.util.TreeMap;

public class Event implements IEvent {

    Client cliente;
    LocalDate data;
    
    TreeMap<Client, LocalDate> dic_datas = new TreeMap<>(); //dic eventos

    Event(Client cliente, LocalDate data){
        this.cliente = cliente;
        this.data = data;
        addData(this.cliente, this.data);
    }

    public void addData(Client cliente, LocalDate data){
        if(dic_datas.containsKey(cliente)){
            if (!dic_datas.get(cliente).equals(data)){
                dic_datas.put(cliente, data);
            }
        }
    }   

    @Override
    public Event addActivity(Activity activity) {
        
        return null;
    }

    @Override
    public LocalDate getDate() {
        return this.data;
    }

    @Override
    public double getTotalCost() {
        
        return 0;
    }
    

}

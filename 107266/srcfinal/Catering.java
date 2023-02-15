package srcfinal;

import java.util.TreeMap;

public class Catering extends Activity {
    
    private Option opcao;
    private int participantes;

    TreeMap<Option, Integer> dic = new TreeMap<>(); //dic eventos

    Catering(Option opcao, int participantes){
        this.opcao = opcao;
        this.participantes = participantes;
    }

    public void addAtividade(Option opcao, int participantes){
        dic.put(opcao, participantes);
    }

    public enum Option{
        FULL_MENU,
        DRINKS_AND_SNACKS,
        LIGHT_BITES,
    }
}

package srcfinal;

public class Sport extends Activity {

    private Modality modalidade;
    private int participantes;

    TreeMap<Option, Integer> dic_eventos = new TreeMap<>(); //dic eventos
    
    Sport(Modality modalidade, int participantes){
        this.modalidade = modalidade;
        this.participantes = participantes;
    }

    public void addAtividade(Option opcao, int participantes){
        dic.put(opcao, participantes);
    }

    public enum Modality{
        KAYAK,
        BIKE;
    }
}



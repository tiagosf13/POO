package srcfinal;

public class Culture extends Activity{
    

    private Option opcao;
    private int participantes;

    Culture(Option opcao, int participantes){
        this.opcao = opcao;
        this.participantes = participantes;
    }

    public enum Option{
        RIVER_TOUR,
        WINE_TASTING,
        ARCHITECTURAL_TOUR;
    }
}

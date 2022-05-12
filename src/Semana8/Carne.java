package src.Semana8;

public class Carne extends Alimento{
    
    public VariedadeCarne variedade;

    Carne(VariedadeCarne variedade, double proteinas, double calorias, double peso){
        super(proteinas, calorias, peso);
        this.variedade = variedade;
    }

    public String toString() {
        return "Carne " + this.variedade + ", Proteinas " + this.proteinas + ", Calorias " + this.calorias + ", Peso " + this.peso;
    }
}

enum VariedadeCarne{
    VACA, PORCO, PERU, FRANGO, OUTRA;
}
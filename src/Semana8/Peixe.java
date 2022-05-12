package src.Semana8;

public class Peixe extends Alimento{
    
    public TipoPeixe tipo;

    Peixe(TipoPeixe tipo, double proteinas, double calorias, double peso){
        super(proteinas, calorias, peso);
        this.tipo = tipo;
    }

    @Override
    public String toString(){
        return "Peixe " + this.tipo + ", Proteinas " + this.proteinas + ", Calorias " + this.calorias + ", Peso " + this.peso;
    }
}

enum TipoPeixe{
    CONGELADO, FRESCO;
}

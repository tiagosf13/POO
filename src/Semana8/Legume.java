package src.Semana8;

public class Legume extends Alimento {
    
    public String nome;
    public boolean vegetariano = true;

    Legume(String nome, double proteinas, double calorias, double peso){
        super(proteinas, calorias, peso);
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Legume " + this.nome + ", Proteinas " + this.proteinas + ", Calorias " + this.calorias + ", Peso " + this.peso;
    }

    @Override
    public boolean getVegetariano() {
        return this.vegetariano;
    }
}

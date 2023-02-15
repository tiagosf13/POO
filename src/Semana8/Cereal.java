package src.Semana8;

public class Cereal extends Alimento{
    
    public String nome;
    public boolean vegetariano = true;

    Cereal(String nome, double proteinas, double calorias, double peso){
        super(proteinas, calorias, peso);
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cereal " + this.nome + ", Proteinas " + this.proteinas + ", Calorias " + this.calorias + ", Peso " + this.peso;
    }

    @Override
    public boolean getVegetariano() {
        return this.vegetariano;
    }
}

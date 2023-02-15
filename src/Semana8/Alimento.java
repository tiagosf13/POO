package src.Semana8;

public class Alimento {
    
    public double proteinas, calorias, peso;
    public boolean vegetariano = false;

    Alimento(double proteinas, double calorias, double peso){
        this.proteinas = proteinas;
        this.calorias = calorias;
        this.peso = peso;
    }

    public double getCalorias() {
        return this.calorias;
    }

    public boolean getVegetariano() {
        return this.vegetariano;
    }
}

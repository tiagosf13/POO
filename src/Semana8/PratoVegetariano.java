package src.Semana8;

public class PratoVegetariano extends Prato{

    PratoVegetariano(String nome){
        super(nome);
        this.prato_vegetariano = true;
    }

    @Override
    public boolean addIngrediente(Alimento ingrediente) {
        for (int i = 0; i < this.ali.length; i++) {
            if (this.ali[i] == null) {
                if (ingrediente.getVegetariano() == true) {
                    this.ali[i] = ingrediente;
                    this.idIngrediente = idYeIngrediente++;
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Prato 'combinado n." + this.id + "', composto por " + this.idIngrediente + " Ingredientes - Prato Vegetariano";
    }
}

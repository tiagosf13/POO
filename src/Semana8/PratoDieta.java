package src.Semana8;

public class PratoDieta extends Prato{
    
    public double maximo_calorias;

    PratoDieta(String nome, double maximo_calorias){
        super(nome);
        this.maximo_calorias = maximo_calorias;
        this.prato_dieta = true;
    }

    @Override
    public boolean addIngrediente(Alimento ingrediente) {
        for (int i = 0; i < this.ali.length; i++) {
            if (this.ali[i] == null) {
                if (ingrediente.getCalorias() < this.maximo_calorias) {
                    this.ali[i] = ingrediente;
                    this.idIngrediente = idYeIngrediente++;
                    calorias_atuais += ingrediente.getCalorias();
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public double getCaloriasAtuais() {
        return this.calorias_atuais;
    }

    @Override
    public String toString() {
        return "Prato 'combinado n." + this.id + "', composto por " + this.idIngrediente + " Ingredientes - Dieta (" + this.calorias_atuais + ")";
    }
}

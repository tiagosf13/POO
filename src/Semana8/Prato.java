package src.Semana8;

public class Prato {
    
    public String nome;
    public Alimento[] ali = new Alimento[3];
    public static int idYeIngrediente = 1;
    public static int idYe = 1;
    public int idIngrediente;
    public int id;
    public boolean prato_vegetariano = false, prato_dieta = false;
    public double calorias_atuais = 0;

    Prato(String nome){
        this.nome = nome;
        this.id = idYe++;
    }

    public boolean addIngrediente(Alimento ingrediente) {
        for (int i = 0; i < this.ali.length; i++) {
            if (this.ali[i] == null) {
                this.ali[i] = ingrediente;
                this.idIngrediente = idYeIngrediente++;
                return true;
            }
        }
        return false;
    }

    public int getID() {
        return this.id;
    }

    public int getIDIngrediente() {
        return this.idIngrediente;
    }

    public double getCaloriasAtuais() {
        return this.calorias_atuais;
    }

    public String toString() {
        return "Prato 'combinado n." + this.id + "', composto por " + this.idIngrediente + " Ingredientes";
    }
}
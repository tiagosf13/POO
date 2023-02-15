package src.Semana8;

public class Ementa {
    
    public String nome, local;
    public Prato[] pratos = new Prato[DiaSemana.values().length];

    Ementa(String nome, String local) {
        this.nome = nome;
        this.local = local;
    }

    public void addPrato(Prato prato1, DiaSemana dia) {
        for(int i = 0; i < this.pratos.length; i++) {
            if (this.pratos[i] == null) {
                this.pratos[i] = prato1;
                break;
            }
        }
    }

    public String toString() {

        String finalStr = "";

        for (int i = 0; i < pratos.length; i++) {
            if (this.pratos[i].prato_dieta == true) {
                finalStr += "Prato 'combinado n." + (i + 1) + "', composto por " + (this.pratos[i].getIDIngrediente() - (i * 2)) + " Ingredientes - Dieta (" + this.pratos[i].getCaloriasAtuais()+ "), dia " + DiaSemana.values()[i] + "\n";
            } else if (this.pratos[i].prato_vegetariano == true) {
                finalStr += "Prato 'combinado n." + (i + 1) + "', composto por " + (this.pratos[i].getIDIngrediente() - (i * 2)) + " Ingredientes - Prato Vegetariano, dia " + DiaSemana.values()[i] + "\n";
            } else {
                finalStr += "Prato 'combinado n." + (i + 1) + "', composto por " + (this.pratos[i].getIDIngrediente() - (i * 2)) + " Ingredientes, dia " + DiaSemana.values()[i] + "\n";
            }
        }
        return finalStr;
    }
}

enum DiaSemana{
    Segunda, Terça, Quarta, Quinta, Sexta, Sábado, Domingo;
}

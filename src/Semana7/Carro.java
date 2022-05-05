package src.Semana7;

public class Carro{
    
    char classe_de_carro;
    String tipo_motorizacao;
    boolean disponibilidade = true;

    //constructor
    Carro(char classe_de_carro, String tipo_motorizacao){
        this.set(classe_de_carro, tipo_motorizacao, disponibilidade);
    }

    //set properties
    public void set(char classe_de_carro, String tipo_motorizacao, boolean disponibilidade){
        this.classe_de_carro = classe_de_carro;  
        this.tipo_motorizacao = tipo_motorizacao;
        this.disponibilidade = disponibilidade;
    }

    public void levantarCarro(){
        this.disponibilidade = false;
    }

    public void entregarCarro(){
        this.disponibilidade = true;
    }

    //get classe de carro
    public char getClasseDeCarro(){
        return this.classe_de_carro;
    }

    //get tipo de motorizacao
    public String getTipoMotorizacao(){
        return this.tipo_motorizacao;
    }

    //disponibilidade do carro
    public boolean getDisponibilidade(){
        return this.disponibilidade;
    }
}

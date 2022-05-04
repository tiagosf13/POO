package src.Semana7;

public class Carro extends Agencia{
    
    boolean disponibilidade = true;

    //constructor
    Carro(char classe_de_carro, String tipo_motorizacao){
        this.set();
    }

    //set properties
    public void set(){
        if (classe_de_carro=="A" || classe_de_carro=="B" || classe_de_carro=="C" || classe_de_carro == "D" ||classe_de_carro =="E"|| classe_de_carro=="F"){
          this.classe_de_carro = classe_de_carro;  
        }
        else{
            System.out.println("A classe do carro deve ser A, B, C, D, E ou F!"); //por neste troco um loop para verificar se o input é de facto A, B, C, D, E ou F
        }
        if (tipo_motorizacao=="gasolina" || tipo_motorizacao=="diesel" || tipo_motorizacao=="hibrido" || tipo_motorizacao=="eletrico"){
            this.tipo_motorizacao = tipo_motorizacao;
        }
        else{
            System.out.println("O tipo de motorização deve ser gasolina, diesel, hibrido ou eletrico!");
        }
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

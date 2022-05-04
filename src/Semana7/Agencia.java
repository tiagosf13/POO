package src.Semana7;

public class Agencia {

    String nome, endereco;

    //constructor
    Agencia(String nome, String endereco){
        this.set();
    }
    
    //set properties
    public void set(){
        this.nome = nome;
        this.endereco = endereco;
    }

    //get name of Agencia
    public String getNome(){
        return this.nome;
    }

    //get address of Agencia 
    public String getEndereco(){
        return this.endereco;
    }
    
}

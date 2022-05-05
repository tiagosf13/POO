package src.Semana7;

public class Agencia {

    public String nome, endereco;

    //constructor
    Agencia(String nome, String endereco){
        this.set(nome, endereco);
    }
    
    //set properties
    public void set(String nome, String endereco){
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

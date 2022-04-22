package src.Semana6;
import src.Semana5.*;

public class Pessoa{
    private String nome;
    private int cc;
    private Data dataNasc;

    //constructor
    Pessoa(String nome, int cc, Data dataNasc){
        this.set(nome, cc, dataNasc);
    }

    //set Name, CC, Date of Birth
    public void set(String nome, int cc, Data dataNasc){
        this.nome = nome;
        this.cc = cc;
        this.dataNasc = dataNasc;
    }

    //get Name
    public String getName(){
        return (this.nome);
    }

    //get CC
    public int getCC(){
        return (this.cc);
    }

    //get Date of Birth
    public Data getDateOfBirth(){
        return (this.dataNasc);
    }

    @Override
    public String toString(){
        return (this.nome+"; CC: "+this.cc+"; Data de Nascimento: "+dataNasc.seeDate());
    }
}

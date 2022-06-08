package src.Semana9;

import src.Semana7.DataYMD;

public class Pessoa{
    private String nome;
    private int cc;
    private DataYMD dataNasc;

    //constructor
    Pessoa(String nome, int cc, DataYMD data){
        this.set(nome, cc, data);
    }

    //set Name, CC, Date of Birth
    public void set(String nome, int cc, DataYMD dataNasc){
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
    public DataYMD getDateOfBirth(){
        return (this.dataNasc);
    }

    @Override
    public String toString(){
        return (this.nome+"; CC: "+this.cc+"; Data de Nascimento: "+dataNasc.seeDate());
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        final Pessoa other = (Pessoa) obj;
        return this.cc == other.cc && this.nome.equals(other.nome) && this.dataNasc.equals(other.dataNasc);
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dataNasc == null) ? 0 : dataNasc.hashCode());
        result = prime * result + cc;

        result = prime * result + ((dataNasc == null) ? 0 : dataNasc.hashCode());
        return result;
    }
}

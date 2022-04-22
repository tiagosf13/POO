package src.Semana6;

import src.Semana5.Data;

public class Bolseiro extends Aluno{
    private float bolsa;

    //constructor with data_inscr == instant date
    Bolseiro(String nome, int cc, Data dataNasc, float bolsa){
        super(nome, cc, dataNasc);
        this.setBolsa(bolsa);

    }

    //constructor with data_inscr given by the user
    Bolseiro(String nome, int cc, Data dataNasc, Data data_inscr, float bolsa){
        super(nome, cc, dataNasc, data_inscr);
        this.setBolsa(bolsa);
    }

    //sets the amount of bolsa
    public void setBolsa(float bolsa){
        if (bolsa>=0){
            this.bolsa = bolsa;
        }
        else{
            throw new IllegalArgumentException("Bolsa Inválida!");
        }
    }

    //gets the amount of bolsa
    public float getBolsa(){
        return (this.bolsa);
    }

    @Override
    public String toString(){
        return (getName()+"; CC: "+getNMec()+"; Data de Nascimento: "+getDateOfBirth().seeDate()+"; Data de Inscrição: "+getDataInscr().seeDate()+"; Bolsa: "+getBolsa());
    }
}

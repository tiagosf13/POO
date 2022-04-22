package src.Semana6;

import java.util.Date;
import src.Semana5.Data;
import java.text.SimpleDateFormat;

public class Aluno extends Pessoa{
    private static int mecano_incial=100;
    private int mecano;
    private Data data_inscr;

    //constructor with data_inscr == instant date
    Aluno(String nome,int cc,Data dataNasc){
        super(nome, cc, dataNasc);
        this.setMecano();
        setDate();
    }
    
    //constructor with data_inscr given by the user
    Aluno(String nome, int cc, Data dataNasc, Data data_inscr){
        super(nome, cc, dataNasc);
        this.setMecano();
        this.setDataInscr(data_inscr);
    }

    //sets the mecanograph number of the student
    public void setMecano(){
        this.mecano = mecano_incial++;
    }

    //sets the instant date
    public void setDate(){
        Date date = new Date();
        SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
        String stringDate = DateFor.format(date);
        String data_atual[] = stringDate.split("/"); 
        this.data_inscr = new Data(Integer.parseInt(data_atual[0]), Integer.parseInt(data_atual[1]), Integer.parseInt(data_atual[2]));
    }

    //sets the data_inscr date
    public void setDataInscr(Data data_inscr){
        if (data_inscr.validDate()){
            this.data_inscr = data_inscr;
        }
    }

    //gets the mecanograph number of the student
    public int getNMec(){
        return (this.mecano);
    }

    //get the data_inscr date
    public Data getDataInscr(){
        return (this.data_inscr);
    }

    @Override
    public String toString(){
        return (getName()+"; CC: "+getNMec()+"; Data de Nascimento: "+getDateOfBirth().seeDate()+", Data de Inscrição: "+getDataInscr().seeDate());
    }
}
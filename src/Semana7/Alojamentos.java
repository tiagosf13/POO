package src.Semana7;

public class Alojamentos{

    String codigo, nome, local;
    double preco_noite, avaliacao;
    boolean disponibilidade;

    //constructor
    Alojamentos(String codigo, String nome, String local, Double preco_noite, boolean disponibilidade, double avaliacao){
        this.set(codigo, nome, local, preco_noite, disponibilidade, avaliacao);
    }

    //set properties
    public void set(String codigo, String nome, String local, Double preco_noite, boolean disponibilidade, double avaliacao){
        this.codigo = codigo;
        this.nome = nome;
        this.local = local;
        this.preco_noite = preco_noite;
        this.disponibilidade = disponibilidade;
        if (avaliacao>=1 || avaliacao<=5){
            this.avaliacao = avaliacao;    
        }
        else{
            System.out.println("A avaliação deve ser de 1.0 a 5.0!"); //por neste troco um loop para verificar se o input é de facto 1.0<=INPUT<=5.0
        }
    }

    //check-in the Alojamento
    public void checkIn(){
        this.disponibilidade = false;
    }

    //check-out the Alojamento 
    public void checkOut(){
        this.disponibilidade = true;
    }

    //get codigo
    public String getCodigo(){
        return this.codigo;
    }

    //get nome
    public String getNome(){
        return this.nome;
    }

    //get local
    public String getLocal(){
        return this.local;
    }

    //get preco por noite
    public double getPrecoNoite(){
        return this.preco_noite;
    }

    //get disponibilidade
    public boolean getDisponibilidade(){
        return this.disponibilidade;
    }

    //get avaliacao
    public double getAvaliacao(){
        return this.avaliacao;
    }
}

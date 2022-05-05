package src.Semana7;

public class Apartamento extends Alojamentos{
    
    int numero_quartos;

    //constructor
    Apartamento(String codigo, String nome, String local, double preco_noite, boolean disponibilidade, double avaliacao, int numero_quartos){
        super(codigo, nome, local, preco_noite, disponibilidade, avaliacao);
        this.set(numero_quartos);
    }

    //set properties
    public void set(int numero_quartos){
        this.numero_quartos = numero_quartos;
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

    //get numero de quartos
    public int getNumeroQuartos(){
        return this.numero_quartos;
    }

    //toString
    public String toString(){
        String frase = "Codigo: "+ this.codigo+"\n"+"Nome: "+ this.nome+"\n"+"Local: "+ this.local+"\n"+"Preço por Noite: "+ this.preco_noite+"\n"+"Disponibilidade: "+ this.disponibilidade+"\n"+"Avaliação: "+ this.avaliacao+"\n"+"Numero de Quartos: "+ this.numero_quartos+"\n";
        return frase;
    }
}

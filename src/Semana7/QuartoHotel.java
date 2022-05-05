package src.Semana7;

public class QuartoHotel extends Alojamentos{
    
    String tipo_de_quarto;

    //constructor
    QuartoHotel(String codigo, String nome, String local, Double preco_noite, boolean disponibilidade, double avaliacao, String tipo_de_quarto){
        super(codigo, nome, local, preco_noite, disponibilidade, avaliacao);
        this.set(tipo_de_quarto);
    }

    //set properties
    public void set(String tipo_de_quarto){
        this.tipo_de_quarto = tipo_de_quarto;
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

    //get tipo de quarto
    public String getTipoDeQuarto(){
        return this.tipo_de_quarto;
    }

    //toString
    public String toString(){
        String frase = "Codigo: "+ this.codigo+"\n"+"Nome: "+ this.nome+"\n"+"Local: "+ this.local+"\n"+"Preço por Noite: "+ this.preco_noite+"\n"+"Disponibilidade: "+ this.disponibilidade+"\n"+"Avaliação: "+ this.avaliacao+"\n"+"Tipo de Quartos: "+ this.tipo_de_quarto+"\n";
        return frase;
    }
}

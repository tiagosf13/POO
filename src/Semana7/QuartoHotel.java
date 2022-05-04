package src.Semana7;

public class QuartoHotel extends Alojamentos{
    
    String tipo_de_quarto;

    //constructor
    QuartoHotel(String codigo, String nome, String local, Double preco_noite, boolean disponibilidade, double avaliacao, String tipo_de_quarto){
        super(codigo, nome, local, preco_noite, disponibilidade, avaliacao);
        this.set();
    }

    //set properties
    public void set(){
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
        if (tipo_de_quarto=="single" || tipo_de_quarto=="double" || tipo_de_quarto=="twin" || tipo_de_quarto=="triple"){
            this.tipo_de_quarto = tipo_de_quarto;
        }
        else{
            System.out.println("O tipo de quarto deve ser SINGLE ou DOUBLE ou TWIN ou TRIPLE!");//por neste troco um loop para verificar se o input é de facto single, double, twin ou triple
        }
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
}

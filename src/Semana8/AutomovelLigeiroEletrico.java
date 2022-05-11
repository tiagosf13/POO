package src.Semana8;

public class AutomovelLigeiroEletrico extends AutomovelLigeiro implements VeiculoEletrico {
    
    private int percentagem_atual;

    AutomovelLigeiroEletrico(String matricula, String marca, String modelo, int potencia, int numero_quadro, int capacidade_bagageira, int percentagem_atual){
        super(matricula, marca, modelo, potencia, numero_quadro, capacidade_bagageira);
        this.percentagem_atual = percentagem_atual;
    }

    public int autonomia(){
        return this.percentagem_atual;
    }

    public void carregar(int percentagem){
        if(this.percentagem_atual!=100){
            this.percentagem_atual += percentagem;
            if(this.percentagem_atual>100){
                this.percentagem_atual = 100;
            }
        }

    }

    public String toString(){
        return ("Matricula: "+this.matricula+"\n"+"Marca: "+this.marca+"\n"+"Modelo: "+this.modelo+"\n"+"Potência: "+this.potencia+"\n"+"Número do Quadro: "+this.numero_quadro+"\n"+"Capacidade da Bagageira: "+this.capacidade_bagageira+"\n"+"Percentagem: "+this.percentagem_atual);
    }
}

package src.Semana8;

public class PesadoPassageirosEletrico extends PesadoPassageiros implements VeiculoEletrico{
    
    private int percentagem_atual;

    PesadoPassageirosEletrico(String matricula, String marca, String modelo, int potencia, int numero_quadro, float peso, int maximo_passageiros, int percentagem){
        super(matricula, marca, modelo, potencia, numero_quadro, peso, maximo_passageiros);
        this.percentagem_atual = percentagem;
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

    @Override
    public String toString(){
        return ("Matricula: "+this.matricula+"\n"+"Marca: "+this.marca+"\n"+"Modelo: "+this.modelo+"\n"+"Potência: "+this.potencia+"\n"+"Número de Quadro: "+this.numero_quadro+"\n"+"Peso: "+this.peso+"\n"+"Número Máximo de Passageiros: "+this.maximo_passageiros+"\n"+"Percentagem: "+this.percentagem_atual);
    }
}

package src.Semana8;

public class AutomovelLigeiro extends VeiculoMotorizado {
    
    public int numero_quadro;
    public int capacidade_bagageira;

    AutomovelLigeiro(String matricula, String marca, String modelo, int potencia, int numero_quadro, int capacidade_bagageira){
        super(matricula, marca, modelo, potencia);
        this.numero_quadro = numero_quadro;
        this.capacidade_bagageira = capacidade_bagageira;
    }

    public int getNumeroQuadro(){
        return this.numero_quadro;
    }

    public int getCapacidadeBagageira(){
        return this.capacidade_bagageira;
    }

    public String toString(){
        return ("Matricula: "+this.matricula+"\n"+"Marca: "+this.marca+"\n"+"Modelo: "+this.modelo+"\n"+"Potência: "+this.potencia+"\n"+"Número do Quadro: "+this.numero_quadro+"\n"+"Capacidade da Bagageira: "+this.capacidade_bagageira+"\n"+"Quilómetros Percorridos: "+this.distancia_total+"\n"+"Ultimo Trajeto: "+this.ultimo_trajeto+" Km");
    }
}

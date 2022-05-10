package src.Semana8;

public class Taxi extends VeiculoMotorizado{
    
    private int numero_quadro;
    private int capacidade_bagageira;
    private int numero_licenca;

    Taxi(String matricula, String marca, String modelo, int potencia, int numero_quadro, int capacidade_bagageira, int numero_licenca){
        super(matricula, marca, modelo, potencia);
        this.numero_quadro = numero_quadro;
        this.capacidade_bagageira = capacidade_bagageira;
        this.numero_licenca = numero_licenca;
    }

    public int getNumeroQuadro(){
        return this.numero_quadro;
    }

    public int getCapacidadeBagageira(){
        return this.capacidade_bagageira;
    }

    public int getNumeroLicenca(){
        return this.numero_licenca;
    }

    public String toString(){
        return ("Matricula: "+this.matricula+"\n"+"Marca: "+this.marca+"\n"+"Modelo: "+this.modelo+"\n"+"Potência: "+this.potencia+"\n"+"Número do Quadro: "+this.numero_quadro+"\n"+"Capacidade da Bagageira: "+this.capacidade_bagageira+"\n"+"Número da licença: "+this.numero_licenca+"\n"+"Quilómetros Percorridos: "+this.distancia_total+"\n"+"Ultimo Trajeto: "+this.ultimo_trajeto+" Km");
    }
}

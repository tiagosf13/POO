package src.Semana8;

public class AutomovelLigeiro extends VeiculoMotorizado {
    
    private int numero_quadro;
    private int capacidade_bagageira;

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
<<<<<<< HEAD
        return ("Matricula: "+this.matricula+"\n"+"Marca: "+this.marca+"\n"+"Modelo: "+this.modelo+"\n"+"Potência: "+this.potencia+"\n"+"Número do Quadro: "+this.numero_quadro+"\n"+"Capacidade da Bagageira: "+this.capacidade_bagageira+"\n"+"Quilómetros Percorridos: "+this.distancia_total+"\n"+"Ultimo Trajeto: "+this.ultimo_trajeto+" Km");
=======
        return ("Matricula: "+this.matricula+"\n"+"Marca: "+this.marca+"\n"+"Modelo: "+this.modelo+"\n"+"Potência: "+this.potencia+"\n"+"Número do Quadro: "+this.numero_quadro+"\n"+"Capacidade da Bagageira: "+this.capacidade_bagageira);
>>>>>>> 639a926c0432a3a49f01bef672b7a16919d0df28
    }
}

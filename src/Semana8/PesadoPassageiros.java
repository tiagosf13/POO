<<<<<<< HEAD
=======
package src.Semana8;

public class PesadoPassageiros extends VeiculoMotorizado{
    
    public int numero_quadro;
    public float peso;
    public int maximo_passageiros;

    PesadoPassageiros(String matricula, String marca, String modelo, int potencia, int numero_quadro, float peso, int maximo_passageiros){
        super(matricula, marca, modelo, potencia);
        this.numero_quadro = numero_quadro;
        this.peso = peso;
        this.maximo_passageiros = maximo_passageiros;
    }

    public int getNumeroQuadro(){
        return this.numero_quadro;
    }

    public float getPeso(){
        return this.peso;
    }

    public int getMaximoPassageiros(){
        return this.maximo_passageiros;
    }

    public String toString(){
        return ("Matricula: "+this.matricula+"\n"+"Marca: "+this.marca+"\n"+"Modelo: "+this.modelo+"\n"+"Potência: "+this.potencia+"\n"+"Número de Quadro: "+this.numero_quadro+"\n"+"Peso: "+this.peso+"\n"+"Número Máximo de Passageiros: "+this.maximo_passageiros+"\n"+"Quilómetros Percorridos: "+this.distancia_total+"\n"+"Ultimo Trajeto: "+this.ultimo_trajeto+" Km");
    }
}
>>>>>>> c8a8127adb0a6ee70f476fe00c37c4e9d0fcf5ac

package src.Semana8;

class Motociclo extends VeiculoMotorizado {

    private String tipo;

    Motociclo(String matricula, String marca, String modelo, int potencia, String tipo){
        super(matricula, marca, modelo, potencia);
        this.tipo = tipo;
    }
<<<<<<< HEAD
=======

    public String toString(){
        return ("Matricula: "+this.matricula+"\n"+"Marca: "+this.marca+"\n"+"Modelo: "+this.modelo+"\n"+"Potência: "+this.potencia+"\n"+"Tipo: "+this.tipo+"\n"+"Quilómetros Percorridos: "+this.distancia_total+"\n"+"Ultimo Trajeto: "+this.ultimo_trajeto+" Km");
    }
}
>>>>>>> c8a8127adb0a6ee70f476fe00c37c4e9d0fcf5ac

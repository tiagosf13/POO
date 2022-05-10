package src.Semana8;

class Motociclo extends VeiculoMotorizado {

    private String tipo;

    Motociclo(String matricula, String marca, String modelo, int potencia, String tipo){
        super(matricula, marca, modelo, potencia);
        this.tipo = tipo;
    }

    public String toString(){
<<<<<<< HEAD
        return ("Matricula: "+this.matricula+"\n"+"Marca: "+this.marca+"\n"+"Modelo: "+this.modelo+"\n"+"Potência: "+this.potencia+"\n"+"Tipo: "+this.tipo+"\n"+"Quilómetros Percorridos: "+this.distancia_total+"\n"+"Ultimo Trajeto: "+this.ultimo_trajeto+" Km");
=======
        return ("Matricula: "+this.matricula+"\n"+"Marca: "+this.marca+"\n"+"Modelo: "+this.modelo+"\n"+"Potência: "+this.potencia+"\n"+"Tipo: "+this.tipo);
>>>>>>> 639a926c0432a3a49f01bef672b7a16919d0df28
    }
}
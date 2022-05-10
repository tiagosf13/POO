package src.Semana8;

class Motociclo extends VeiculoMotorizado {

    private String tipo;

    Motociclo(String matricula, String marca, String modelo, int potencia, String tipo){
        super(matricula, marca, modelo, potencia);
        this.tipo = tipo;
    }

    public String toString(){
        return ("Matricula: "+this.matricula+"\n"+"Marca: "+this.marca+"\n"+"Modelo: "+this.modelo+"\n"+"Potência: "+this.potencia+"\n"+"Tipo: "+this.tipo);
    }
}
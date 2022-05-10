package src.Semana8;

class VeiculoMotorizado implements KmPercorridosInterface{
    
    public String matricula;
    public String marca;
    public String modelo;
    public int potencia;
    public int distancia_total=0;
    public int ultimo_trajeto;

    VeiculoMotorizado(String matricula, String marca, String modelo, int potencia){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public void trajeto(int quilometros){
        this.distancia_total +=quilometros;
        this.ultimo_trajeto = quilometros;
    }

    public int ultimoTrajeto(){
        return this.ultimo_trajeto;
    }

    public int distanciaTotal(){
        return this.distancia_total;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public int getPotencia(){
        return this.potencia;
    }
}
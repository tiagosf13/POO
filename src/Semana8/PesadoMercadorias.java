package src.Semana8;

public class PesadoMercadorias extends VeiculoMotorizado {
    
    private int numero_quadro;
    private float peso;
    private float carga_maxima;

    PesadoMercadorias(String matricula, String marca, String modelo, int potencia, int numero_quadro, float peso, float carga_maxima){
        super(matricula, marca, modelo, potencia);
        this.numero_quadro = numero_quadro;
        this.peso = peso;
        this.carga_maxima = carga_maxima;
    }

    public int getNumeroQuadro(){
        return this.numero_quadro;
    }

    public float getPeso(){
        return this.peso;
    }

    public float getCargaMaxima(){
        return this.carga_maxima;
    }

    public String toString(){
        return ("Matricula: "+this.matricula+"\n"+"Marca: "+this.marca+"\n"+"Modelo: "+this.modelo+"\n"+"Potência: "+this.potencia+"\n"+"Número do Quadro: "+this.numero_quadro+"\n"+"Peso: "+this.peso+"\n"+"Carga Máxima: "+this.carga_maxima+"\n"+"Quilómetros Percorridos: "+this.distancia_total+"\n"+"Ultimo Trajeto: "+this.ultimo_trajeto+" Km");
    }
}

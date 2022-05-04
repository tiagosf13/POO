package src.Semana7;

public class Circulo extends Forma{
    float raio;
    double area, perimetro, diametro;

    //constructor
    Circulo(float raio, String cor){
        this.set(raio, cor);
    }
    
    //set raio, area, perimetro
    public void set(float raio, String cor){
        if (raio<=0){
            System.out.println("Raios <=10 não são aceites!");
        }
        else{
            this.raio = raio;
            this.diametro = getDiametro();
            this.area = Area();
            this.perimetro = Perimetro();
            this.cor = cor;
        }
    }

    //get cor
    public String getCor(){
        return(this.cor);
    }

    //get raio
    private float getRaio(){
        return(this.raio);
    }

    //get diametro
    private float getDiametro(){
        return((this.raio)*2);
    }

    //get area
    public double Area(){
        return (Math.PI*Math.pow(this.raio, 2));
    }

    //get perimetro
    public double Perimetro(){
        return (2*Math.PI*this.raio);
    }

    //print geometric details
    public String toString(){
        String frase = "Tipo: Circulo Normal"+classificacao()+"\n"+"Raio: "+Float.toString(getRaio())+"\n"+"Diâmetro: "+Float.toString(getDiametro())+"\n"+"Perimetro: "+Double.toString(Perimetro())+"\n"+"Ârea: "+Double.toString(Area())+"\n";
        return(frase);
    }

    //classificação circulo trigonometrico
    private String classificacao(){
        if (this.raio==1){
            return("Trigonomêtrico");
        }
        return("");
    }

    //comparar figuras geometricas
    public Boolean equals(Circulo circulo1, Circulo circulo2){
        System.out.println("Circulo1:");
        System.out.println("Área: "+circulo1.Area());
        System.out.println("Perímetro: "+circulo1.Perimetro());
        System.out.println("Raio: "+circulo1.getRaio());
        System.out.println("Diâmetro: "+circulo1.getDiametro());
        System.out.println("Cor: "+circulo1.getCor()+"\n");
        System.out.println("Circulo2:");
        System.out.println("Área: "+circulo2.Area());
        System.out.println("Perímetro: "+circulo2.Perimetro());
        System.out.println("Raio: "+circulo2.getRaio());
        System.out.println("Diâmetro: "+circulo2.getDiametro());
        System.out.println("Cor: "+circulo2.getCor()+"\n");
        return(circulo1.getRaio()==circulo2.getRaio() && circulo1.getCor().equals(circulo2.getCor()));
    }
}

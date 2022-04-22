package src.Semana5;

public class Circulo{
    float raio;
    double area, perimetro, diametro;

    //constructor
    Circulo(float raio){
        this.set(raio);
    }
    
    //set raio, area, perimetro
    public void set(float raio){
        if (raio<=0){
            System.out.println("Raios <=10 não são aceites!");
        }
        else{
            this.raio = raio;
            this.diametro = getDiametro();
            this.area = getArea();
            this.perimetro = getPerimetro();
        }
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
    private double getArea(){
        return (Math.PI*Math.pow(this.raio, 2));
    }

    //get perimetro
    private double getPerimetro(){
        return (2*Math.PI*this.raio);
    }

    //print geometric details
    public String toString(){
        String frase = "Tipo: Circulo Normal"+classificacao()+"\n"+"Raio: "+Float.toString(getRaio())+"\n"+"Diâmetro: "+Float.toString(getDiametro())+"\n"+"Perimetro: "+Double.toString(getPerimetro())+"\n"+"Ârea: "+Double.toString(getArea())+"\n";
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
        System.out.println("Área: "+circulo1.getArea());
        System.out.println("Perímetro: "+circulo1.getPerimetro());
        System.out.println("Raio: "+circulo1.getRaio());
        System.out.println("Diâmetro: "+circulo1.getDiametro()+"\n");
        System.out.println("Circulo2:");
        System.out.println("Área: "+circulo2.getArea());
        System.out.println("Perímetro: "+circulo2.getPerimetro());
        System.out.println("Raio: "+circulo2.getRaio());
        System.out.println("Diâmetro: "+circulo2.getDiametro()+"\n");
        return(circulo1.getRaio()==circulo2.getRaio());
    }
}
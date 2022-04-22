package src.Semana5;

public class Retangulo{
    float comprimento, altura, area, perimetro;
    
    //constructor
    Retangulo(float comprimento, float altura){
        this.set(comprimento, altura);
    }

    //set lados, area, perimetro
    public void set(float comprimento, float altura){
        if (comprimento<=0 || altura<=0){
            System.out.println("Um ou mais lados não são aceites!(Medidas Erradas)");
        }
        else{
            this.comprimento = comprimento;
            this.altura = altura;
            this.area = getArea();
            this.perimetro = getPerimetro();
        }
    }

    //get area
    public float getArea(){
        return(this.comprimento*this.altura);
    }

    //get perimetro
    public float getPerimetro(){
        return((this.comprimento)*2+(this.altura)*2);
    }

    //get lados
    public String getLados(){
        return("\n----Comprimento: "+this.comprimento+"\n"+"----Altura: "+this.altura);
    }

    //print geometric details
    public String toString(){
        String frase = "Tipo: "+classificacao()+"\n"+"Comprimento: "+Float.toString(this.comprimento)+"\n"+"Altura: "+Float.toString(this.altura)+"\n"+"Perimetro: "+Float.toString(getPerimetro())+"\n"+"Ârea: "+Double.toString(getArea())+"\n";
        return(frase);
    }

    //classificacao quadrado
    public String classificacao(){
        if (this.comprimento==this.altura){
            return("Quadrado");
        }
        return("Retângulo");
    }

    //comparar figuras geometricas
    public Boolean equals(Retangulo retangulo1, Retangulo retangulo2){
        System.out.println("Retângulo1:");
        System.out.println("Área: "+retangulo1.getArea());
        System.out.println("Perímetro: "+retangulo1.getPerimetro());
        System.out.println("Lados: "+retangulo1.getLados()+"\n");
        System.out.println("Retângulo2:");
        System.out.println("Área: "+retangulo2.getArea());
        System.out.println("Perímetro: "+retangulo2.getPerimetro());
        System.out.println("Lados: "+retangulo2.getLados()+"\n");
        return(retangulo1.getPerimetro()==retangulo2.getPerimetro());
    }
}
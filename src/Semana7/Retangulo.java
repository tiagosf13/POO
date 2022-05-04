package src.Semana7;

public class Retangulo extends Forma{
    float comprimento, altura;
    double area, perimetro;

    //constructor
    Retangulo(float comprimento, float altura, String cor){
        this.set(comprimento, altura, cor);
    }

    //set lados, area, perimetro
    public void set(float comprimento, float altura, String cor){
        if (comprimento<=0 || altura<=0){
            System.out.println("Um ou mais lados não são aceites!(Medidas Erradas)");
        }
        else{
            this.comprimento = comprimento;
            this.altura = altura;
            this.area = Area();
            this.perimetro = Perimetro();
            this.cor = cor;
        }
    }

    //get cor
    public String getCor(){
        return this.cor;
    }

    //get area
    public double Area(){
        return(this.comprimento*this.altura);
    }

    //get perimetro
    public double Perimetro(){
        return((this.comprimento)*2+(this.altura)*2);
    }

    //get lados
    public String getLados(){
        return("\n----Comprimento: "+this.comprimento+"\n"+"----Altura: "+this.altura);
    }

    //print geometric details
    public String toString(){
        String frase = "Tipo: "+classificacao()+"\n"+"Comprimento: "+Float.toString(this.comprimento)+"\n"+"Altura: "+Float.toString(this.altura)+"\n"+"Perimetro: "+Double.toString(Perimetro())+"\n"+"Ârea: "+Double.toString(Area())+"\n";
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
        System.out.println("Área: "+retangulo1.Area());
        System.out.println("Perímetro: "+retangulo1.Perimetro());
        System.out.println("Lados: "+retangulo1.getLados());
        System.out.println("Cor: "+retangulo1.getCor()+"\n");
        System.out.println("Retângulo2:");
        System.out.println("Área: "+retangulo2.Area());
        System.out.println("Perímetro: "+retangulo2.Perimetro());
        System.out.println("Lados: "+retangulo2.getLados()+"\n");
        System.out.println("Cor: "+retangulo2.getCor()+"\n");
        return(retangulo1.Perimetro()==retangulo2.Perimetro() && retangulo1.getCor().equals(retangulo2.getCor()));
    }
}
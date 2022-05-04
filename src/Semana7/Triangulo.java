package src.Semana7;

public class Triangulo extends Forma{
    //para este fim lado1=base lado2=altura lado3=hipotenusa, mas como temos de considerar triângulos equiláteros, considerar "lados" é mais fácil
    float lado1, lado2, lado3;
    double area, perimetro;
    //construtor
    Triangulo(float base, float altura, float hipotenusa, String cor){
        this.set(base, altura, hipotenusa, cor);
    }

    //set base, altura, hipotenusa, area, perimetro
    public void set(float lado1, float lado2, float lado3, String cor){
        if (lado1<=0 || lado2 <=0 || lado3<=0){
            System.out.println("Um ou mais lados não são aceites!(Medidas Erradas)");
            System.exit(0);
        }
        else if (lado1+lado2<=lado3 || lado1+lado3<=lado2 || lado2+lado3<=lado1){
            System.out.println("Um ou mais lados não são aceites!(Desigualdade de Triângulos não verificada)");
            System.exit(0);
        }
        else{
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
            this.area = Area();
            this.perimetro = Perimetro();
            this.cor = cor;
        }
    }

    //get cor
    public String getCor(){
        return(this.cor);
    }

    //get area
    public double Area(){
        double p;
        p = (this.lado1+this.lado2+this.lado3)/2;
        return((float) Math.sqrt(p*(p-this.lado1)*(p-this.lado2)*(p-this.lado3)));
    }

    //get perimetro
    public double Perimetro(){
        return(this.lado1+this.lado2+this.lado3);
    }

    //get lados
    private String getLados(){
        return("\n----Lado1: "+this.lado1+"\n"+"----Lado2: "+this.lado2+"\n"+"----Lado3: "+this.lado3);
    }

    //classificação do triangulo(retangulo, equilatero, isosceles)
    private String classificacao(){
        String frase;
        if (Math.toDegrees(Math.acos(this.lado1/this.lado3))==90){
            frase = "Retângulo";
        }
        else if (Math.acos((this.lado1/2)/this.lado2)==90){
            frase = "Equilátero";
        }
        else{
            frase = "Isósceles";
        }
        return(frase);
    }

    //print geometric details
    public String toString(){
        String frase = "Tipo: "+classificacao()+"\n"+"Lados: "+getLados()+"\n"+"Ârea: "+Double.toString(Area())+"\n"+"Perímetro: "+Perimetro()+"\n";
        return(frase);
    }

    //comparar figuras geometricas
    public Boolean equals(Triangulo triangulo1, Triangulo triangulo2){
        System.out.println("Triângulo1:");
        System.out.println("Área: "+triangulo1.Area());
        System.out.println("Perímetro: "+triangulo1.Perimetro());
        System.out.println("Lados: "+triangulo1.getLados());
        System.out.println("Cor: "+triangulo1.getCor()+"\n");
        System.out.println("Triângulo2:");
        System.out.println("Área: "+triangulo2.Area());
        System.out.println("Perímetro: "+triangulo2.Perimetro());
        System.out.println("Lados: "+triangulo2.getLados());
        System.out.println("Cor: "+triangulo2.getCor());
        return(triangulo1.getLados()==triangulo2.getLados() && triangulo1.getCor().equals(triangulo2.getCor()));
    }
}
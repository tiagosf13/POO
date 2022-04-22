package src.Semana5;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        int escolha=0;
        Scanner sc = new Scanner(System.in);

        Circulo circulo1 = new Circulo(3);
        Circulo circulo2 = new Circulo(3);
        Retangulo retangulo1 = new Retangulo(3, 3);
        Retangulo retangulo2 = new Retangulo(3, 3);
        Triangulo triangulo1 = new Triangulo(3, 3, 3);
        Triangulo triangulo2 = new Triangulo(3, 3, 3);

        while(true){
            System.out.println("MENU");
            System.out.println(" 1 - Criar Círculos");
            System.out.println(" 2 - Criar Retângulos");
            System.out.println(" 3 - Criar Triângulos");
            System.out.println(" 4 - Mostrar Figuras Criadas");
            System.out.println(" 5 - Comparar Figuras do Mesmo Tipo");
            System.out.println(" 0 - Sair");
            escolha = sc.nextInt();

            switch(escolha){
                case(1):
                    criarCirculos(sc, circulo1, circulo2);
                    break;
                case(2):
                    criarRetangulos(sc, retangulo1, retangulo2);
                    break;
                case(3):
                    criarTriangulos(sc, triangulo1, triangulo2);
                    break;
                case(4):
                    monstrarFiguras(circulo1, circulo2, retangulo1, retangulo2, triangulo1, triangulo2);
                    break;
                case(5):
                    compararFigurasDoMesmoTipo(circulo1, circulo2, retangulo1, retangulo2, triangulo1, triangulo2);
                    break;
                default:
                    System.exit(0);
            }
        }
    }

    public static void criarCirculos(Scanner sc, Circulo circulo1,Circulo circulo2){
        float raio1=0, raio2=0;

        while(raio1<=0){
            System.out.println("Insira o raio do Círculo1:");
            raio1 = sc.nextFloat();
        }
        circulo1.set(raio1);
        while(raio2<=0){
            System.out.println("Insira o raio do Círculo2:");
            raio2 = sc.nextFloat();
        }
        circulo2.set(raio2);
    }

    private static void criarRetangulos(Scanner sc, Retangulo retangulo1, Retangulo retangulo2){
        float comprimento1=0, altura1=0, comprimento2=0, altura2=0;

        while(comprimento1<=0){
            System.out.println("Insira o comprimento do Retângulo1:");
            comprimento1 = sc.nextFloat();
        }
        while(altura1<=0){
            System.out.println("Insira a altura do Retângulo1:");
            altura1 = sc.nextFloat();
        }
        retangulo1.set(comprimento1, altura1);
        while(comprimento2<=0){
            System.out.println("Insira o comprimento do Retângulo2:");
            comprimento2 = sc.nextFloat();
        }
        while(altura2<=0){
            System.out.println("Insira a altura do Retângulo2:");
            altura2 = sc.nextFloat();
        }
        retangulo2.set(comprimento2, altura2);
    }

    private static void criarTriangulos(Scanner sc, Triangulo triangulo1, Triangulo triangulo2){
        float base1=0, altura1=0, hipotenusa1=0, base2=0, altura2=0, hipotenusa2=0;

        while(base1<=0){
            System.out.println("Insira o 1º lado do Triângulo1:");
            base1 = sc.nextFloat();
        }
        while(altura1<=0){
            System.out.println("Insira o 2º lado do Triângulo1:");
            altura1 = sc.nextFloat();
        }
        while(hipotenusa1<=0){
            System.out.println("Insira o 3º lado do Triângulo1:");
            hipotenusa1 = sc.nextFloat();
        }
        triangulo1.set(base1, altura1, hipotenusa1);
        while(base2<=0){
            System.out.println("Insira o 1º lado do Triângulo2:");
            base2 = sc.nextFloat();
        }
        while(altura2<=0){
            System.out.println("Insira o 2º lado do Triângulo2:");
            altura2 = sc.nextFloat();
        }
        while(hipotenusa2<=0){
            System.out.println("Insira o 3º lado do Triângulo2:");
            hipotenusa2 = sc.nextFloat();
        }
        triangulo2.set(base2, altura2, hipotenusa2);
    }

    private static void monstrarFiguras(Circulo circulo1, Circulo circulo2, Retangulo retangulo1, Retangulo retangulo2, Triangulo triangulo1, Triangulo triangulo2){
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Circulo1:\n"+circulo1.toString());
        System.out.println("Circulo2:\n"+circulo2.toString());
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Retângulo1:\n"+retangulo1.toString());
        System.out.println("Retângulo2:\n"+retangulo2.toString());
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Triângulo1:\n"+triangulo1.toString());
        System.out.println("Triângulo2:\n"+triangulo2.toString());
    }

    private static void compararFigurasDoMesmoTipo(Circulo circulo1, Circulo circulo2, Retangulo retangulo1, Retangulo retangulo2, Triangulo triangulo1, Triangulo triangulo2){
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Igualdade(Círculo1==Círculo2):\n"+"----"+(circulo1.equals(circulo1, circulo2))+"----");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Igualdade(Retângulo1==Retângulo2):\n"+"----"+retangulo1.equals(retangulo1, retangulo2)+"----");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Igualdade(Triângulo1 == Triângulo2):\n"+"----"+triangulo1.equals(triangulo1, triangulo2)+"----");
    }
}

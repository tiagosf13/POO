package src.Semana7;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){

        String codigo, nome, local, tipo_de_quarto, tipo_motorizacao, nome_agencia, endereco;
        Double preco_noite, avaliacao;
        boolean disponibilidade, apartamento_criado=false, hotel_criado=false, carro_criado=false;
        int numero_quartos, input=0;
        char classe_de_carro;

        Scanner sc = new Scanner(System.in);
        
        Apartamento apartamento = new Apartamento("1", "s", "s", 1, true, 2, 2);
        QuartoHotel quarto_hotel = new QuartoHotel("1", "s", "s", 1.0, true, 2, "2");

        System.out.println("Insira o nome da agência: ");
        nome_agencia = sc.nextLine();
        System.out.println("Insira o endereço da agência");
        endereco = sc.nextLine();
        Agencia agencia = new Agencia(nome_agencia, endereco);
        while(input!=7){
            System.out.println("Menu");
            System.out.println("1 - Criar um Apartamento");
            System.out.println("2 - Criar um Quarto de Hotel");
            System.out.println("3 - Criar um Carro");
            System.out.println("4 - Ver Apartamentos");
            System.out.println("5 - Ver Quartos de Hotel");
            System.out.println("6 - Ver Carros");
            System.out.println("7 - Exit");
            System.out.println();
            System.out.println();

            input = sc.nextInt();

            switch(input){
                case(1):
                    System.out.println("Insira o Código do apartamento: ");
                    codigo = sc.next();
                    System.out.println("Insira o Nome do apartamento: ");
                    nome = sc.next();
                    System.out.println("Insira o Local do apartamento: ");
                    local = sc.next();
                    System.out.println("Insira o Preço por Noite do apartamento: ");
                    preco_noite = sc.nextDouble();
                    System.out.println("Insira a Disponibilidade do apartamento: ");
                    disponibilidade = sc.nextBoolean();
                    System.out.println("Insira a Avaliação do apartamento[1.0 a 5.0]: ");
                    avaliacao = sc.nextDouble();
                    System.out.println("Insira o Número de Quartos do apartamento: ");
                    numero_quartos = sc.nextInt();
                    Alojamentos alojamento1 = new Alojamentos(codigo, nome, local, preco_noite, disponibilidade, avaliacao);
                    Apartamento apartamento = new Apartamento(codigo, nome, local, preco_noite, disponibilidade, avaliacao, numero_quartos);
                    apartamento_criado=true;
                    break;
                case(2):
                    System.out.println("Insira o Código do hotel: ");
                    codigo = sc.next();
                    System.out.println("Insira o Nome do hotel: ");
                    nome = sc.next();
                    System.out.println("Insira o Local do hotel: ");
                    local = sc.next();
                    System.out.println("Insira o Preço por Noite do hotel: ");
                    preco_noite = sc.nextDouble();
                    System.out.println("Insira a Disponibilidade do hotel[true, false]: ");
                    disponibilidade = sc.nextBoolean();
                    System.out.println("Insira a Avaliação do hotel[1.0 a 5.0]: ");
                    avaliacao = sc.nextDouble();
                    System.out.println("Insira o Tipo de Quartos do hotel[single, double, twin, triple]: ");
                    tipo_de_quarto = sc.next();
                    Alojamentos alojamento2 = new Alojamentos(codigo, nome, local, preco_noite, disponibilidade, avaliacao);
                    QuartoHotel quarto_hotel = new QuartoHotel(codigo, nome, local, preco_noite, disponibilidade, avaliacao, tipo_de_quarto);
                    hotel_criado=true;
                    break;
                case(3):
                    System.out.println("Insira a Classe do carro[A, B, C, D, E, F]: ");
                    classe_de_carro = sc.next().toCharArray()[0];
                    System.out.println("Insira o Tipo de Motorização do carro: ");
                    tipo_motorizacao = sc.next();
                    Carro carro = new Carro(classe_de_carro, tipo_motorizacao);
                    carro_criado=true;
                    break;
                case(4):
                    if (apartamento_criado==true){
                        apartamento.toString();
                    }
                    else{
                        System.out.println("Não existe nenhum apartamento");
                        System.exit(0);
                    }
                case(5):
                    if (hotel_criado==true){
                        quarto_hotel.toString();
                    }
                    else{
                        System.out.println("Não existe nenhum hotel");
                        System.exit(0);
                    }
                case(6):
                    if (carro_criado==true){
                        carro.toString();
                    }
                    else{
                        System.out.println("Não existe nenhum carro");
                        System.exit(0);
                    }
            }
        }
    }
}
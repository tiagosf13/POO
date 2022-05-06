package src.Semana7;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){


        //este exercicio esta mal no sentido em que as variaveis locais podem nao ter sido iniciadas,
        //caso em que o utilizador nao chega a criar os objetos antes de os visualizar

        String codigo, nome, local, tipo_de_quarto, tipo_motorizacao, nome_agencia, endereco;
        Double preco_noite, avaliacao;
        boolean disponibilidade, apartamento_criado=false, hotel_criado=false, carro_criado=false;
        int numero_quartos, input=0;
        char classe_de_carro;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o nome da agência: ");
        nome_agencia = sc.nextLine();
        System.out.println("Insira o endereço da agência");
        endereco = sc.nextLine();
        Agencia agencia = new Agencia(nome_agencia, endereco);
        while(input!=0){
            System.out.println("Menu");
            System.out.println("1 - Criar um Apartamento");
            System.out.println("2 - Criar um Quarto de Hotel");
            System.out.println("3 - Criar um Carro");
            System.out.println("4 - Check-In Apartamento");
            System.out.println("5 - Check-In Hotel");
            System.out.println("6 - Check-Out Apartamento");
            System.out.println("7 - Check-Out Apartamento");
            System.out.println("8 - Levantar Carro");
            System.out.println("9 - Entregar Carro");
            System.out.println("10 - Ver Apartamentos");
            System.out.println("11 - Ver Quartos de Hotel");
            System.out.println("12 - Ver Carros");
            System.out.println("0 - Exit");
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
                    Apartamento apartamento = new Apartamento(codigo, nome, local, preco_noite, disponibilidade, avaliacao, numero_quartos);
                    Alojamentos alojamento1 = new Alojamentos(codigo, nome, local, preco_noite, disponibilidade, avaliacao);
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
                    QuartoHotel quarto_hotel = new QuartoHotel(codigo, nome, local, preco_noite, disponibilidade, avaliacao, tipo_de_quarto);
                    Alojamentos alojamento2 = new Alojamentos(codigo, nome, local, preco_noite, disponibilidade, avaliacao);
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
                    alojamento1.disponibilidade = false;
                    break;
                case(5):
                    alojamento2.disponibilidade = false;
                    break;
                case(6):
                    alojamento1.disponibilidade = true;
                    break;
                case(7):
                    alojamento2.disponibilidade = true;
                    break;
                case(8):
                    carro.disponibilidade = false;;
                    break;
                case(9):
                    carro.disponibilidade = true;
                    break;
                case(10):
                    if (apartamento_criado==true){
                        apartamento.toString();
                    }
                    else{
                        System.out.println("Não existe nenhum apartamento");
                        System.exit(0);
                    }
                case(11):
                    if (hotel_criado==true){
                        quarto_hotel.toString();
                    }
                    else{
                        System.out.println("Não existe nenhum hotel");
                        System.exit(0);
                    }
                case(12):
                    if (carro_criado==true){
                        carro.toString();
                    }
                    else{
                        System.out.println("Não existe nenhum carro");
                        System.exit(0);
                    }
            }
        }
        sc.close();
    }
}
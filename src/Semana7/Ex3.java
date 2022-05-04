package src.Semana7;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){

        String input, codigo, nome, local, tipo_de_quarto, tipo_motorizacao;
        Double preco_noite, avaliacao;
        boolean disponibilidade;
        int numero_quartos;
        char classe_de_carro

        Scanner sc = new Scanner(System.in);

        Agencia agencia = new Agencia();

        System.out.println("Menu");
        System.out.println("1 - Criar um Apartamento");
        System.out.println("2 - Criar um Quarto de Hotel");
        System.out.println("3 - Criar um Carro");

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
            case(2):
                System.out.println("Insira o Código do hotel: ");
                codigo = sc.next();
                System.out.println("Insira o Nome do hotel: ");
                nome = sc.next();
                System.out.println("Insira o Local do hotel: ");
                local = sc.next();
                System.out.println("Insira o Preço por Noite do hotel: ");
                preco_noite = sc.nextDouble();
                System.out.println("Insira a Disponibilidade do hotel: ");
                disponibilidade = sc.nextBoolean();
                System.out.println("Insira a Avaliação do hotel[1.0 a 5.0]: ");
                avaliacao = sc.nextDouble();
                System.out.println("Insira o Tipo de Quartos do hotel: ");
                tipo_de_quarto = sc.nextInt();
                Alojamentos alojamento2 = new Alojamentos(codigo, nome, local, preco_noite, disponibilidade, avaliacao);
                QuartoHotel quarto_hotel = new QuartoHotel(codigo, nome, local, preco_noite, disponibilidade, avaliacao, tipo_de_quarto);
            case(3):
                System.out.println("Insira a Classe do carro[A, B, C, D, E, F]: ");
                classe_de_carro = sc.next();
                System.out.println("Insira o Tipo de Motorização do carro: ");
                tipo_motorizacao = sc.next();
                Carro carro = new Carro(classe_de_carro, tipo_motorizacao);
        }
    }
}
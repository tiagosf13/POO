package src.Semana5;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        String data_inserida;
        int first_day_year=0, year=0;
        Calendar calendario;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Date operations:");
            System.out.println("1 - create new calendar");
            System.out.println("2 - print calendar month");
            System.out.println("3 - print calendar");
            System.out.println("0 - exit");
            int escolha = sc.nextInt();
            switch(escolha){
                case(1):
                    System.out.println("Formato First_day_year/AAAA (First_day_year[1 - Domingo ~ 7 - Sábado])");
                    data_inserida = sc.next();
                    String[] arrayInput = data_inserida.split("/");
                    first_day_year = Integer.parseInt(arrayInput[0]);
                    year = Integer.parseInt(arrayInput[1]);
                    calendario = new Calendar(first_day_year, year);
                    System.out.println("");
                    System.out.println("");
                    break;

                case(2):
                    if (first_day_year==0){
                        System.out.println("ERRO!");
                        System.exit(0);
                    }
                    else{
                        Calendar.printMonth(Calendar.monthGet(), first_day_year,year);
                    }
                    break;
                case(3):
                    Calendar.printCalendar(first_day_year, year);
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
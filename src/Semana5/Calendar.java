package src.Semana5;

import java.util.Scanner;

public class Calendar{
    int first_day, year, week_day=0;

    //constructor
    Calendar(int first_day, int year){
        if (first_day<1 || first_day>7){
            System.out.println("Dia errado!");
            System.exit(0);
        }
        else{
            this.week_day = first_day;
            this.year = year;
        }
    }
    
    //month getter
    public static int monthGet(){
        int mes=0;
        Scanner sc = new Scanner(System.in);
        while (mes<1||mes>12){
            System.out.println("Insira o mês [1-12]");
            mes = sc.nextInt();
        }
        return(mes);
    }

    //year getter
    public int year(){
        return(this.year);
    }

    //first day of the year getter
    public int firstWeekDayOfYear(){
        return(this.week_day);
    }

    //first day of the user month
    public static int firstWeekDayOfMonth(int month, int first_day_year, int year){
        int mes = month, total_days=first_day_year;
        for (int i=1; i<mes; i++){
            total_days+=Data.monthDays(i, year);
        }
        if (total_days%7==0){
            return(7);
        }
        else{
            return (total_days%7);
        }
    }

    //print of the user month
    public static void printMonth(int month, int first_day_year, int year) {
        int numDias = 0, border = 0, diaIni = firstWeekDayOfMonth(month, first_day_year, year);

        String empty = " ", anoStr, megaEmpty = ("   ".repeat(diaIni- 1));
        String[] meses = {"January", "February", "March", "April", "May", "June","July", "August", "September", "October", "November", "December"};

        numDias = Data.monthDays(month, year);

        anoStr = Integer.toString(year);
        border = ( (20 - anoStr.length()) - meses[month - 1].length()) / 2;

        System.out.println("=".repeat(20));
        System.out.println(empty.repeat(border) + meses[month - 1] + " " + year + empty.repeat(border));
        System.out.println("Su Mo Tu We Th Fr Sa");

        for (int i = 1; i <= numDias; i++) {
            if (diaIni == 1) {
                megaEmpty += String.format("%2d ", i);
                diaIni++;
            } else if (diaIni == 7) {
                megaEmpty += String.format("%2d\n", i);
                diaIni = 1;
            } else {
                megaEmpty += String.format("%2d ", i);
                diaIni++;
            }
        }
        System.out.println(megaEmpty);
        System.out.println("=".repeat(20));
    }

    //print full calendar
    public static void printCalendar(int first_day_year, int year){
        for(int i=1;i<13;i++){
            printMonth(i, first_day_year, year);
        }
    }
}
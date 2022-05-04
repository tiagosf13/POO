package src.Semana7;

import java.util.Scanner;

public class Ex2b {
    public static void main(String[] args){
        String insert;
        int day, month, year;

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a data até onde pretende contar no formato DD/MM/YYYY: ");
        insert=sc.next();
        sc.close();
        String[] arrayInput = insert.split("/");
        day = Integer.parseInt(arrayInput[0]);
        month = Integer.parseInt(arrayInput[1]);
        year = Integer.parseInt(arrayInput[2]);
        DataND data = new DataND(day,month,year);
        System.out.println("1/1/2000 ---> "+day+"/"+month+"/"+year);
    }
}
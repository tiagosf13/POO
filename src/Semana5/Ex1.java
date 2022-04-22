package src.Semana5;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args){
        String data_inserida;
        int day=999, month=0, year=0, escolha,counter=0;
        Scanner sc = new Scanner(System.in);
        Data data = new Data(26,12,2002);
        while(true){
            System.out.println("Date operations:");
            System.out.println("1 - create new date");
            System.out.println("2 - show current date");
            System.out.println("3 - increment date");
            System.out.println("4 - decrement date");
            System.out.println("0 - exit");
            escolha = sc.nextInt();
            switch(escolha){
                case(1):
                    System.out.println("Formato DD/MM/AAAA");
                    data_inserida = sc.next();
                    String[] arrayInput = data_inserida.split("/");
                    day = Integer.parseInt(arrayInput[0]);
                    month = Integer.parseInt(arrayInput[1]);
                    year = Integer.parseInt(arrayInput[2]);
                    data = new Data(day,month,year);
                    System.out.println("");
                    System.out.println("");
                    break;
                case(2):
                    if (day==999){
                        System.out.println("");
                        System.out.println("Não existe nenhuma data");
                        System.out.println("");
                        System.out.println("");
                        break;
                    }
                    else{
                        System.out.println("");
                        System.out.println(data.seeDate());
                        System.out.println("");
                        System.out.println("");
                        break;
                    }
                case(3):
                    if (day==999){
                        System.out.println("");
                        System.out.println("Não existe nenhuma data");
                        System.out.println("");
                        System.out.println("");
                        break;
                    }
                    else{
                        System.out.println("");
                        data.incrementDate(day, month, year);
                        System.out.println("");
                        System.out.println("");
                        break;
                    }
                case(4):
                    if (day==999){
                        System.out.println("");
                        System.out.println("Não existe nenhuma data");
                        System.out.println("");
                        System.out.println("");
                        break;
                    }
                    else{
                        System.out.println("");
                        data.decrementDate(day, month, year);
                        System.out.println("");
                        System.out.println("");
                        break;
                    }
                case(0):
                    counter=1;
                    break;
                default:
                System.out.println("Opção não existe!");
            }
            if (counter!=0){
                break;
            }
        }
        sc.close();
        System.exit(0);
    }
}
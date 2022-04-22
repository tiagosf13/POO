package src.Semana4;
import java.util.Scanner;
public class Ex4 {
    public static void main(String[]args){
        String dia="", dia_da_semana, numero_mes, mes="", ano;
        String data[] = leituraData();
        dia_da_semana=data[0];
        numero_mes=data[1];
        if ((Integer.parseInt(numero_mes)<1)||(Integer.parseInt(numero_mes)>12)){
            System.out.println("Erro! Tente de novo!");
            System.exit(0);
        }
        switch(numero_mes){
            case("01"):
                mes="Janeiro";
                break;
            case("1"):
                mes="Janeiro";
                break;
            case("02"):
                mes="Fevereiro";
                break;
            case("2"):
                mes="Fevereiro";
                break;
            case("03"):
                mes="Março";
                break;
            case("3"):
                mes="Março";
                break;
            case("04"):
                mes="Abril";
                break;
            case("4"):
                mes="Abril";
                break;
            case("05"):
                mes="Maio";
                break;
            case("5"):
                mes="Maio";
                break;
            case("06"):
                mes="Junho";
                break;
            case("6"):
                mes="Junho";
                break;
            case("07"):
                mes="Julho";
                break;
            case("7"):
                mes="Julho";
                break;
            case("08"):
                mes="Agosto";
                break;
            case("8"):
                mes="Agosto";
                break;
            case("09"):
                mes="Setembro";
                break;
            case("9"):
                mes="Setembro";
                break;
            case("10"):
                mes="Outubro";
                break;
            case("11"):
                mes="Novembro";
                break;
            case("12"):
                mes="Dezembro";
                break;
        }
        ano = data[2];
        switch(dia_da_semana){
            case("1"):
                dia="Segunda";
                break;
            case("2"):
                dia="Terça";
                break;
            case("3"):
                dia="Quarta";
                break;
            case("4"):
                dia="Quinta";
                break;
            case("5"):
                dia="Sexta";
                break;
            case("6"):
                dia="Sábado";
                break;
            case("7"):
                dia="Domingo";
                break;
            default:
                System.out.println("Dia da semana nao existe!");
                System.exit(0);
        }
        imprimeCalendário(dia, mes, ano, data);
    }

    public static void imprimeCalendário(String dia,String mes,String ano, String[] data){
        System.out.printf("%15s %.15s %s", mes,ano,"\n");
        System.out.printf("%2s %2s %2s %2s %2s %2s %2s %s", "Seg","Ter","Qua","Qui","Sex","Sáb","Dom","\n");
        if (mes.equals("Fevereiro")){
            if (monthDays(data)==28){
                if (dia.equals("Segunda")){
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "1","2","3","4","5","6","7","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "8","9","10","11","12","13","14","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "15","16","17","18","19","20","21","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "22","23","24","25","26","27","28","\n");
                }
                if (dia.equals("Terça")){
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", " ","1","2","3","4","5","6","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "7","8","9","10","11","12","13","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "14","15","16","17","18","19","20","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "21","22","23","24","25","26","27","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "28"," "," "," "," "," "," ","\n");
                }
                if (dia.equals("Quarta")){
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", " "," ","1","2","3","4","5","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "6","7","8","9","10","11","12","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "13","14","15","16","17","18","19","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "20","21","22","23","24","25","26","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "27","28"," "," "," "," "," ","\n");
                }
                if (dia.equals("Quinta")){
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", " "," "," ","1","2","3","4","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "5","6","7","8","9","10","11","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "12","13","14","15","16","17","18","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "19","20","21","22","23","24","25","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "26","27","28"," "," "," "," ","\n");
                }
                if (dia.equals("Sexta")){
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", " "," "," "," ","1","2","3","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "4","5","6","7","8","9","10","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "11","12","13","14","15","16","17","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "18","19","20","21","22","23","24","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "25","26","27","28"," "," "," ","\n");
                }
                if (dia.equals("Sábado")){
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", " "," "," "," "," ","1","2","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "3","4","5","6","7","8","9","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "10","11","12","13","14","15","16","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "17","18","19","20","21","22","23","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "24","25","26","27","28"," "," ","\n");
                }
                if (dia.equals("Domingo")){
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", " "," "," "," "," "," ","1","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "2","3","4","5","6","7","8","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "9","10","11","12","13","14","15","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "16","17","18","19","20","21","22","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "23","24","25","26","27","28"," ","\n");
                }
            }
            if (monthDays(data)==29){
                if (dia.equals("Segunda")){
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "1","2","3","4","5","6","7","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "8","9","10","11","12","13","14","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "15","16","17","18","19","20","21","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "22","23","24","25","26","27","28","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "29"," "," "," "," "," "," ","\n");
                }
                if (dia.equals("Terça")){
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", " ","1","2","3","4","5","6","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "7","8","9","10","11","12","13","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "14","15","16","17","18","19","20","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "21","22","23","24","25","26","27","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "28","29"," "," "," "," "," ","\n");
                }
                if (dia.equals("Quarta")){
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", " "," ","1","2","3","4","5","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "6","7","8","9","10","11","12","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "13","14","15","16","17","18","19","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "20","21","22","23","24","25","26","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "27","28","29"," "," "," "," ","\n");
                }
                if (dia.equals("Quinta")){
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", " "," "," ","1","2","3","4","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "5","6","7","8","9","10","11","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "12","13","14","15","16","17","18","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "19","20","21","22","23","24","25","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "26","27","28","29"," "," "," ","\n");
                }
                if (dia.equals("Sexta")){
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", " "," "," "," ","1","2","3","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "4","5","6","7","8","9","10","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "11","12","13","14","15","16","17","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "18","19","20","21","22","23","24","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "25","26","27","28","29"," "," ","\n");
                }
                if (dia.equals("Sábado")){
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", " "," "," "," "," ","1","2","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "3","4","5","6","7","8","9","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "10","11","12","13","14","15","16","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "17","18","19","20","21","22","23","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "24","25","26","27","28","29"," ","\n");
                }
                if (dia.equals("Domingo")){
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", " "," "," "," "," "," ","1","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "2","3","4","5","6","7","8","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "9","10","11","12","13","14","15","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "16","17","18","19","20","21","22","\n");
                    System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "23","24","25","26","27","28","29","\n");
                }
            }
        }
        if (mes.equals("Janeiro")||mes.equals("Março")||mes.equals("Maio")||mes.equals("Julho")||mes.equals("Agosto")||mes.equals("Outubro")||mes.equals("Dezembro")){
            if (dia.equals("Segunda")){
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "1","2","3","4","5","6","7","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "8","9","10","11","12","13","14","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "15","16","17","18","19","20","21","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "22","23","24","25","26","27","28","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "29","30","31"," "," "," "," ","\n");
            }
            if (dia.equals("Terça")){
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", " ","1","2","3","4","5","6","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "7","8","9","10","11","12","13","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "14","15","16","17","18","19","20","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "21","22","23","24","25","26","27","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "28","29","30","31"," "," "," ","\n");
            }
            if (dia.equals("Quarta")){
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", " "," ","1","2","3","4","5","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "6","7","8","9","10","11","12","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "13","14","15","16","17","18","19","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "20","21","22","23","24","25","26","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "27","28","29","30","31"," "," ","\n");
            }
            if (dia.equals("Quinta")){
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", " "," "," ","1","2","3","4","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "5","6","7","8","9","10","11","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "12","13","14","15","16","17","18","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "19","20","21","22","23","24","25","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "26","27","28","29","30","31"," ","\n");
            }
            if (dia.equals("Sexta")){
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", " "," "," "," ","1","2","3","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "4","5","6","7","8","9","10","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "11","12","13","14","15","16","17","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "18","19","20","21","22","23","24","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "25","26","27","28","29","30","31","\n");
            }
            if (dia.equals("Sábado")){
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", " "," "," "," "," ","1","2","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "3","4","5","6","7","8","9","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "10","11","12","13","14","15","16","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "17","18","19","20","21","22","23","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "24","25","26","27","28","29","30","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "31"," "," "," "," "," "," ","\n");
            }
            if (dia.equals("Domingo")){
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", " "," "," "," "," "," ","1","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "2","3","4","5","6","7","8","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "9","10","11","12","13","14","15","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "16","17","18","19","20","21","22","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "23","24","25","26","27","28","29","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "30","31"," "," "," "," "," ","\n");
            }
        }
        else {
            if (mes.equals("Fevereiro")){
                System.exit(0);
            }
            if (dia.equals("Segunda")){
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "1","2","3","4","5","6","7","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "8","9","10","11","12","13","14","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "15","16","17","18","19","20","21","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "22","23","24","25","26","27","28","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "29","30"," "," "," "," "," ","\n");
            }
            if (dia.equals("Terça")){
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", " ","1","2","3","4","5","6","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "7","8","9","10","11","12","13","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "14","15","16","17","18","19","20","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "21","22","23","24","25","26","27","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "28","29","30"," "," "," "," ","\n");
            }
            if (dia.equals("Quarta")){
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", " "," ","1","2","3","4","5","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "6","7","8","9","10","11","12","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "13","14","15","16","17","18","19","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "20","21","22","23","24","25","26","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "27","28","29","30"," "," "," ","\n");
            }
            if (dia.equals("Quinta")){
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", " "," "," ","1","2","3","4","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "5","6","7","8","9","10","11","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "12","13","14","15","16","17","18","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "19","20","21","22","23","24","25","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "26","27","28","29","30"," "," ","\n");
            }
            if (dia.equals("Sexta")){
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", " "," "," "," ","1","2","3","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "4","5","6","7","8","9","10","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "11","12","13","14","15","16","17","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "18","19","20","21","22","23","24","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "25","26","27","28","29","30"," ","\n");
            }
            if (dia.equals("Sábado")){
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", " "," "," "," "," ","1","2","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "3","4","5","6","7","8","9","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "10","11","12","13","14","15","16","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "17","18","19","20","21","22","23","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "24","25","26","27","28","29","30","\n");
            }
            if (dia.equals("Domingo")){
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", " "," "," "," "," "," ","1","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "2","3","4","5","6","7","8","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "9","10","11","12","13","14","15","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "16","17","18","19","20","21","22","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "23","24","25","26","27","28","29","\n");
                System.out.printf("%3s %3s %3s %3s %3s %3s %3s %s", "30"," "," "," "," "," "," ","\n");
            }  
        }
    }

    public static String[] leituraData(){
        String data;
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU DIA DA SEMANA EM QUE O MÊS COMEÇA:");
        System.out.println("1-Segunda");
        System.out.println("2-Terça");
        System.out.println("3-Quarta");
        System.out.println("4-Quinta");
        System.out.println("5-Sexta");
        System.out.println("6-Sábado");
        System.out.println("7-Domingo");
        System.out.println("Insira a data no formato (nº dia da semana inicio do mês)/MM/AAAA");
        data = sc.next();
        String array_data[] = data.split("/");
        sc.close();
        return(array_data);
    }

    public static Integer monthDays(String[] input_split){
        int mes,ano;
        mes =Integer.parseInt(input_split[1]);
        ano = Integer.parseInt(input_split[2]);
        if (ano%4==0 & mes==2) {
            if (ano%100==0 & ano%400==0) {
                return(29);
            }
            else {
                if (ano%100==0) {
                    return(28);
                }
                else {
                    return(29);
                }
            }
        }
        else {
            if (mes==2) {
                return(28);
            }
            else {
                if (mes%2==0) {
                    return(30);
                }
                else {
                    return(31);
                }
            }
        }
        
    }
}
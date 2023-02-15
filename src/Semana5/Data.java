package src.Semana5;

public class Data{
    int day;
    int month;
    int year; 

    //constructor
    public Data(int day, int month, int year){
        this.set(day, month, year);
    }
    
    //set date
    public void set(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
        if (validDate()==false){
            System.out.println("ssss");
            System.out.println("Data errada!");
            System.exit(0);
        }
    }

    //increment date
    public void incrementDate(int day, int month, int year){
        System.out.println(monthDays(month, year));
        System.out.println(this.day+"/"+this.month+"/"+this.year);
        if(monthDays(this.month, this.year)==this.day){
            if(this.month==12){
                this.day=1;
                this.month=1;
                this.year++; 
            }
            else{
                this.day=1;
                this.month++;
            }
        }
        else{
            this.day++;
        }
    }

    //decrement date
    public void decrementDate(int day, int month, int year){
        if (this.day==1 & this.month==1){
            this.day=31;
            this.month=12;
            this.year--;
        }
        else if (this.day==1){
            this.day=monthDays(month-1, year);
            this.month--;
        }
        else{
            this.day--;
        }
    }

    //devolver a data no formato AAAA-MM-DD
    public String toString(int day, int month, int year){
        String frase = year+"/"+month+"/"+day;
        return(frase);
    }

    //display the date to the user
    public String seeDate(){
        String frase;
        frase = (this.day+"/"+this.month+"/"+this.year);
        return (frase);
    }

    //validate month
    public boolean validMonth(int month){
        if (month<1 || month>12){
            return (false);
        }
        else{
            return (true);
        }
    }

    //get monthdays
    public static Integer monthDays(int month, int year){
        if ((leapYear(year)==true) & month==2){
            return(29);
        }
        else{
            if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
                return(31);
            }
            else{
                if (month==2){
                    return(28);
                }
                else{
                    return(30);
                }
            }
        }
    }

    //verify if the year is a leapYear
    public static boolean leapYear(int year){
        int ano=year;
        boolean isBis;
        if (ano % 400 == 0){
            isBis = true;
        } 
        else if (ano % 100 == 0){
            isBis = false;
        }

        if (ano % 4 == 0) {
            isBis = true;
        } 
        else{
            isBis = false;
        }
        return (isBis);
    }

    //validate the date
    public boolean validDate(){
        if (this.day<=0 || this.day>31){
            return (false);
        }
        else if(this.month==2 & this.day>monthDays(this.month, this.year)){
            return (false);
        }
        else if (validMonth(this.month)==false){
            return (false);
        }
        else{
            return (true);
        }
    }
}
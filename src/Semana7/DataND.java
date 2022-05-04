package src.Semana7;

public class DataND extends Data{

    //constructor
    public DataND(int day, int month, int year){
        this.set(day, month, year);
        decideOperation();
    }
    
    //set date
    public void set(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
        if (validDate()==false){
            System.out.println("Data errada!");
            System.exit(0);
        }
    }

    //validate the date
    public boolean validDate(){
        if (this.day<=0 || this.day>31){
            return (false);
        }
        else if(this.month==2 & this.day>monthDays(this.month, this.year)){
            return (false);
        }
        else if (DataYMD.validMonth(this.month)==false){
            return (false);
        }
        else{
            return (true);
        }
    }

    //see if the user date is before of after 1/1/2000
    public void decideOperation(){
        if (this.year<2000){
            incrementDate(this.day, this.month, this.year);
        }
        else if (this.year>2000){
            decrementDate(this.day, this.month, this.year);
        }
        else{
            if (this.month>1){
                decrementDate(this.day, this.month, this.year);
            }
            else{
                if (this.day>1){
                    decrementDate(this.day, this.month, this.year);
                }
            }
        }
    }


    //increment date
    public void incrementDate(int day, int month, int year){
        int counter=0;
        System.out.println(monthDays(month, year));
        System.out.println(this.day+"/"+this.month+"/"+this.year);
        while (this.day!=1 || this.month!=1 || this.year!=2000){
            if(monthDays(this.month, this.year)==this.day){
                if(this.month==12){
                    this.day=1;
                    this.month=1;
                    this.year++;
                    counter++; 
                }
                else{
                    this.day=1;
                    this.month++;
                    counter++;
                }
            }
            else{
                this.day++;
                counter++;
            }
        }
        System.out.println("Distância em dias: "+counter);
    }

    //decrement date
    public void decrementDate(int day, int month, int year){
        int counter=0;
        while (this.day!=1 || this.month!=1 || this.year!=2000){
            if (this.day==1 && this.month==1){
                this.day=31;
                this.month=12;
                this.year--;
                counter++;
            }
            else if (this.day==1){
                this.day=monthDays(month-1, year);
                this.month--;
                counter++;
            }
            else{
                this.day--;
                counter++;            }
        }
        System.out.println("Distância em dias: "+counter);
    }
}
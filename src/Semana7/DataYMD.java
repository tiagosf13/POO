package src.Semana7;

public class DataYMD extends Data implements Comparable<DataYMD>{

    //constructor
    public DataYMD(int day, int month, int year){
        this.set(day, month, year);
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

    public int getYear() {
		return this.year;
	}

    public int getMonth() {
		return this.month;
	}

    public int getDay() {
		return this.day;
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
    public static boolean validMonth(int month){
        if (month<1 || month>12){
            return (false);
        }
        else{
            return (true);
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
        else if (validMonth(this.month)==false){
            return (false);
        }
        else{
            return (true);
        }
    }

    public int compareTo(DataYMD date2) {
		if (this.getYear() < date2.getYear()) return -1;
		else if (this.getYear() > date2.getYear()) return 1;

		if (this.getMonth() < date2.getMonth()) return -1;
		else if (this.getMonth() > date2.getMonth()) return 1;

		if (this.getDay() < date2.getDay()) return -1;
		else if (this.getDay() > date2.getDay()) return 1;

		return 0;
	}
}
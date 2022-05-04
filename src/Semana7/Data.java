package src.Semana7;

public abstract class Data {
    
    public int day, month, year;

    public abstract void incrementDate(int day, int month, int year);
    public abstract void decrementDate(int day, int month, int year);
    
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
}

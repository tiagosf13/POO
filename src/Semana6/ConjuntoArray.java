package src.Semana6;

public class ConjuntoArray {
    private int[] conjunto = new int[0];
    
    public void insertArray(int n){
        if(!this.containsArray(n)){
            
        }
    }

    public boolean containsArray(int n){
        for(int i=0; i<this.conjunto.length;i++){
            if (this.conjunto[i]==n){
                return (true);
            }
        }
        return (false);
    }

}

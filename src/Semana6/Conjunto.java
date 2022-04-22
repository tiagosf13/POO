package src.Semana6;

import java.util.Vector;

public class Conjunto {
    private Vector<Integer> conjunto = new Vector<Integer>(0);

    public void insert(int n){
        if(!this.contains(n)){
            this.conjunto.addElement(n);
        }
    }

    public void remove(int n){
        if(this.contains(n)){
            this.conjunto.removeElement(n);
        }
    }

    public boolean contains(int n){
        return (this.conjunto.contains(n));
    }

    public void empty(){
        this.conjunto.removeAllElements();
    }

    public String toString(){
        return (this.conjunto.toString());
    }

    public int size(){
        return (this.conjunto.size());
    }

    public Conjunto combine(Conjunto add){
        Conjunto resultado_combinacao = new Conjunto();
        for (int i=0;i<conjunto.size();i++){
            resultado_combinacao.insert(conjunto.elementAt(i));
        }
        for (int i=0; i<add.size();i++){
            resultado_combinacao.insert(add.conjunto.elementAt(i));
        }
        return(resultado_combinacao);
    }

    public Conjunto subtract(Conjunto dif){
        Conjunto resultado_subtract = new Conjunto();
        for (int i=0;i<this.size();i++){
            if (!dif.contains(this.conjunto.elementAt(i))){
                resultado_subtract.insert(this.conjunto.elementAt(i));
            }
        }
        return (resultado_subtract);
    }

    public Conjunto intersect(Conjunto inter){
        Conjunto resultado_intersecao = new Conjunto();
        for (int i=0;i<this.size();i++){
            if (inter.conjunto.contains(this.conjunto.elementAt(i))){
                resultado_intersecao.insert(this.conjunto.elementAt(i));
            }
        }
        return (resultado_intersecao);
    }
}
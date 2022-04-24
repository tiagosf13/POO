package src.Semana6;

import java.util.Vector;

public class Conjunto {
    private Vector<Integer> conjunto = new Vector<Integer>(0);

    //insert a new element in Vector conjunto
    public void insert(int n){
        if(!this.contains(n)){
            this.conjunto.addElement(n);
        }
    }

    
    //remove a element in Vector conjunto
    public void remove(int n){
        if(this.contains(n)){
            this.conjunto.removeElement(n);
        }
    }

    //check if Vector conjunto contains a element
    public boolean contains(int n){
        return (this.conjunto.contains(n));
    }

    //empty the Vector conjunto
    public void empty(){
        this.conjunto.removeAllElements();
    }

    //converts an element of Vector conjunto onto a String
    public String toString(){
        return (this.conjunto.toString());
    }

    //calculates the size of Vector conjunto
    public int size(){
        return (this.conjunto.size());
    }

    //builds a new Conjunto that represents the combination of two Conjuntos
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

    //builds a new Conjunto that represents the diference between Conjunto This and Conjunto dif
    public Conjunto subtract(Conjunto dif){
        Conjunto resultado_subtract = new Conjunto();
        for (int i=0;i<this.size();i++){
            if (!dif.contains(this.conjunto.elementAt(i))){
                resultado_subtract.insert(this.conjunto.elementAt(i));
            }
        }
        return (resultado_subtract);
    }

    //builds a new Conjunto that representss the intersection of Conjunto This and Conjnunto inter
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
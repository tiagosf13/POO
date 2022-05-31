package src.Semana9;

import java.util.ArrayList; 
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.TreeSet;
import src.Semana7.*;
 
public class Ex1 { 
 
  public static void main(String[] args) { 
    ArrayList<Integer> c1 = new ArrayList<>(); 
    for (int i = 10; i <= 100; i+=10)  
      c1.add(i); 
    System.out.println("Size: " + c1.size()); 
    for (int i = 0; i < c1.size(); i++){
      System.out.println("Elemento: " + c1.get(i));
      System.out.println("Indice: " + c1.indexOf(c1.get(i)));
    }
    c1.set(2, 50000);
    System.out.println(c1);
     
    ArrayList<String> c2 = new ArrayList<>(); 
    c2.add("Vento"); 
    c2.add("Calor"); 
    c2.add("Frio"); 
    c2.add("Chuva");
    c2.add("Chuva");
    System.out.println(c2.lastIndexOf("Chuva"));
    System.out.println(c2.size());
    System.out.println(c2.contains("Calor"));
    System.out.println(c2); 
    Collections.sort(c2); 
    System.out.println(c2); 
    c2.remove("Frio");  
    c2.remove(0); 
    System.out.println(c2);
    System.out.println(c2.subList(0, 2));

    Set<Pessoa> c3 = new HashSet<>();

    c3.add(new Pessoa("Maria", 978972233, new DataYMD(26, 12, 2002)));
    c3.add(new Pessoa("João", 454565677, new DataYMD(13, 12, 2007)));
    c3.add(new Pessoa("Tiago", 687659678, new DataYMD(5, 9, 1998)));
    c3.add(new Pessoa("Tomás", 546547657, new DataYMD(1, 1, 2000)));
    c3.add(new Pessoa("Teresa", 1786959975, new DataYMD(31, 4, 2015))); 
    c3.add(new Pessoa("Teresa", 1786959975, new DataYMD(31, 4, 2015))); 

    for (Pessoa p : c3){
      System.out.println(p);
    }
    
    Set<Data> c4 = new TreeSet<>();

    c4.add(new DataYMD(26, 12, 2002));
		c4.add(new DataYMD(13, 12, 2007));
		c4.add(new DataYMD(5, 9, 1998));
		c4.add(new DataYMD(1, 1, 2000));
		c4.add(new DataYMD(31, 4, 2015));
		c4.add(new DataYMD(3, 4, 2003));

		System.out.println(c4);
  } 
}
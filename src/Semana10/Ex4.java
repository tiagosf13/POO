package src.Semana10;

import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;

public class Ex4 {
    public static void main(String[] args) throws IOException{ 
        Scanner input = new Scanner(new FileReader("words.txt")); 
        while (input.hasNext()) { 
         String word = input.next(); 
         System.out.println(word); 
        } 
       }
}

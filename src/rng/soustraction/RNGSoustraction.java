package rng.soustraction;

import java.util.Random;
import java.util.Scanner;

public class RNGSoustraction {
/*
 * 
 * @param args 
 */
    public static void main(String[] args) {
        
        Random rand = new Random();
        Scanner salut = new Scanner(System.in);
        
           int rng1 = rand.nextInt(10);
           int rng2 = rand.nextInt(10);
           if (rng1 < rng2) {
               int temp = rng1;
               rng1 = rng2;
               rng2 = temp;        
           };
           
           
           int result = (rng1 - rng2);
           
           System.out.println("what is the answer to " + rng1 +"-"+ rng2 +"?");
           int answer = salut.nextInt();
           
           if(answer == result) 
               System.out.println("Correct!");
           
           else {
               System.out.println("Wrong!");
               System.out.println("The correct answer to " + rng1 +"-"+ rng2 + " is");
               System.out.println(result);
                }

            }
    
}
//

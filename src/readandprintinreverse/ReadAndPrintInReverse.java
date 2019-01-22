/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readandprintinreverse;

import java.util.Scanner;

/**
 *
 * @author shaim
 */
public class ReadAndPrintInReverse {

    /**
     * @param args the command line arguments will be empty as this program doesn't take any arguments
     */
    public static void main(String[] args) {
        
        //(1) Read a word from the user
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please Enter your name:");
        
        String name = sc.nextLine();
        
        //Verify the reading step
       // System.out.println("You Entered :" + name);
        
       //(2) Store the characters of the input name into an array of chars
       char[] nameInChars = new char[name.length()];
       
       for (int i=0; i<name.length(); i++)
            nameInChars[i] = name.charAt(i);
       
       /*
       // Verify the array was populated properly
       for (int i=0; i<nameInChars.length ; i++)
           System.out.println(nameInChars[i]);
       */

       for(int i=nameInChars.length-1  ; i>=0; i--)
           System.out.println(nameInChars[i]);
    
       // tests passed successfully 
    }
    
    
}

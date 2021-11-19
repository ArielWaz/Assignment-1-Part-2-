/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;
import java.util.Scanner;
/**
 *
 * @author Ariel
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // By Ariel Wazana
        
        Scanner myInput = new Scanner(System.in); //Creating Scanner
        System.out.printf("Please input a birth year: "); //Asking questions
        String birthYear = myInput.next(); // BirthYear string
        
        //Making Century Strings and ints
        String centuryStr = birthYear.substring(0,2);
        int century = Integer.parseInt(centuryStr)+1;
        
        //Making decade strings and ints
        String decadeStr = birthYear.substring(2,3);
        int decade = Integer.parseInt(decadeStr)*10;
        
        //Final outputs
        System.out.printf("%-10s: %s %n", "Birth Year",birthYear);
        System.out.printf("%-10s: %s %n", "Century",century);
        System.out.printf("%-10s: %s %n", "Decade",decade);
        
    }
    
}

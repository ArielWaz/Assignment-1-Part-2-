/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;
import java.util.Scanner;
/**
 *
 * @author Ariel
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Programming by Ariel Wazana
        //Creating Scanner and question
        Scanner myInput = new Scanner(System.in);
        System.out.printf("Please input the number of minutes your car has parked: ");
        // creating variables
        int numberMinutes = myInput.nextInt();
        double hours = (double)numberMinutes/60;
        int numberHours = (int)Math.ceil(hours);
        //more variables
        float price = numberHours*2;
        
        //Final outputs
        System.out.printf("%-13s: %s %n", "Parking Time(minutes)",numberMinutes);
        System.out.printf("%-21s: %s %n", "Parking time(hours)",numberHours);
        System.out.printf("%-21s: %s %n", "Price",String.format("%.2f", price));
        
        
        
    }
    
}

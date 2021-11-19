/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;
import java.util.Scanner;
/**
 *
 * @author Ariel
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // by Ariel Wazana
        //Creating Scanner
        Scanner myInput = new Scanner(System.in);
       System.out.printf("Please input 5 numbers seperated by space: ");
       String numbers = myInput.nextLine();
        //Creating a postion t find the spaces
        int pos = numbers.indexOf(" ");
        String nb1 = numbers.substring(0,pos);
        numbers = numbers.substring(pos + 1);
        pos = numbers.indexOf(" ");
        String nb2 = numbers.substring(0,pos);
        numbers = numbers.substring(pos + 1);
        pos = numbers.indexOf(" ");
        String nb3 = numbers.substring(0,pos);
        numbers = numbers.substring(pos + 1);
        pos = numbers.indexOf(" ");
        String nb4 = numbers.substring(0,pos);
        numbers = numbers.substring(pos + 1);
        //pos = numbers.indexOf(" ");
        String nb5 = numbers;
        //converting string to double
        double number1 = Double.parseDouble(nb1),number2 = Double.parseDouble(nb2),number3 = Double.parseDouble(nb3),number4 = Double.parseDouble(nb4),number5 = Double.parseDouble(nb5);
        //finding the mean
        double mean = (number1 + number2 + number3 + number4 + number5)/5;
        //finding the minimum
        double minimum = number1;
        if (number2 < minimum ){
            minimum = number2;
        }
        if (number3 < minimum ){
            minimum = number3;
        }
        if (number4 < minimum ){
            minimum = number4;
        }
        if (number5 < minimum ){
            minimum = number5;
        }
        //finding the maximum
        double maximum = number1;
        if (number2 > maximum ){
            maximum = number2;
        }
        if (number3 > maximum ){
            maximum = number3;
        }
        if (number4 > maximum ){
            maximum = number4;
        }
        if (number5 > maximum ){
            maximum = number5;
        }
        //finding the standard deviation
        double sum = Math.pow(Math.abs(number1 - mean),2)+ Math.pow(Math.abs(number2 - mean),2)+ Math.pow(Math.abs(number3 - mean),2)+ Math.pow(Math.abs(number4 - mean),2)+ Math.pow(Math.abs(number5 - mean),2);
        double deviation = Math.sqrt(sum/5);
        //variable for output
        String allNumbers = String.format("%.2f", number1)+ ", " + String.format("%.2f", number2)+ ", " + String.format("%.2f", number3)+ ", " + String.format("%.2f", number4)+ ", " + String.format("%.2f", number5);
        //Final output
        System.out.printf("%-21s: %s %n", "Numbers",allNumbers);
        System.out.printf("%-21s: %s %n", "Mean",String.format("%.2f", mean));
        System.out.printf("%-21s: %s %n", "Minimum",String.format("%.2f", minimum));
        System.out.printf("%-21s: %s %n", "Maximum",String.format("%.2f", maximum));
        System.out.printf("%-21s: %s %n", "Standard Deviation",String.format("%.2f", deviation));
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;
import java.util.Scanner;
/**
 *
 * @author Ariel
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // By Ariel Wazana
        
        //Making Scanner and question
        Scanner myInput = new Scanner(System.in);
        System.out.printf("Please input a web adress: ");
        //Making Adress strings and ints
        String adress = myInput.next();
        int pos = adress.indexOf(".");
        //Making heading strings and ints
        String heading = adress.substring(0,pos).toLowerCase() ;
        int pos2 = adress.lastIndexOf(".");
        //Making company string
        String company = adress.substring(pos + 1,pos2).toLowerCase();
        //Making extension string
        String extension = adress.substring(pos2 + 1, adress.length()).toLowerCase();
        //Printing Final outputs
        System.out.printf("%-10s: %s %n", "Adress",adress);
        System.out.printf("%-10s: %s %n", "Heading",heading);
        System.out.printf("%-10s: %s %n", "Company",company);
        System.out.printf("%-10s: %s %n", "Extension",extension);
         
        
    }
    
}

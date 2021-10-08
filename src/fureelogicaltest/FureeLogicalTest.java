/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fureelogicaltest;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class FureeLogicalTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConverterClass converter = new ConverterClass();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Your Number: ");
        int number = input.nextInt();
        
        if(number >= 1000 && number < 1000000) {
            System.out.println(converter.thousand(number));
        } else if (number >= 100 && number < 1000000) {
            System.out.println(converter.hundreds(number));
        } else if (number >= 10 && number < 1000000) {
            System.out.println(converter.dozens(number));
        } else if (number > 0 && number < 1000000) {
            System.out.println(converter.units(number));
        } else if (number > 999999) {
            System.out.println("The number your entered is more than 6 digits.");
        }
        else {
            System.out.println("The number your entered is undefined.");
        }
    }
    
}

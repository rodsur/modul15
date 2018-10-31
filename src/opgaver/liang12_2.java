/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgaver;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author rodsur
 */
public class liang12_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] months = {"January", "February", "March", "April",
        "May", "June","July", "August", "September", "October",
        "November", "December"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        try {
            System.out.print("Choose a month: ");
            int input = new Scanner(System.in).nextInt();
            System.out.println(input);
        
            System.out.println(months[input-1] + " har " + dom[input-1] + " dage.");
        
        } catch (InputMismatchException e) {
            System.out.println("Thats not a number!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ikke en gyldig måned");
        }
        
        
        
        
    }
    
}

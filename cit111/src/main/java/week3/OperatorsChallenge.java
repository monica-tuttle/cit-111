/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/*/*
 * Operators challenge - part of Chunk 1, Mod 3, Ex 0.
 * @author Monica Tuttle
 **/
public class OperatorsChallenge {
    // main method which stores values and then prints out values to console
    public static void main(String[] args) {
        int a = 100;
        int b = 2000;
        double d = 10.5;
        String line1 = " Go Ask Alice";
        String line2 = " I think she'll know";
        
        // demonstrates division operator
        int r = b/a;
        System.out.println(b + " divided by " + a + " is: " + r);
        
        // demonstrates modulo operator
        int mod = b % a;
        System.out.println(b + " modulus " + a + " is: " + mod);
        
        // demonstrates modulo and multiplication operators
        double rd = mod * d;
        System.out.println(b + " modulus " + a + " multipled by " + d + " is: " + rd);
        
        a = a + 5;
      
        System.out.println("We've added 5 to the value of 100, and we're about to compute the value of " + b + " mod " + a +": ");
        
        // demonstrates modulo again 
        rd = b % a;
        System.out.println(b + " modulus " + a + " is: " + rd);
        
        System.out.println(line1);
        System.out.println(line2);
        
        //demonstrates concatenation of strings
        String combined = line2 + line1;
        String combined2 = line1 + line2;

        System.out.println("Combined: " + combined + " Or is it " + combined2);
        
        
    }
}

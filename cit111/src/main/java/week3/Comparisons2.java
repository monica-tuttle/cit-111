/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author monimoni
 */
public class Comparisons2 {
    // main method introduced - will compare two variables with == operator
    public static void main(String[] args){
        int correctPasscode = 5934;
        int attemptedPasscode = 1234;
        // if block - if two variables match, "true" statement will occur
        if(correctPasscode == attemptedPasscode){
        
        System.out.println("Codes match! You're in");
        // else block - if two variables do NOT match, "false" statement will occur
    } else {
            System.out.println("Codes don't match--No soup for you!");
            } // close if/else
    } // close main method
} // close class Comparisons2

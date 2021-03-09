/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;
/**
 *Demonstrates the basic functionality of a while() statement 
 * @author Monica
 */
public class RetireesCount {
    
    public static void main(String[] args) {
    // open main method
    int age;
    int retireeCount = 0;
    int nonRetireeCount = 0;
    // make a Scanner object and store in a variable whose name we can choose
    Scanner inputScanner = new Scanner(System.in);
    
    // the test condition for this while statement is always true,
    // so the looping will occur until the user issues a command to the compiler
    // to stop execution
    while(true){
        // prompt the user for age
        System.out.println("Enter your age to see if you can retire:");
        // read age from the console and store in variable
        age = inputScanner.nextInt();
        // implement basic if() logic -- if they're over 65
        if(age >= 65){
            // if true
            System.out.println("Wahoo! Grab the newspaper and martini!");
            retireeCount = retireeCount + 1;
        } else if(age < 0) {
            // if false
            break;
        } else if(age < 65 && age > 0){
            System.out.println("Sorry, Keep working...");
            nonRetireeCount = nonRetireeCount + 1;
        }// close if/else block
       } // close while() loop
    System.out.println("Thanks for checking your retirement status.");
    System.out.println("Count of retirees who entered their age: " + retireeCount);
    System.out.println("Count of non-retirees who entered their age: " + nonRetireeCount);
    } // close main method
} // close class

        
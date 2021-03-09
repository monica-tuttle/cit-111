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
public class RetirementAgeAverage {
    
    public static void main(String[] args) {
    // open main method
    int age;
    int runningAge = 0;
    int userCount = 0;
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
            runningAge = age + runningAge;
            userCount = userCount + 1;
            System.out.println("Running sum of ages: " + runningAge);
            System.out.println("Running count of users: " + userCount);
            System.out.println("Running average age of users before you: " + (runningAge / userCount));
        } else if(age < 0) {
            // if false
            break;
        } else if(age < 65 && age > 0){
            System.out.println("Sorry, Keep working...");
            runningAge = age + runningAge;
            userCount = userCount + 1;
            System.out.println("Running sum of ages: " + runningAge);
            System.out.println("Running count of users: " + userCount);
            System.out.println("Running average age of users before you: " + (runningAge / userCount));
        }// close if/else block
       } // close while() loop
    
    System.out.println("Thanks for checking your retirement status.");
    } // close main method
} // close class

        
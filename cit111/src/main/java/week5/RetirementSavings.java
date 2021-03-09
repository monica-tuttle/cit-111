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
public class RetirementSavings {
    
    public static void main(String[] args) {
    // open main method
    int age;
    int savings;
    final int savingsThresh = 360000;
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
            System.out.println("Okay, you're of retirement age, but do you have enough in savings? Let's see.");
            System.out.println("Enter your current amount of savings: ");
            savings = inputScanner.nextInt();
            if(savings >= savingsThresh){
            System.out.println("Great, you have enough in savings!");
            System.out.println("Assuming you'll live another 30 years, the amount of money you have "
                    + "to spend is $" + (savings / 30) + " per year.");
            } else {
              System.out.println("You don't have enough in savings. With your current"
                      + "savings you would have $" + (savings / 30) + " per year.");
              System.out.println("It is recommended that you save an additional $" + (savingsThresh - savings)
                      + " before you retire.");
                    }
        } else if(age < 0) {
            // if false
            break;
        } else if(age < 65 && age > 0){
            System.out.println("You're not of retirement age, so you need to keep working.");
            System.out.println("Let's see how much left you need to save for retirement.");
            System.out.println("Please enter your current savings: ");
            savings = inputScanner.nextInt();
            if(savings >= savingsThresh){
            System.out.println("Great, you're ahead of schedule! Keep saving for a comfortable retirement.");
            } else {
              System.out.println("You still need to save more. If you retired at 65 with"
                      + "fyour current savings you would have $" + (savings / 30) + " per year.");
              System.out.println("It is recommended that you save an additional $" + (savingsThresh - savings)
                      + " before you retire.");
                    }
        }// close if/else block
       } // close while() loop
    System.out.println("Thanks for checking your retirement status.");
    } // close main method
} // close class

        
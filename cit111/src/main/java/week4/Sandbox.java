/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;
import java.util.Scanner;

/**
 *
 * @author monimoni
 */
public class Sandbox {
    public static void main(String[] args){
        final int compatThresh = 30;
        int compatScore = 0;
        int userResponse = 0;
        Scanner inputScanner;
        // boolean passedThreshold = false;
        inputScanner = new Scanner(System.in);
        
         // welcome user and ask for their name
        System.out.println("Hello, nice to meet you! What's your name?");
        
        String userResponseString = inputScanner.next(); 
        System.out.println("Nice to meet you " + userResponseString + "!");
        System.out.println("I was wondering...might we be friends? Let me"
                + " ask you some questions to see:");
        
        // Deal breakers cluster 
        // Q1
        System.out.println("Are you a convicted criminal? Enter '1' for yes, '0' for no.");
        userResponse = inputScanner.nextInt();
        if(userResponse == 1) {
            compatScore = compatScore -1;

        } else if(userResponse == 0){
            System.out.println("Alright, next question!");
            compatScore = compatScore + 0;
        
       System.out.println("Did you ever vote for Donald Trump? Enter '1' for yes, '0' for no.");
       userResponse = inputScanner.nextInt();}
        if(userResponse == 1) {
            compatScore = compatScore - 1;

        } else if(userResponse == 0){
            System.out.println("Alright, next question!");
            compatScore = compatScore + 0;
      
       
       System.out.println("Do you believe in trickle-down economics? Enter 1 for 'yes' or 0 for 'no.");
       userResponse = inputScanner.nextInt();}
        if(userResponse == 1) {
            compatScore = compatScore - 1;
        } else if(userResponse == 0){
            System.out.println("Alright, next question!");
            compatScore = compatScore + 0;
            }

if(compatScore < 0) { 
System.out.println("Sorry, we can't be friends!");
} else {
System.out.println("Alright, next question!");
   }     
        System.out.println("On the spectrum from animals to plants, what do you eat?");
        System.out.println("1. Mostly or solely meat and dairy products");
        System.out.println("2. A mix of animal and plant-based foods");
        System.out.println("3. Mostly or solely plant-based foods");
        switch(userResponse) {
            case 1: 
                compatScore = compatScore - 20;
                break;
            case 2: 
                compatScore = compatScore + 10;
                break;
            case 3:
                compatScore = compatScore + 20;
                System.out.println("Are you vegan? Type 'yes' or 'no'.");
                if(userResponse == 1){
                    compatScore = compatScore + 5;
                }
                else {
                    compatScore = compatScore + 0;
                };
                break;
                //close switch
} // close main
    }     
    }// close Sandbox
                    // Foods and cuisine cluster
                    // Queston 1
                  /*  System.out.println("On the spectrum from animals to plants, what do you eat?");
                    System.out.println("1. Mostly or solely meat and dairy products");
                    System.out.println("2. A mix of animal and plant-based foods");
                    System.out.println("3. Mostly or solely plant-based foods");
                    switch(userResponse) {
                        case 1: 
                            compatScore = compatScore - 20;
                            break;
                        case 2: 
                            compatScore = compatScore + 10;
                            break;
                        case 3:
                            compatScore = compatScore + 20;
                            System.out.println("Are you vegan? Type 'yes' or 'no'.");
                            if(userResponse == 1){
                                compatScore = compatScore + 5;
                            }
                            else {
                                compatScore = compatScore + 0;
                            };
                            break;
                            //close switch
                   
                    }
            if(compatScore >= compatThresh) {
            System.out.println("Hey, looks like we're compatible. Let's be friends!");
        }
            else {
            System.out.println("Nice meeting you, but it looks like we're not compatible.");
        } // close block
    }// close main
} // close class
*/
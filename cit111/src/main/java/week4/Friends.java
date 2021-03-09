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
public class Friends {
    public static void main(String[] args) {
   
        int compatScore = 0;
        final int compatThresh = 30;    
        Scanner scan = new Scanner(System.in); 
        // int responseNum = userInputScanner.nextInt();

        // welcome user and ask for their name
        System.out.println("Hello, nice to meet you! What's your name?");
        
        String name = scan.next(); 
        System.out.println("Nice to meet you " + name + "!");
        System.out.println("I was wondering...might we be friends? Let me"
                + " ask you some questions to see:");

        // Queston 1
        System.out.println("On the spectrum from carnivore to vegan, what do you eat?");
        System.out.println("1. Carnivore/meat-lover: 'Vegetables are my kryptonite! Unless by 'veggies' you mean potato chips...'");
        System.out.println("2. Omnivore: 'I eat a mixture of animals and plant-based foods'");
        System.out.println("3. Vegetarian - I eat mostly plant-based foods, but I do still eat eggs and dairy");
        System.out.println("4. Vegan -  Solely plant-based foods; NO animals or animal by-products.");
        //
        int userResponse = scan.nextInt();
        switch(userResponse) {
            case 1: 
                compatScore = compatScore - 20;
                break;
            case 2: 
                compatScore = compatScore + 10;
                break;
            case 3:
                compatScore = compatScore + 20;
                break;
            case 4:
                compatScore = compatScore + 30;
     
        } //close switch
        
        // Question 2
        System.out.println("Which outdoor activity below do you enjoy the most?");
        System.out.println(' ');
        System.out.println("1. Exploring cityscapes i.e. 'urban hiking'");
        System.out.println("2. Exploring parks (whether local or national");
        System.out.println("3. Riding your bike along the trails");
        System.out.println("4. Inline skating on vacant parking lots or industrial parks");
        System.out.println("5. White-water rafting, sky-diving, or rock-climbing");
        System.out.println("6. Camping");
        System.out.println("7. None of the above");

       userResponse = scan.nextInt();
        switch(userResponse) {
            case 1: 
                compatScore = compatScore + 20;
                break;
            case 2: 
                compatScore = compatScore + 20;
                break;
            case 3:
                compatScore = compatScore + 20;
                break;
            case 4:
                compatScore = compatScore + 20;
                break;
            case 5:
                compatScore = compatScore - 20;                        
            case 6:
                compatScore = compatScore + 10;
                break;
            case 7:
                compatScore = compatScore - 20;
        } //close switch
        
        //Question 3
        System.out.println("Which of these indoor activities with friends do you enjoy the most?");
        System.out.println(" ");
        System.out.println("1. Live theatre, comedy, or musical productions");
        System.out.println("2. Visiting art galleries and exhibits");
        System.out.println("3. Karoake or jam sessions");
        System.out.println("4. Watching films and shows at home");
        System.out.println("5. Thrifting and creative reuse");
        System.out.println("6. Dance clubs");
        System.out.println("7. Shopping at the mall or department stores");
        System.out.println("8. None of the above");
        
        userResponse = scan.nextInt();
        switch(userResponse) {
            case 1: 
                compatScore = compatScore + 20;
                break;
            case 2: 
                compatScore = compatScore + 20;
                break;
            case 3:
                compatScore = compatScore + 10;
                break;
            case 4:
                compatScore = compatScore + 20;
                break;
            case 5:
                compatScore = compatScore + 20;
                break;
            case 6:
                compatScore = compatScore + 0;
                break;
            case 7:
                compatScore = compatScore - 20;
                break;
            case 8:
                compatScore = compatScore - 20;
               
                        
        } //close switch
        if(compatScore >= compatThresh) {
            System.out.println("Hey, looks like we're compatible!");
        }
        else {
            System.out.println("Nice meeting you, but it looks like we're not compatible.");
        }
    } // close main
} // close class

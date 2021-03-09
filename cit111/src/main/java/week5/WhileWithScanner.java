/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;
/**
 *Adding user input to our while loop learning
 * @author Moni
 */
public class WhileWithScanner {
    // open main method
    public static void main(String[] args){
        int numLoops = 0;
        int loopControl;
        // build a scanner object
        Scanner scanner = new Scanner(System.in);
        // prompt user to get an int from them
        System.out.println("How many loops shall I print?");
        loopControl = scanner.nextInt();
        // loop as long as numLoops is less than or equal to our loopControl
        // which we gathered from the user
        while(numLoops <= loopControl){
            System.out.println("The value of numLoops: " + numLoops);
            // add one to numLoops each time we cycle so we only
            // loop the number of times the user gave input
            numLoops = numLoops + 1;
        } // close while
        
        System.out.println("...After the whle loops");
    } // close main
} // close class

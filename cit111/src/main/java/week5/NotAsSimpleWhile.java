/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *a not as simple while() loop
 * @author Monica
 */
public class NotAsSimpleWhile {
    // open main method
    public static void main(String[] args){
        int numLoops = 0;
        
        while(numLoops <= 10){ // refactoring option 1
            // numLoops = numLoops + 1; // refactoring option 2
            // refactoring option 3: while(numloops < 11)
            System.out.println("The value of numLoops: " + numLoops);
            numLoops = numLoops + 1;
            
        } // close while() loop
        System.out.println("...After the while loop");
    } // close main
} // close class

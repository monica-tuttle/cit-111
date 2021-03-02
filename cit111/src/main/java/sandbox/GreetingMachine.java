/*
 * 
 */
package sandbox;
/*
 *Utilizes a Scanner object to take in user inputs and execute
 *a greeting to the console
 */
import java.util.Scanner;

public class GreetingMachine { 
    
    public static void main(String[] args) {
        System.out.println("Please enter your name and press enter");
        Scanner scan = new Scanner(System.in); 
        String name = scan.next(); 
        System.out.println("Whoa, " + name + " What an interesting name card you have!");
    } // close main()
} // close class GreetingMachine
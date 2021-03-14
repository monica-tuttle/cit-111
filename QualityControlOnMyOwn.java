/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.util.Random;
/**
 *A simulation of a quality control for a manufacturing process.
 * @author Monica Tuttle
 */
public class QualityControlOnMyOwn {
    // open main
    public static void main(String[] args) {
        
        // declare and initialize variables
        Random randGenerator = new Random();
        // total number of units being tested
        int numberOfUnits = 10000;
        // unit quality threshold
        final int qualityThresh = 100;
        // highest quality score a unit can have
        int maxUnitQuality = 200;
        // counts the amount of failures
        int qualityFailCount = 0;
        // counts the amount of passes
        int qualityPassCount = 0;
        // caps looping
        int numLoops = 0;
        // sum of scores will help us compute average unit quality at end of program
        int runningSumOfScores = 0;
        // this will track total consecutive failures
        int consecutiveFailures = 0;
        // counts the amount of times program experiences 3 consecutive failures
        int consecFailsCount = 0;
        // saves failures count into new variable for computing failures after end of while loop
        double newFailCount;
        
        // looping until we reach number of units tested
        while(numLoops < numberOfUnits){
           int unitQualityScore = randGenerator.nextInt(maxUnitQuality);

          // if block for the scenario that the unit fails to meet thresh
          if(unitQualityScore < qualityThresh){
            System.out.println("Unit Quality: " + unitQualityScore);
            System.out.println("BELOW Quality Standards");
            qualityFailCount = qualityFailCount + 1;
            // add one to our sequential failures counter
            consecutiveFailures++;
            runningSumOfScores = runningSumOfScores + unitQualityScore;
            System.out.println("Total Failures: " + qualityFailCount);
            // keeping count of our looping
            numLoops = numLoops + 1;
            System.out.println("Cumulative Tests: " + numLoops);
            
          // else if block if unit meets or exceeds thresh
          
          // pretty-printing
            System.out.println("****************************");
            
        } else {
            System.out.println("Unit Quality: " + unitQualityScore);
            System.out.println("PASSES Quality Standards");
            System.out.println("Total Failures: " + qualityFailCount);
            // with any occurrence of a pass, reset failures counter
            consecutiveFailures = 0;
            runningSumOfScores = runningSumOfScores + unitQualityScore;
            // keeping count of our looping
            numLoops = numLoops + 1;
            System.out.println("Cumulative Tests: " + numLoops);
            
            // pretty-printing
            System.out.println("****************************");
            
          } // close if/else
          
          // open another if block within while loop for the purpose
          // of computing consecutive failures
          if(consecutiveFailures == 3){
              System.out.println("CONSECUTIVE failure; machine needs attention.");
              consecFailsCount = consecFailsCount + 1;
              
          } // close if block
        } // close while
        
        // compute summary stats outside of while loop
        System.out.println("*****PRODUCTION SUMMARY*****");
        System.out.println("Total Units Tested: " + numberOfUnits);
        newFailCount = qualityFailCount;
        System.out.println("Failure Ratio: " + (newFailCount / numberOfUnits));
        System.out.println("Total Consecutive Failures (3 in a row): " + consecFailsCount);
        System.out.println("Average Unit Quality: " + (runningSumOfScores / numberOfUnits));
        
  }// close main
}// close class




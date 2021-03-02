/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox;

/**
 *
 * @author monimoni
 */
public class Quicksand {
    public static void main(String[] args) {
       // System.out.println("Hey, you're in quicksand!");
        
        boolean hasWeapons = false;
        boolean hasBoardingPass = true;
        int heartRate = 58;
        // not have weapons, but has boarding pass & heart rate under 60
        
        if(!hasWeapons && hasBoardingPass && heartRate < 60){
            System.out.println("Successfully passed TSA screen!");
        }

        
    }
}

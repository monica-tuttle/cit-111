/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;

/**
 *A program that computes friendship compatibility
 * @author Monica Tuttle
 */
public class FriendswithStringInput {

    // open main method
    public static void main(String[] args) {
        // final value that user must score to be considered friend-compatible
        final int compatThresh = 35;
        // initial compatibity score will start at 0 and be overwritten multiple times 
        // based on how user answers and whether they accumulate more points
        int userResponse = 0;
        int compatScore = 0;
        // user responses in the form of pre-defined strings
        String answerYes = "yes";
        String answerNo = "no";
        // initializing Scanner object
        Scanner inputScanner;
        inputScanner = new Scanner(System.in);

        // print statement to welcome user and ask for their name
        System.out.println("Hello, nice to meet you! What's your name?");
        // Initializing Scanner object that takes in user's string input
        String userResponseString = inputScanner.nextLine();
        // print statement to express gratitude for introduction and repeat user's name back to them
        System.out.println("Nice to meet you " + userResponseString + "!");
        // print statement to introduce what the program entails
        System.out.println("I was wondering...might we be friends? Let me"
                + " ask you some questions to see:");

        // "Deal breakers" cluster - program will terminate if user answers "no" to any of these
        // Question 1
        System.out.println("Are you a convicted criminal? Enter 'yes', or 'no.'");
        // taking in string input
        userResponseString = inputScanner.nextLine();
        boolean stringsEqualYes = userResponseString.equals(answerYes);
        boolean stringsEqualNo = userResponseString.equals(answerNo);
        // "yes" response garners compatScore of -1, which prompts an end to the program
        if (stringsEqualYes) {
            compatScore = compatScore - 1;
            // "no" response doesn't add to the score, but allows user to be asked more questions
        } else if (stringsEqualNo) {
            System.out.println("Alright, next question!");
            compatScore = compatScore + 0;

            // Question 2
            System.out.println("Did you ever vote for Donald Trump? Enter 'yes' or 'no.'");
            // taking in string input
            userResponseString = inputScanner.nextLine();
        }
        stringsEqualYes = userResponseString.equals(answerYes);
        stringsEqualNo = userResponseString.equals(answerNo);
        // "yes" response garners compatScore of -1, which prompts an end to the program
        if (stringsEqualYes) {
            compatScore = compatScore - 1;
            // "no" response doesn't add to the score, but allows user to be asked more questions
        } else if (stringsEqualNo) {
            System.out.println("Alright, next question!");
            compatScore = compatScore + 0;

            // Question 3
            System.out.println("Do you believe in trickle-down economics? Enter 'yes' or 'no.");
            userResponseString = inputScanner.nextLine();
        }
        stringsEqualYes = userResponseString.equals(answerYes);
        stringsEqualNo = userResponseString.equals(answerNo);
        // "yes" response garners compatScore of -1, which prompts an end to the program
        if (stringsEqualYes) {
            compatScore = compatScore - 1;
            // "no" response doesn't add to the score, but allows user to be asked more questions
        } else if (stringsEqualNo) {
            compatScore = compatScore + 0;
        }

        if (compatScore <= -1) {
            System.out.println("Sorry, we can't be friends!");
        } else if (compatScore >= 0) {
            System.out.println("Alright, next question!");

            System.out.println("On the spectrum from animals to plants, what do you eat?"
                    + " Select the number for one of the following options: ");
            System.out.println("1. Mostly or solely meat and dairy products");
            System.out.println("2. A mix of animal and plant-based foods");
            System.out.println("3. Mostly or solely plant-based foods");
            // initializing Scanner to take in integer user input
            //if(compatScore <= -1) { 
            //System.out.println("Sorry, we can't be friends!");
            //} else if(compatScore >= 0)
            //{
            //System.out.println("Alright, next question!");
            userResponse = inputScanner.nextInt();
            if (userResponse == 1) {
                compatScore = compatScore - 5;
            } else if (userResponse == 2) {
                compatScore = compatScore + 10;
            } else if (userResponse == 3) {
                compatScore = compatScore + 15;
                System.out.println("Are you vegan? Enter 1 for 'yes' or 0 for 'no'.");
                userResponse = inputScanner.nextInt();
                if (userResponse == 1) {
                    compatScore = compatScore + 5;
                } else if (userResponse == 0) {
                    compatScore = compatScore + 0;

                } // close compatScore for vegan 
            } // closes diet question
            System.out.println("Let's get an idea of which group activities you prefer.");
            System.out.println("On a Saturday night with friends, would you rather...");
            System.out.println("1. Go to an art exhibit");
            System.out.println("2. Go to a nightclub");
            userResponse = inputScanner.nextInt();
            if (userResponse == 1) {
                compatScore = compatScore + 5;
            } else if (userResponse == 2) {
                compatScore = compatScore + 0;
            }

            System.out.println("On a snowy winter evening with friends, would you rather...");
            System.out.println("1. Stay in and watch a show on Netflix");
            System.out.println("2. Find a large hill and go sledding");
            userResponse = inputScanner.nextInt();
            if (userResponse == 1) {
                compatScore = compatScore + 5;
            } else if (userResponse == 2) {
                compatScore = compatScore + 0;
            }

            System.out.println("On a summer day, would you rather...");
            System.out.println("1. Walk around the city for miles and miles");
            System.out.println("2. Go swimming at the public pool");
            userResponse = inputScanner.nextInt();
            if (userResponse == 1) {
                compatScore = compatScore + 5;
            } else if (userResponse == 2) {
                compatScore = compatScore + 0;
            }

            System.out.println("On a autumn day with friends, would you rather...");
            System.out.println("1. Go to the Renaissance Fair");
            System.out.println("2. Watch a football game");
            userResponse = inputScanner.nextInt();
            if (userResponse == 1) {
                compatScore = compatScore + 5;
            } else if (userResponse == 2) {
                compatScore = compatScore + 0;
            }

            System.out.println("When you're feeling sad, would you rather...");
            System.out.println("1. Laugh off the blues at a comedy improv show");
            System.out.println("2. Go to a low-key bar or cafe and talk it out with your friend");
            userResponse = inputScanner.nextInt();
            if (userResponse == 1) {
                compatScore = compatScore + 5;
            } else if (userResponse == 2) {
                compatScore = compatScore + 0;
            }

            System.out.println("When you want to do something creative with friends, would you rather..");
            System.out.println("1. Go to Construction Junction or the Center for Creative Reuse and repurpose something");
            System.out.println("2. Engage in an impromptu jam session with your musician friends");
            userResponse = inputScanner.nextInt();
            if (userResponse == 1) {
                compatScore = compatScore + 5;
            } else if (userResponse == 2) {
                compatScore = compatScore + 0;
            }

            System.out.println("When you want to affect change in the world with your friends, would you rather...");
            System.out.println("1. Go to a march or protest together");
            System.out.println("2 Stay in and message your representatives");
            userResponse = inputScanner.nextInt();
            if (userResponse == 1) {
                compatScore = compatScore + 5;
            } else if (userResponse == 2) {
                compatScore = compatScore + 0;

            }

            System.out.println("Compatibility score: " + compatScore);
            if (compatScore >= compatThresh) {
                System.out.println("Hey, looks like we're compatible. Let's be friends!");
            } else {
                System.out.println("Nice meeting you, but it looks like we're not compatible.");
            }
        } // close else if block of last abort question
    }// close main
} // close class

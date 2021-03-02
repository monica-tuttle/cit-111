
package week3;

/**
 *
 * @author monimoni
 */
public class RoadTrip {
    public static void main(String[] args){
        
        // declaring and initializing variables
        String carMake = "1996 Mazda Protege";
        String carName = "Nedfry";
        int maxPassengers = 5; // primitive type variable
        int currentNumberOfPassengers = 1;
        int remainingPassengerSpace = maxPassengers - currentNumberOfPassengers;
        boolean carFull = false;
        double tripOdometer = 0.0;
        double tripBudget = 300.00;
        double distanceToMoabUtah = 1806.0;
        boolean destinationReached = false;
        
        double legDistance; // declaring this variable but not initalizing
        
        // simulation of the roadtrip
        //print initial stats
        System.out.println("***Road trip simulator***");
        System.out.println("--> Beginning of trip stats <--");
        System.out.println("Make of car: " + carMake + " that can carry "
                + maxPassengers + " passengers.");
        System.out.println("Car's name: " + carName);
        System.out.println("Distance To Destination: " + distanceToMoabUtah + " miles");
        System.out.println("Full Car? " + carFull);
        System.out.println("Current odometer reading: " + tripOdometer + " miles.");
        System.out.println("We have $" + tripBudget + " to spend on this trip.");
        System.out.println("Starting trip with " + currentNumberOfPassengers + " passenger");
        System.out.println("Destination Reached? " + destinationReached);
        
        // Calculate leg distance: 25% of total trip, store in legDistance
        legDistance = (0.25 * distanceToMoabUtah);
        System.out.println("Distance for first quarter of the trip: " + legDistance + " miles");
                
        // increment trip odometer by leg distance, over-write odometer
        tripOdometer = tripOdometer + legDistance;
        System.out.println("Odometer now reads: " + tripOdometer + " miles");
        
        // subtract leg distance from distanceTo destination, over-write distance
        double distanceToDestination = distanceToMoabUtah - legDistance;
        System.out.println(distanceToDestination + " miles");
   
        // "see" hitch hiker heading West
        String noticeHitchHiker = "Hey, there's someone standing on the side of the road!";
            System.out.println(noticeHitchHiker);
        // Check if there is room in the car, if so, pick up hitch hiker
        int hitchHiker = 1;
        currentNumberOfPassengers = currentNumberOfPassengers + hitchHiker;
        if (currentNumberOfPassengers <= remainingPassengerSpace) {
            System.out.println("(To the hitch hiker): Hey there! We have " + remainingPassengerSpace 
                   + " open seat(s), so come on and take a free ride!");
            remainingPassengerSpace = remainingPassengerSpace - hitchHiker;
            System.out.println("There are now " + currentNumberOfPassengers + " passengers"
                   +  " and " + remainingPassengerSpace + " empty seat(s) left.");
        }   
        else {System.out.println("Sorry, no more room!"); }

        // Note: need to overwrite passenger capacity after adding hitchiker
        
        // calculate price of gas for first leg and store in temp variable
        double pricePerGallon = 2.62;
        double tankCapacity = 14.5;
        double priceOfFullTank = pricePerGallon * tankCapacity;
        double milesToTheGallon = 36;
        double totalMilesInTank = milesToTheGallon * tankCapacity;
        double tankCapacityLeft = totalMilesInTank - legDistance;
        
        // deduct $ spent on gas from money remaining and over-write tripBud
        tripBudget = tripBudget - priceOfFullTank;
        
        // reprint status of variables to the console
        System.out.println("Total mileage of tank: " + totalMilesInTank + " miles.");
        System.out.println("After the first leg, we have a mileage of " 
                + tankCapacityLeft + " miles left before we have to refill the tank.");
        System.out.print("We'll need to allocate $" + priceOfFullTank + " to refill the tank.");
        System.out.print("That will leave us with $" + tripBudget + " left in our budget.");

        // Beginning our second leg!
        // declaring and initializing our second leg distance variable
        double legDistanceTwo = 500.0;
        System.out.println(noticeHitchHiker);
        // reintroducing our If Controlled block for the hitch hikers
        hitchHiker = 2;
        currentNumberOfPassengers = currentNumberOfPassengers + hitchHiker;
        if (currentNumberOfPassengers <= remainingPassengerSpace) {
            System.out.println("(To the hitch hiker): Hey there! We have " + remainingPassengerSpace 
                   + " open seat(s), so come on and take a free ride!");
            remainingPassengerSpace = remainingPassengerSpace - hitchHiker;
            System.out.println("There are now " + currentNumberOfPassengers + " passengers"
                   +  " and " + remainingPassengerSpace + " empty seat(s) left.");
        }   
        else {System.out.println("Sorry, no more room!"); }
        
        // calculating the price of gas for the total second leg distance
        double pricePerMile = priceOfFullTank / totalMilesInTank;
        System.out.println("Cost of a mile: " + pricePerMile);
        double totalFuelCostSecondLeg = pricePerMile * legDistanceTwo;
        System.out.println("The price of gas for the entire second leg is $" 
                + totalFuelCostSecondLeg + ".");
        
        
        
        
    } // close class main
} // close class RoadTrip

        


import java.util.*;

public class TrainApp {

    public static void main(String[] args) {

        // Header
        System.out.println("==================================");
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("==================================\n");

        // Create ArrayList
        List<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display after adding
        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies: " + passengerBogies + "\n");

        // Remove a bogie
        passengerBogies.remove("AC Chair");

        // Display after removing
        System.out.println("After Removing 'AC Chair':");
        System.out.println("Passenger Bogies: " + passengerBogies + "\n");

        // Check existence
        System.out.println("Checking if 'Sleeper' exists:");
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("Contains Sleeper?: " + exists + "\n");

        // Final list
        System.out.println("Final Train Passenger Consist:");
        System.out.println(passengerBogies + "\n");

        // Completion message
        System.out.println("UC2 operations completed successfully...");
    }
}
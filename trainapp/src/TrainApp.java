import java.util.*;

public class TrainApp {

    public static void main(String[] args) {

        // Header
        System.out.println("==================================");
        System.out.println("UC4 - Maintain Ordered Bogie Consist");
        System.out.println("==================================\n");

        // Create LinkedList
        List<String> trainConsist = new LinkedList<>();

        // Add bogies in sequence
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC Coach");

        // Insert bogie at specific position
        trainConsist.add(2, "Pantry"); // insert at index 2

        // Display after insertion
        System.out.println("After Adding & Inserting Bogies:");
        System.out.println(trainConsist + "\n");

        // Remove from front
        trainConsist.remove(0);

        // Remove from rear
        trainConsist.remove(trainConsist.size() - 1);

        // Display after removals
        System.out.println("After Removing Front & Rear Bogies:");
        System.out.println(trainConsist + "\n");

        // Final structure
        System.out.println("Final Train Consist:");
        System.out.println(trainConsist + "\n");

        // Completion message
        System.out.println("UC4 operations completed successfully...");
    }
}
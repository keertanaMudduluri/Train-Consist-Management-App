import java.util.*;

public class TrainApp {

    public static void main(String[] args) {

        // Header
        System.out.println("==================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("==================================\n");

        // Create Set to store unique bogie IDs
        Set<String> bogies = new HashSet<>();

        // Add IDs (including duplicates)
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // Duplicate entries (will be ignored)
        bogies.add("BG101");
        bogies.add("BG102");

        // Display all bogies
        System.out.println("Unique Bogie IDs:");
        System.out.println(bogies + "\n");

        // Display count
        System.out.println("Total Unique Bogies: " + bogies.size() + "\n");

        // Check existence
        System.out.println("Checking if 'BG101' exists:");
        System.out.println("Contains BG101?: " + bogies.contains("BG101") + "\n");

        // Completion message
        System.out.println("UC3 operations completed successfully...");
    }
}
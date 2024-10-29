import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CricketerScores {
    public static void main(String[] args) {
        // Create a Map to store cricketer names and their scores
        Map<String, Integer> cricketerScores = new HashMap<>();

        // Adding some cricketer names and scores
        cricketerScores.put("Virat Kohli", 12000);
        cricketerScores.put("Sachin Tendulkar", 18426);
        cricketerScores.put("Rohit Sharma", 9500);
        cricketerScores.put("MS Dhoni", 10773);
        cricketerScores.put("Brian Lara", 11953);

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a cricketer name to search
        System.out.print("Enter the cricketer's name to search for their score: ");
        String cricketerName = scanner.nextLine();

        // Search for the cricketer's score
        Integer score = cricketerScores.get(cricketerName);

        // Display the score or a message if the cricketer is not found
        if (score != null) {
            System.out.println("Score of " + cricketerName + ": " + score);
        } else {
            System.out.println("Cricketer " + cricketerName + " not found in the records.");
        }

        // Close the scanner
        scanner.close();
    }
}

}

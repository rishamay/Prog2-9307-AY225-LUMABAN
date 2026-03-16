// MP14 - Count keyword occurrences in CSV file

import java.io.*;
import java.util.*;

public class MP14_KeywordCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for dataset path
        System.out.print("Enter CSV file path: ");
        String filePath = scanner.nextLine();

        // Ask user for keyword
        System.out.print("Enter keyword to search: ");
        String keyword = scanner.nextLine().toLowerCase();

        int count = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = br.readLine()) != null) {

                // Convert to lowercase for case-insensitive search
                String lower = line.toLowerCase();

                if (lower.contains(keyword)) {
                    count++;
                }
            }

            br.close();

            System.out.println("\nKeyword '" + keyword + "' found in " + count + " rows.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program Finished.");
        scanner.close();
    }
}